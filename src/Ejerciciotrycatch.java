import java.util.Scanner;
public class Ejerciciotrycatch {
    public static void main(String[] args){
        try{
            int multi = 5;
            double total;
            System.out.println("Hello and welcome!");
            System.out.println("Ingres el primer numero: ");
            Scanner numero = new Scanner(System.in);
            double numero1 = numero.nextDouble();
            total = multi*numero1;
            System.out.println("El numero multiplicado por 5 es: "+total);
        }catch(Exception e){
            System.out.println("Ingrese un numero no un caracter");
        }
    }
}
