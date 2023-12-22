import java.util.Scanner;
public class Arreglo {
    public static void main(String[] args){
        Scanner datos = new Scanner(System.in);
        System.out.println("Cuantos valores desea ingresar: ");
        int num = datos.nextInt();
        int vector[];
        vector = new int[num];
        for (int i=0; i<num;i++){
            System.out.print("Ingrese el valor de la posicion "+i+" :");
            int datito = datos.nextInt();
            vector[i] = datito;
        }
        for(int i=0;i<num;i++){
            System.out.print(vector[i]);
        }
    }

}
