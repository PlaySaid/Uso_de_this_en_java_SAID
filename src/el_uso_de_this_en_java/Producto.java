package el_uso_de_this_en_java;

public class Producto {
    String nombre;
    int precio;
    
    public Producto(){
    }
    public Producto(String nombre, int precio){
        this.nombre = nombre;
        this.precio = precio;
    }
    public void mostrarProducto(){
        System.out.println("Nombre del producto: "+nombre);
        System.out.println("Precio: $"+precio);
    }
}