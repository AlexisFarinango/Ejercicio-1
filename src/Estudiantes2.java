public class Estudiantes2 {
    private String nombre;
    private int edad;

    public Estudiantes2(String nombre,int edad ){ //permite inicializar los atributos
        this. nombre = nombre;
        this. edad = edad;
        //this es necesario para diferenciar entre el parametro y el atributo
        //el de la izquierda es parametro y derecha atributo
        /*
        public Estudiantes2(String _nombre,int _edad ){ //permite inicializar los atributos
        this. nombre = _nombre;
        this. edad = _edad;
         */
    }
    //metodo getter y setter
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void saludar (){
        System.out.println("Hola: "+nombre);
        System.out.println("Edad: "+edad);
    }
    public static void main(String[] args){
        Estudiantes2 estudianteuno = new Estudiantes2("Pedro",19);
        estudianteuno.saludar();
    }
}
