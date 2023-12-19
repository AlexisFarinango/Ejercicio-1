public class Main2 extends Persona2 {
    public static void main(String[] args){
        Main2 persona1 = new Main2();
        persona1.nombre = "Alexis";
        persona1.setNumTarjetaBanco(1714);
        System.out.println("Hola, el nombre es: "+persona1.nombre+" Minúmero de tarjeta es: "+persona1.getNumTarjetaBanco());
    }
}
