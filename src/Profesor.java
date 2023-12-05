public class Profesor {
    public int Codempleado;
    public String MateriaAsignada;

    public Profesor(String nombre, int edad,int dni,int Codempleado,String MateriaAsignada){
        //super(nombre,edad,dni);
        this.Codempleado = Codempleado;
        this.MateriaAsignada = MateriaAsignada;
    }
    public void mostrarinformacion(String nombre, int edad, int dni, int Codempleado, String MateriaAsignada){
        //super.mostrarinformacion();
        System.out.printf("El codigo del profesor es: %d  y la materia asignada es: %s",Codempleado,MateriaAsignada);
    }
}
