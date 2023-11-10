package ED;

// @author crisc

import java.io.Serializable;



public class list<tipo> implements Serializable{

    protected Node<tipo> head;
    protected Node<tipo> tail;
    protected int size;

    public list() {
        head = null;
        tail = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public Boolean isEmpty() {
        return size == 0;
    }

    public void setSize(int s) {
        size = s;
    }

    public Node<tipo> First() {
        return head;
    }

    public Node<tipo> Last() {
        return tail;
    }

    //------Metodos
    public void addFirst(tipo e) {
        Node<tipo> n = new Node(e);
        if (isEmpty()) {
            head = n;
            tail = n;
        } else {
            n.setNext(head);
            head = n;
        }

        size++;

    }

    public void addLast(tipo e) {
        Node<tipo> n = new Node(e);
        if (isEmpty()) {
            head = n;
            tail = n;
        } else {
            tail.setNext(n);
            tail = n;
        }
        size++;
    }

    public Object removeFirst() {

        if (!isEmpty()) {
            Node<tipo> temp;
            temp = head;

            head = temp.getNext();
            temp.setNext(null);
            size--;
            System.out.println(temp.getData());
            return temp.getData();
        } else {
            return null;
        }

    }

    public Object removeLast() {

        if (size == 1) {
            removeFirst();
        } else {
            Node<tipo> temp = tail;
            Node<tipo> anterior = head;

            while (anterior.getNext() != tail) {
                anterior = anterior.getNext();
                anterior.setNext(null);
                tail = anterior;
                size--;
            }
            return temp.getData();
        }
        return "-";
    }

    //------------------------------------------------------------
    public void mostrarLista() {

        Node aux = head;
        while (aux != null) {

            System.out.println("[" + aux.getData() + "]" + "->");
            aux = aux.getNext();

        }
        System.out.println("");

    }

    public void mitadLista() {
        //encuentra la mitad de la lista enlasada simple
        Node aux = head;
        Node temp = head;
        int cont = 0;

        while (aux != null) {
            if (temp.getNext() != null) {
                for (int i = 0; i < cont*2; i++) {
                    if ( temp.getNext() != null){
                       temp = temp.getNext(); 
                    }
                }
                System.out.println(temp.getData());
                aux = aux.getNext();
            } else {
                System.out.println("la mitad es: " + aux.getData());
                break;
            }
            cont++;
            //System.out.println(cont);
        }
    }
    
    
    

}
