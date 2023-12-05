public class Banco {
    public int cedula;
    public String nombre;
    public Banco(int cedula, String nombre){
        this.cedula = cedula;
        this.nombre = nombre;
    }
    public void registrar_usuario(){
        System.out.printf("Datos Personales: \n Cedula: %d\n Nombre: %s \n",cedula,nombre);
    }
    public void r_cuenta_bancaria(){
        System.out.println("Cuenta Resgistrada con Exito");
    }
    public static void main(String[] args){
        Banco user1 = new Banco(1752573384,"Alexis");
        user1.registrar_usuario();
        user1.r_cuenta_bancaria();
    }
}
