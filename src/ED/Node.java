package ED;

// @author crisc

import java.io.Serializable;



// @author crisc
public class Node<tipo> implements Serializable {
    
    private tipo data;
    private Node<tipo> next;

    public Node() {
        data = null;
        next = null;
    }
    
    public Node(tipo e){
        data = e;
        next = null;
    }
    //-----Getters
    public tipo getData() {
        return data;
    }

    public Node<tipo> getNext() {
        return next;
    }
    //----Setters

    public void setData(tipo e) {
        this.data = e;
    }

    public void setNext(Node<tipo> n) {
        this.next = n;
    }
    
    
    
    

}
