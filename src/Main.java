/*El codigo trata de crear la clase computadoras, con los atributos Marca, Numero de Serie y Modelo que tenga la accion
* de Apagar y Prender, luego creamos los objetos que son las diferentes Maquinas y por ultimo creamos la herencia con la clase Basica*/
class Computadora{
    /*Atributos*/
    String Marca;
    int Numeroserie;
    String Modelo;
    /*Metodos*/
    public void Encender(){
        System.out.println("El computador se esta encendiendo");
    }
    public void Apagar() {
        System.out.println("El computador se esta Apagando");
    }
}
/*Herencia*/
class Basica extends Computadora{
    String Diseno;
}





public class Main {
    public static void main(String[] args){
        /*Creacion del objeto*/
        Computadora Maquina1 = new Computadora();
        Maquina1.Marca = "Dell";
        Maquina1.Numeroserie = 12348;
        Maquina1.Modelo = "XYZ";
        System.out.printf("Maquina %d: ",1);
        Maquina1.Encender();

        Computadora Maquina2 = new Computadora();
        Maquina2.Marca = "HP";
        Maquina2.Numeroserie= 78965;
        Maquina2.Modelo = "OptiPlex7070";
        System.out.printf("Maquina %d: ",2);
        Maquina2.Apagar();

        Basica Maquina3 = new Basica();
        Maquina3.Marca = "Toshiba";
        Maquina3.Modelo = "weq";
        Maquina3.Numeroserie = 87932;
        Maquina3.Diseno = "basico";
        System.out.printf("Maquina %d: %s ",3 , Maquina3.Marca);
    }
}