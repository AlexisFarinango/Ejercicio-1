public class Estudiante extends Persona {
    public int matricula;
    public String carrera;

    public Estudiante(String nombre, int edad,int dni,int matricula,String carrera){
        super(nombre,edad,dni);
        this.matricula = matricula;
        this.carrera = carrera;
    }
    public void mostrarinformacion(String nombre, int edad, int dni, int matricula, String carrera){
        //super.mostrarinformacion();
        System.out.printf("La matricula es: %d  y la carrera es: %s",matricula,carrera);
    }
}
