package el_uso_de_this_en_java;

public class El_uso_de_this_en_java {
    public static void main(String[] args) {
        
        Producto produc = new Producto("Coca-Cola", 3000);
        Estudiante estud = new Estudiante("Said", 17);
        
        produc.mostrarProducto();
        System.out.println("-----------------");
        estud.mostrarDatos();
    }
    
}