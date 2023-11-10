package ordenamientoAB;
//@author crisc

import ED.NodeBTree;
import arboles.BinaryTree;

 

public class OrderTree<t>{
    
    public void visit(NodeBTree<t> node, int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("    "); // Imprimir espacios proporcionales al nivel
        }
        System.out.println(node.getData()); // Imprimir el contenido del nodo
        // Aquí puedes realizar otras acciones según tus necesidades
    }

    public void preOrder(BinaryTree<t> T, NodeBTree<t> v, int level) {
        if (T != null) {
            visit(v, level); // Realiza la acción específica en el nodo visitado

            if (T.hasLeft(v)) {
                preOrder(T, T.left(v), level + 1); // Recorre el subárbol izquierdo
            }
            if (T.hasRight(v)) {
                preOrder(T, T.right(v), level + 1); // Recorre el subárbol derecho
            }
        }
    }

    public void inOrder(BinaryTree<t> T, NodeBTree<t> v, int level) {
        if (T.hasLeft(v)) {
            inOrder(T, T.left(v), level + 1); // Recorre el subárbol izquierdo con un nivel incrementado
        }
        visit(v, level); // Realiza la acción específica en el nodo visitado
        if (T.hasRight(v)) {
            inOrder(T, T.right(v), level + 1); // Recorre el subárbol derecho con un nivel incrementado
        }
    }

    public void posOrder(BinaryTree<t> T, NodeBTree<t> v, int level) {
        if (T.hasLeft(v)) {
            posOrder(T, T.left(v), level + 1); // Recorre el subárbol izquierdo con un nivel incrementado
        }
        if (T.hasRight(v)) {
            posOrder(T, T.right(v), level + 1); // Recorre el subárbol derecho con un nivel incrementado
        }
        visit(v, level); // Realiza la acción específica en el nodo visitado después de recorrer los hijos
    }

}
