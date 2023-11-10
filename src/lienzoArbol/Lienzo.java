/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lienzoarbol;

import ED.NodeBTree;
import binarySearch.binarySearchTree;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author daniel
 */
public class Lienzo extends JPanel {
    private binarySearchTree objArbol;
    public static final int DIAMETRO = 30;
    public static final int RADIO = DIAMETRO / 2;
    public static final int ANCHO = 50;

    public void setObjArbol(binarySearchTree objArbol) {
        this.objArbol = objArbol;
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        pintar(g, getWidth() / 2, 20, objArbol.Root());
    }
    
    private void pintar(Graphics g, int x, int y, NodeBTree n) {
        if (n == null){
        }
        else {
            int EXTRA = n.nodosCompletos(n) * (ANCHO / 2);
            g.drawOval(x, y, DIAMETRO, DIAMETRO);
            g.drawString(n.getData().toString(), x + 12, y + 18);
            if (n.getLeft() != null){
                
                g.drawLine(x + RADIO, y + RADIO, x - ANCHO - EXTRA + RADIO, y + ANCHO + RADIO);
            }if(n.getRight() != null){    
                 g.drawLine(x + RADIO, y + RADIO, x + ANCHO + EXTRA + RADIO, y + ANCHO + RADIO);
            }
            pintar(g,x - ANCHO- EXTRA, y + ANCHO, n.getLeft());
            pintar(g,x + ANCHO + EXTRA, y + ANCHO, n.getRight());
        }
    }
}
