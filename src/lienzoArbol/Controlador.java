
package lienzoarbol;

import binarySearch.binarySearchTree;

public class Controlador {
    private Lienzo objLienzo; //VISTA
    private binarySearchTree objArbol; //MODELO

    public Controlador(Lienzo objLienzo, binarySearchTree objArbol) {
        this.objLienzo = objLienzo;
        this.objArbol = objArbol;
    }
    
    public void iniciar() {
        objLienzo.setObjArbol(objArbol);
    }
}
