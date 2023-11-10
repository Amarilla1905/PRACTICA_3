package binarySearch;
//@author crisc

import ED.NodeBTree;

 

public class bstEntry<t> extends NodeBTree {
    
    private t data;
    private int k;
   
    public bstEntry(t data, int k) {
        this.data = data;
        this.k = k;
    }
    
    
    @Override
    public t getData(){
        
        return data;
    }
    
    public int getKey(){
        return k;
    }

   

    public void setK(int k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return  "[" +data+ ", k:"+ k + ']';
    }
    
    
    
    
    
    
    
    
    
    
}
