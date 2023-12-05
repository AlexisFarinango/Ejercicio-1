public class Examen1 {
    private int edad;
    private String nombre;
    private String apellido;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void saludar(String nombre , String apellido, int edad){
        System.out.println("Hola estimado " + nombre + " " + apellido + " le informamos que su edad concuerda con lo mencionado por tanto tiene: " + edad + " años.");
    }


    public static void main(String[] args){
        Examen1 estudiante1 = new Examen1();
        Examen1 estudiante2 = new Examen1();
        Examen1 estudiante3 = new Examen1();
        estudiante1.saludar("Alexis","Farinango",23);
        estudiante2.saludar("Fernando","Perez",15);
        estudiante3.nombre = "Jorge";
        estudiante2.setNombre("Pablo");
        System.out.println(estudiante2.nombre);
        System.out.println("Hola mi nombre: " + estudiante3.getNombre());


    }
}

