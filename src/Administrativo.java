public class Administrativo extends Persona {
    public int Codempleado;
    public String departamento;

    public Administrativo(String nombre, int edad,int dni,int Codempleado,String departamento){
        super(nombre,edad,dni);
        this.Codempleado = Codempleado;
        this.departamento = departamento;
    }
    public void mostrarinformacion(String nombre, int edad, int dni, int Codempleado, String departamento){
        //super.mostrarinformacion();
        System.out.printf("El codigo del empleado es: %d  y el departamento es: %s",Codempleado,departamento);
    }

    //public class Principal{

    //}

}
