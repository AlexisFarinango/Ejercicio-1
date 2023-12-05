public class Juego2 {
    private String titulo;
    private  String apellido;
    private int numjugadores;
    private int anio;


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getTitulo(){
        return titulo;
    }


    public static void main(String[] arg){
        Juego2 jugador1 = new Juego2();
        jugador1.titulo = "Fernando";
        jugador1.apellido = "de la Cruz";
        System.out.print(jugador1.getTitulo());
        System.out.print(jugador1.apellido);
        jugador1.setTitulo("Fabian");
        jugador1.setApellido("Ordoñez");
        System.out.print(jugador1.getTitulo());
        System.out.print(jugador1.apellido);


    }
}
