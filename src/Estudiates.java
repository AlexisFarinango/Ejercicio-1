import java.awt.desktop.SystemEventListener;
import java.net.spi.InetAddressResolver;

public class Estudiates {
        //Atributos
        public String nombre;
        public int edad;
    public Estudiates(String nombre, int edad){
        //Asignacion de la variable a traves de los parametros
        this. nombre = nombre; /*el de la derecha es el parametro*/
        this. edad =  edad;

    }
        //Metodo
        public void saludar(){
            System.out.println("NOMBRE: "+ nombre);
            System.out.println("EDAD: "+ edad);
        }
        public static void main(String[] args){
            Estudiates estudiante_desarrollo = new Estudiates("jhon",15);
            estudiante_desarrollo.saludar();
        }


}
