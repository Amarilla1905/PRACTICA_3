package ED.LD;
// @author crisc

import java.io.Serializable;



// @author crisc

public class DoubleNode<t> implements Serializable {

    private Object data;
    private DoubleNode<t> next;
    private DoubleNode<t> prev;

    public DoubleNode() {
        data = null;
        prev = null;
        next = null;
    }

    public DoubleNode(Object d) {
        data = d;
        prev = null;
        next = null;
    }

    public void setData(Object d) {
        data = d;
    }

    public void setNext(DoubleNode<t> n) {
        next = n;
    }

    public void setPrev(DoubleNode<t> p) {
        prev = p;
    }

    public Object getData() {
        return data;
    }

    public DoubleNode<t> getNext() {
        return next;
    }

    public DoubleNode<t> getPrev() {
        return prev;
    }
    
    
}
