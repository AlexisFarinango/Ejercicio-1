public class Futbol {
    public String estilo;
    public int numjugadores;
    public Futbol(String estilo, int numjugadores){
        this.estilo = estilo;
        this.numjugadores = numjugadores;
    }
    public static void correr(){
        System.out.println("Recorido 200 metros");
    }
    public static void main(String[] args){
       correr();

    }
}
