public class Producto {
    public double precio;
    public  int cantidad;

    public String nombre;

    public Producto(){
        this.nombre="vacio";

    }
    public Producto(String nombre, double precio){
        this.precio = precio;
        this.nombre = nombre;
    }
    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public void imprimir(){
        System.out.printf("El nombre es: "+nombre+" el precio del producto es: \n"+precio);
    }
    public void imprimir(String nombre, double precio, int cantidad){
        System.out.printf("La Factura es de: %s el precio es de: %f y de una vez la cantidad es: %d",nombre,precio,cantidad);
    }
    public void segundo(){
        System.out.printf("El nombre es: %s el precio es:  %f y la cantidad es: %d\n",nombre,precio,cantidad);
    }
    public static void main(String[] args){
        Producto objeto1 = new Producto("MANZANA", 2.5);
        Producto objeto2 = new Producto("Pera",1.50,7);
        Producto objeto3 = new Producto();

        objeto1.imprimir();
        objeto2.segundo();
        objeto3.imprimir("Sandia",67.1,6);




    }
}
