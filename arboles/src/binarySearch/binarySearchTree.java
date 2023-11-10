package binarySearch;
//@author crisc

import ED.NodeBTree;
import arboles.BinaryTree;

public class binarySearchTree<t> extends BinaryTree {

    public binarySearchTree() {
        super();
    }

    public NodeBTree find(int k) {

        return searchTree(k, root);
    }

    public NodeBTree searchTree(int k, NodeBTree v) {
        bstEntry u = (bstEntry) v.getData();

        if (k == u.getKey()) {
            return v;
        } else if (k < u.getKey()) {
            return searchTree(k, v.getLeft());
        } else {
            return searchTree(k, v.getRight());
        }
    }

    public void insert(t e, int k) {
        bstEntry<t> O = new bstEntry<>(e, k);
        if (isEmpty()) {
            super.addRoot(O);
        } else {
            addEntry(root, O);
        }
    }

    public t remove(int k) {
        NodeBTree<t> v = find(k);
        if (v == null) {
            return null; // Si el nodo con la clave k no existe, retornar null o lanzar una excepción según tu lógica
        }

        t temp = v.getData(); // Guardar el valor del nodo a eliminar

        if (isLeaf(v)) {
            removeLeafNode(v);
        } else if (hasLeft(v) && hasRight(v)) {
            NodeBTree<t> predecessor = predecessor(v);
            v.setData(predecessor.getData());
            remove(predecessor);
        } else {
            replaceWithChildNode(v);
        }

        return temp; // Retornar el valor del nodo eliminado
    }

    private void removeLeafNode(NodeBTree<t> v) {
        NodeBTree<t> parent = parent(v);
        if (isRoot(v)) {
            root = null; // Si es la raíz, simplemente lo eliminamos
        } else {
            if (left(parent) == v) {
                parent.setLeft(null); // Si es un nodo hoja a la izquierda, eliminamos la referencia
            } else {
                parent.setRight(null); // Si es un nodo hoja a la derecha, eliminamos la referencia
            }
        }
        size--; // Reducir el tamaño del árbol
    }

    private void replaceWithChildNode(NodeBTree<t> v) {
        NodeBTree<t> child = (hasLeft(v)) ? left(v) : right(v);
        NodeBTree<t> parent = parent(v);
        if (isRoot(v)) {
            root = child; // El nodo a eliminar es la raíz
        } else {
            if (left(parent) == v) {
                parent.setLeft(child);
            } else {
                parent.setRight(child);
            }
        }
        if (child != null) {
            child.setParent(parent); // Establecer el padre del hijo
        }
        size--; // Reducir el tamaño del árbol
    }


    public void addEntry(NodeBTree v, bstEntry<t> O) {
        bstEntry temp = (bstEntry) v.getData();
        NodeBTree nD = new NodeBTree(O);
        if (O.getKey() < temp.getKey()) {
            if (hasLeft(v)) {
                addEntry(left(v), O);
            } else {
                v.setLeft(nD);
            }
        } else {
            if (hasRight(v)) {
                addEntry(right(v), O);
            } else {
                v.setRight(nD);
            }
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    public t removeBST(int k) {
    NodeBTree<t> v = find(k);
    if (v == null) {
        return null; // Si el nodo con la clave k no existe, retornar null o lanzar una excepción según tu lógica       +
    }

    t temp = v.getData(); // Guardar el valor del nodo a eliminar                                                       +

    if (isLeaf(v)) {
        removeLeafNode(v);
    } else if (hasLeft(v) && hasRight(v)) {
        NodeBTree<t> predecessor = predecessor(v); //                                                                   +
        v.setData(predecessor.getData());
        remove(predecessor);
    } else {
        replaceWithChildNode(v);
    }

    return temp; // Retornar el valor del nodo eliminado                                                                +
}
//----------------------------------------------------------------------------------------------------------------------
    
    public t findMaxValue() {
        NodeBTree<t> maxNode = findMaxNode(root);
        return (maxNode != null) ? maxNode.getData() : null;
    }

    private NodeBTree<t> findMaxNode(NodeBTree<t> v) {
        if (v == null) {
            return null;
        }

        if (hasRight(v)) {
            return findMaxNode(right(v)); // Si hay un nodo a la derecha, continúa la búsqueda
        }

        return v; // Si no hay más nodos a la derecha, es el nodo con el valor máximo
    }

    public t findMinValue() {
        NodeBTree<t> minNode = findMinNode(root);
        return (minNode != null) ? minNode.getData() : null;
    }

    private NodeBTree<t> findMinNode(NodeBTree<t> v) {
        if (v == null) {
            return null;
        }

        if (hasLeft(v)) {
            return findMinNode(left(v)); // Si hay un nodo a la izquierda, continúa la búsqueda
        }

        return v; // Si no hay más nodos a la izquierda, es el nodo con el valor mínimo
    }

    
 
    
    
    
    
    private NodeBTree predecessor(NodeBTree v) {
        NodeBTree temp = v.getLeft();
        return maxNode(temp);
    }

    private NodeBTree maxNode(NodeBTree temp) {
        if (hasRight(temp)) {
            return maxNode(right(temp));
        } else {
            return temp;
        }
    }

}
