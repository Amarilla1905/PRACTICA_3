package ED;

// @author crisc

import java.io.Serializable;



// @author crisc
public class NodeBTree<t> implements Serializable {
    
    private t data;
    private NodeBTree<t> parent;
    private NodeBTree<t> left;
    private NodeBTree<t> right;

   

   
    
    public NodeBTree() {
        data = null;
        left = null;
        right = null;
    }
    
    public NodeBTree(t e){
        data = e;
        left = null;
        right = null;
    }
    //-----Getters

    public t getData() {
        return data;
    }

    public NodeBTree<t> getParent() {
        return parent;
    }

    public NodeBTree<t> getLeft() {
        return left;
    }

    public NodeBTree<t> getRight() {
        return right;
    }
   
    
    
   
    
    
    //----Setters

    public void setData(t data) {
        this.data = data;
    }

    public void setParent(NodeBTree<t> parent) {
        this.parent = parent;
    }

    public void setLeft(NodeBTree<t> left) {
        this.left = left;
    }

    public void setRight(NodeBTree<t> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "NodeBTree{" + "data=" + data  + '}';
    }

   
    
       
    public int nodosCompletos(NodeBTree n) {
        if (n == null)
            return 0;
        else {
            if (n.getLeft() != null && n.getRight() != null)
                return nodosCompletos(n.getLeft()) + nodosCompletos(n.getRight()) + 1;
            return nodosCompletos(n.getLeft()) + nodosCompletos(n.getRight());
        }
    }
    
    

}
