public class ComidasTipicas {
    //Atributos
    public double valor;
    public String sabor;
    public String origen;
    public String nombre;

    public void dardetalles(String nombre, String origen, String sabor, double valor){
        System.out.println("El "+nombre+" viene de la "+origen+" su sabor es "+sabor+" y tiene un costo aproximado de: "+valor);
    }
    public static void main(String[] args){
        ComidasTipicas Plato1 = new ComidasTipicas();
        ComidasTipicas Plato2 = new ComidasTipicas();
        ComidasTipicas Plato3 = new ComidasTipicas();
        ComidasTipicas Plato4 = new ComidasTipicas();
        Plato1.dardetalles("Encebollado","Costa","asombroso",3.75);
        Plato2.dardetalles("Yahuarlocro","Sierra","delicioso",2.50);
        Plato3.dardetalles("Pescado Frito","Amazonia","asombroso",4.00);
        Plato4.dardetalles("Bolon con Cafe","Sierra","exquisito",5.15);

    }
}
