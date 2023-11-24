public class Practica {
    //Declaro los atributos
    public String nombre;
    public double tiempo;
    public String categoria;
    public int edad;
    //Metodo constructor
    public Practica(String _nombre,double _tiempo, String _categoria, int _edad){
        nombre = _nombre;
        tiempo = _tiempo;
        categoria = _categoria;
        edad = _edad;
    }
    //Metodos
    public void tablaposiciones(){
        System.out.println("Hola eres: "+nombre+" y tu categoria es: "+ categoria);
    }
    public void record(){
        System.out.println("Tu record es: "+tiempo);
    }
    public static void main(String[] args){
        Practica participante1 = new Practica("Feliks Zemdegs",4.73,"Cubo Rubick",22);
        Practica participante2 = new Practica("Maciej  Czapiewski",0.49,"Cubo de 2x2x2",18);
        Practica participante3 = new Practica("Kaijun Lin",18.50,"Cubo Rubick a Ciegas",20);
        participante2.tablaposiciones();
        participante2.record();
        participante1.tablaposiciones();
        participante1.record();
        participante3.tablaposiciones();
        participante3.record();
    }
}
