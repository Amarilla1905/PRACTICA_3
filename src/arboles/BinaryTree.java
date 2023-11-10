package arboles;
//@author crisc

import ED.*;

import java.io.Serializable;

public class BinaryTree<t> implements Serializable {

    protected NodeBTree<t> root;
    protected int size;

    public BinaryTree() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Boolean isEmpty() {
        return root == null;
    }

    public Boolean hasLeft(NodeBTree v) {
        return v.getLeft() != null;
    }

    public Boolean hasRight(NodeBTree v) {
        return v.getRight() != null;
    }

    public Boolean isRoot(NodeBTree v) {
        return v == root;
    }
   
    public Boolean isLeaf(NodeBTree v) {
        return v != null && v.getLeft() == null && v.getRight() == null;
    }

    public Boolean isInternal(NodeBTree v) {
        return hasLeft(v) || hasRight(v);
    }

    
    
    //acceso a nodos
    public NodeBTree<t> Root() {
        return root;
    }

    public NodeBTree<t> left(NodeBTree<t> v) {
        return v.getLeft();
    }

    public NodeBTree<t> right(NodeBTree<t> v) {
        return v.getRight();
    }
    
    public int max(int a, int b) {
        return a > b ? a : b;
    }
    

    public NodeBTree parent(NodeBTree v) {
        if (isRoot(v)) {
            return null;
        } else {
            Queue Q = new Queue();
            Q.enqueue(root);
            NodeBTree temp = root;
            while (!Q.isEmpty() && left((NodeBTree) Q.first()) != v && temp.getRight() != v) {
                temp = (NodeBTree) Q.dequeue();
                if (hasLeft(temp)) {
                    Q.enqueue(left(temp));
                }
                if(hasRight(temp)){
                    Q.enqueue(right(temp));                
                }
            }
            return temp;
        }
    }

    public int depth(NodeBTree v) {
        if (isRoot(v)) {
            return 0;
        } else {
            return 1 + depth(parent(v));
        }
    }
    
    public int heigth(NodeBTree v){
        if (!isInternal(v)){
            return 0;
        } else {
            int h = 0;
            h = max(heigth(left(v)),heigth(right(v)));
            return 1+h;
        }
    }
    
    //Recursivo
    public void addRoot(t e){
        root = new NodeBTree<>(e);
        size = 1;
    }
    
    public void insertLeft(NodeBTree v, t e){
        NodeBTree left = new NodeBTree<>(e);
        v.setLeft(left);
        size++;
    }
    
    public void insertRight(NodeBTree v, t e){
        NodeBTree right = new NodeBTree<>(e);
        v.setRight(right);
        size++;
    }

    public void remove(NodeBTree v) {
        NodeBTree p = parent(v);
        if (hasLeft(v) || hasRight(v)) {
            if (hasLeft(v)) {
                NodeBTree child = left(v);
            } else {
                NodeBTree child = right(v);
            }
            if (left(p) == v) {
                
            }
        }
    }


    
     public void displayTree() {
        System.out.println("Árbol binario:");
        displayTreeHelper(root, 0);
    }

    // Método auxiliar para el recorrido con espaciado por niveles
    private void displayTreeHelper(NodeBTree<t> node, int level) {
        if (node != null) {
            displayTreeHelper(node.getRight(), level + 1); // Recorre el subárbol derecho

            for (int i = 0; i < level; i++) {
                System.out.print("    "); // Espaciado para el nivel
            }
            System.out.println(node.getData()); // Imprime el elemento

            displayTreeHelper(node.getLeft(), level + 1); // Recorre el subárbol izquierdo
        }
    }

    
    
    

}
