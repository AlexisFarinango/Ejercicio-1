public class Clase21noviembre {
    public int cedula;
    public String nombre;
    public int edad;

    public Clase21noviembre (int cedula, String nombre, int edad){//el metodo constructor es importante cuando se le asigna paramteros al objeto
        this. cedula = cedula;
        this. nombre = nombre;
        this. edad = edad;
    }
    public void saludar(){
        System.out.println("Hola "+nombre);
    }
    public static void main(String[] args){
        Clase21noviembre persona1 = new Clase21noviembre(1752573384,"Alexis",22);
        Clase21noviembre persona2 = new Clase21noviembre(1712386091,"Cesar",35);
        Clase21noviembre persona3 = new Clase21noviembre(1713921334,"Maria",38);
        System.out.printf("El señor %s tiene N° cedula %d y la edad de %d \n",persona1.nombre,persona1.cedula,persona1.edad);
        System.out.printf("El señor %s tiene N° cedula %d y la edad de %d\n",persona2.nombre,persona2.cedula,persona2.edad);
        System.out.printf("El señor %s tiene N° cedula %d y la edad de %d\n",persona3.nombre,persona3.cedula,persona3.edad);
        persona1.saludar();
        persona2.saludar();
        persona3.saludar();


    }

}
