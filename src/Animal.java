class Animal {
    public void hacerSonido() {
        System.out.println("Haciendo sonido genérico");
    }
}
class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Gua, gua");
    }
}
class Gato extends Animal{
    @Override //Permite traspasar la información de la clase padre a la clase hija
    public void hacerSonido(){
        System.out.println("Miauuuu, Miauuuu");
    }
}

