/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import binarySearch.binarySearchTree;
import javax.swing.JFrame;
import lienzoarbol.Controlador;
import lienzoarbol.Lienzo;
import usuario.Usuario;

/**
 *
 * @author Usuario
 */
public class PrintABB extends javax.swing.JFrame {

    private binarySearchTree arbol;  // Variable de instancia para el árbol
     
    public PrintABB() {
        initComponents();
        arbol = new binarySearchTree();  // Inicializar el árbol en el constructor
        Lienzo lienzo = new Lienzo(); // Inicializar el lienzo en el constructor
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        B_Ingresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        B_Graficar = new javax.swing.JMenu();
        B_Mostrar_Grafica = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        B_Preorder = new javax.swing.JMenuItem();
        B_Inorder = new javax.swing.JMenuItem();
        B_Postorder = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre:");

        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        B_Ingresar.setText("Ingresar");
        B_Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_IngresarActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Cedula");

        txtCedula.setForeground(new java.awt.Color(0, 0, 0));
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Ingreso de datos para generar el arbol binario de busqueda");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(94, 94, 94)
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(162, 162, 162))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(B_Ingresar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel2)
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(B_Ingresar)
                .addGap(55, 55, 55))
        );

        B_Graficar.setText("Grafica del árbol");

        B_Mostrar_Grafica.setText("B_Mostrar_Grafica");
        B_Mostrar_Grafica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_Mostrar_GraficaActionPerformed(evt);
            }
        });
        B_Graficar.add(B_Mostrar_Grafica);

        jMenuBar1.add(B_Graficar);

        jMenu2.setText("Recorridos");

        B_Preorder.setText("Preorder");
        B_Preorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_PreorderActionPerformed(evt);
            }
        });
        jMenu2.add(B_Preorder);

        B_Inorder.setText("Inorder");
        B_Inorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_InorderActionPerformed(evt);
            }
        });
        jMenu2.add(B_Inorder);

        B_Postorder.setText("Postorder");
        B_Postorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_PostorderActionPerformed(evt);
            }
        });
        jMenu2.add(B_Postorder);

        jMenuBar1.add(jMenu2);

        jMenu7.setText("Salir");
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu7MouseClicked

    private void B_IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_IngresarActionPerformed
     // Obtener los datos ingresados en la interfaz
    String nombre = txtNombre.getText();
    long cedula = Long.parseLong(txtCedula.getText());

    // Crear un nuevo usuario
    Usuario nuevoUsuario = new Usuario(nombre, (int) cedula);

    // Agregar el usuario al árbol
    arbol.insert(nuevoUsuario, nuevoUsuario.getKey());
    // Imprimir la clave generada por el método getKey()
    System.out.println("Clave generada: " + nuevoUsuario.getKey());

    // Limpiar los campos de texto después de ingresar los datos
    txtNombre.setText("");
    txtCedula.setText("");

    // Actualizar la interfaz gráfica para mostrar el árbol actualizado
    }//GEN-LAST:event_B_IngresarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void B_PreorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_PreorderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_PreorderActionPerformed

    private void B_InorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_InorderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_InorderActionPerformed

    private void B_PostorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_PostorderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_B_PostorderActionPerformed

    private void B_Mostrar_GraficaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_Mostrar_GraficaActionPerformed
        // Crear una instancia de la clase Lienzo
        Lienzo lienzo = new Lienzo();
        Controlador objControlador = new Controlador(lienzo, arbol); //CONTROLADOR 

        // Establecer el objeto objArbol con el árbol que deseas mostrar
        lienzo.setObjArbol(arbol);  // Asegúrate de reemplazar 'tuArbol' con tu objeto árbol binario

        // Hacer visible la instancia de Lienzo
        lienzo.setVisible(true);
        
        // PINTAR ARBOL
      
        objControlador.iniciar();
        //= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
        //MOSTRAR LIENZO EN UNA VENTANA TODO
        JFrame ventana = new JFrame();
        ventana.getContentPane().add(lienzo);
        ventana.setDefaultCloseOperation(3);
        ventana.setSize(600, 600);
        ventana.setVisible(true);
    }//GEN-LAST:event_B_Mostrar_GraficaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrintABB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintABB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintABB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintABB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintABB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu B_Graficar;
    private javax.swing.JButton B_Ingresar;
    private javax.swing.JMenuItem B_Inorder;
    private javax.swing.JMenuItem B_Mostrar_Grafica;
    private javax.swing.JMenuItem B_Postorder;
    private javax.swing.JMenuItem B_Preorder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}