public class Main3 extends Animal {
    public static void main(String[] args){
        Animal animal = new Animal();
        Perro perro = new Perro();
        Gato gato = new Gato();
        animal.hacerSonido();
        perro.hacerSonido();
        gato.hacerSonido();
    }

}
