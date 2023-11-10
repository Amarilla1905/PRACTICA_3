package usuario;

import java.io.Serializable;
//import java.util.Random;

public class Usuario implements Comparable<Usuario>, Serializable {
    
    private String nombre;
    private int cedula;
    private int key;

    public Usuario(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        
    }
    
    @Override
    public int compareTo(Usuario otroUsuario) {
        // Implementa la comparación basada en la clave generada por getKey()
        return Integer.compare(this.getKey(), otroUsuario.getKey());
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getKey() {
        
        int cedula1 = this.getCedula();
        int sumaDigitos = 0;

        // Sumar los dígitos de la cédula
        while (cedula1 != 0) {
            sumaDigitos += cedula1 % 10; // Obtener el último dígito y sumarlo
            cedula1 = cedula1 / 10; // Eliminar el último dígito
        }

        this.setKey(sumaDigitos); // Asignar la suma de los dígitos como la clave (key)
        return sumaDigitos; // Devolver la suma de los dígitos
    }

    public void setKey(int key) {
        this.key = key;
    }
        

    @Override
    public String toString() {
        return "" + "" + nombre + ", " + cedula + "";
    }
   

   

   
  

  

    
}
