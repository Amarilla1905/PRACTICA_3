
import binarySearch.binarySearchTree;
import javax.swing.JFrame;
import lienzoarbol.Controlador;
import lienzoarbol.Lienzo;
import ordenamientoAB.OrderTree;
import usuario.Usuario;


// @author crisc


public class Main {

    
    public static void main(String[] args) {
        binarySearchTree<Usuario> arbol = new binarySearchTree<>();
        Lienzo objLienzo = new Lienzo(); //VISTA
        Lienzo objLienzo2 = new Lienzo(); //VISTA
        Controlador objControlador = new Controlador(objLienzo, arbol); //CONTROLADOR 
       
        //String nombre, int cedula
        Usuario usu = new Usuario("Cristian", 5);
        Usuario usu2 = new Usuario("Cristian", 4);
        Usuario usu3 = new Usuario("Fernando", 1);
        Usuario usu4 = new Usuario("Carlos", 7);
        Usuario usu5 = new Usuario("Pablo", 9);
        Usuario usu6 = new Usuario("Sara", 6);
        Usuario usu7 = new Usuario("Camila", 3);
        Usuario usu8 = new Usuario("Lucia", 0);
        Usuario usu9 = new Usuario("Sebastian", 2);
        Usuario usu10 = new Usuario("alejandro", 91);
        
      
        
        
        arbol.insert(usu, usu.getKey());
        arbol.insert(usu2, usu2.getKey());
        arbol.insert(usu3, usu3.getKey());
        arbol.insert(usu4, usu4.getKey());
        arbol.insert(usu5, usu5.getKey());
        arbol.insert(usu6, usu6.getKey());
        arbol.insert(usu7, usu7.getKey());
        arbol.insert(usu8, usu8.getKey());
        arbol.insert(usu9, usu9.getKey());
        arbol.insert(usu10, usu10.getKey());
        
        OrderTree Order = new OrderTree();
        
        Order.inOrder(arbol, arbol.Root(), 0);
        System.out.println(" ");
        //System.out.println(arbol.find(7));
        
       
        //= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        // PINTAR ARBOL
      
        objControlador.iniciar();
        //= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        //MOSTRAR LIENZO EN UNA VENTANA TODO
        JFrame ventana = new JFrame();
        ventana.getContentPane().add(objLienzo);
        ventana.setDefaultCloseOperation(3);
        ventana.setSize(600, 600);
        ventana.setVisible(true);
        
        
        
        
        

        //arbol.remove(); faltan ajustes a este metodo ayuda hahah
        
    
        System.out.println(" ");
        Order.inOrder(arbol, arbol.Root(), 0);
        
        System.out.println("");
    
        System.out.println( arbol.find(6));
        System.out.println("maximo valor");
        System.out.println(arbol.findMaxValue());
        System.out.println("Minimo valor");
        System.out.println(arbol.findMinValue());
    
    }
}
