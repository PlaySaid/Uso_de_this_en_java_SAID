package el_uso_de_this_en_java;

public class Estudiante {
    String nombre;
    int edad;
    
    public Estudiante(){
        this("Desconocido", 0);
    }
    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad+" años");
    }
}
