public class Operacionesmatematicas {
    public int numero1;
    public  int numero2;
    public int numero3;
    public double numero4;
    public double numero5;
    public void opsuma(int numero1, int numero2){
        int suma;
        suma = numero1 + numero2;
        System.out.printf("El resultado de la suma de %d y %d es %d \n",numero1,numero2,suma);
    }
    public void opsuma(int numero1,int numero2, int numero3){
        int suma2;
        suma2 = numero1+numero2+numero3+5;
        System.out.printf("El resultado de la siguiente suma es: %d + %d + %d + 5 = %d \n",numero1,numero2,numero3,suma2);
    }
    public void opsuma(double numero4,double numero5){
        double suma3;
        suma3 = numero4 + numero5 +2;
        System.out.printf("El resultado de la suma de: %f + %f + 2 = %f\n",numero4,numero5,suma3);
    }
    public static void main(String[] args){
        Operacionesmatematicas objeto1 = new Operacionesmatematicas();
        objeto1.opsuma(1,3);
        Operacionesmatematicas objeto2 = new Operacionesmatematicas();
        objeto2.opsuma(1,2,3);
        Operacionesmatematicas objeto3 = new Operacionesmatematicas();
        objeto3.opsuma(1.5,3.5);

    }
}
