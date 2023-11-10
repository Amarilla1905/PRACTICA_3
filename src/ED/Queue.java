package ED;

// @author crisc


import java.io.Serializable;


public class Queue<t> implements Serializable   {

    protected list<t> data;

    public Queue(){
        data = new list();
    }

    
    
    public int size(){
        return data.size();
    }
    
    public Boolean isEmpty(){
        return size() == 0;
    }
    
    //---------------------Metodos--------------------------
    public void enqueue(t e){
        data.addLast(e);
    }
    
    public t dequeue() {
        if (isEmpty()) {
            System.out.println("Cola vacía!");
            return null;
        } else {
            t n = data.First().getData();
            data.removeFirst();
            return n;
        }
    }

    public t first() {
        t n = data.First().getData();
         if (isEmpty()){
             System.out.println("no existe!");
            return null;
        } else{
             System.out.println(n);
            return data.First().getData();
        }
    }
    
    public Object getfirst(){
        
         if (!isEmpty()){
             return data.First();
        } else{
            return null;
        }
    }
    
    public void getSize(){
        System.out.println(+data.size());
    }
    
    
    
    
    
    
    
    
    
    
    
}
