public class Persona {
    public int dni;
    public String nombre;
    public int edad;
    public Persona(String nombre, int edad, int dni){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    public void mostrarinformacion(String nombre, int edad,int dni){
        System.out.printf("Nombre es: %s la edad es: %d y su DNI es: %d",nombre,edad,dni);
    }

}
