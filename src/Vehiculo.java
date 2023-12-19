public class Vehiculo {
    public void acelerar(){
        System.out.println("Acelerando de manera generica");
    }
}
class Coche extends Vehiculo{
    @Override
    public void acelerar() {
        System.out.println("El carrito acelera gud");
    }
}
class Bicicleta extends Vehiculo{
    @Override
    public void acelerar(){
        System.out.println("Hay que pedalear para acelerar");
    }
}
class Avion extends Vehiculo{
    @Override
    public void acelerar(){
        System.out.println("El avión acelera y luego despega");
    }
}
