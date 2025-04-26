
import java.util.Random;


/**
 * 
 * Se requiere representar una entidad que permita crear objetos con características como: 
 * nombre de estudiante, calificación de materia 1, calificación de materia 2, calificación de materia 3 y promedio de calificaciones. 
 * Adicional, esta entidad/clase, debe procesar un estado de "Aprobado" si el promedio es mayor o igual a 6.5pts., caso contrario "Reprobado".
 * 
 * @author David Gonzalez / Dudef-ui / Grupo06
 */

public class EjercicioN5_EjecutorEstudiantes {
    public static Estudiantes EstudianteX = new Estudiantes ();
    
    public static void main(String[] args) {
        // Lista de nombres posibles
        String[] nombres = {"Ana Lopez", "Luis Hernan", "Carlos Quito", "María Rosales", "Sofía Castillo", "José Gustavo", "Paula Fernandez", "Andrés Silverio"};
        
        // Crear generador de aleatorios
        Random random = new Random();
        
        //Generar varios objetos de manera aleatoria con un ciclo for
        //Esto se da en base a la estructura general del "EstudianteX", es el mismo objeto
        //unicamente con cada iteracion cambian los valores que contiene el objeto.
        for (int i = 0; i < nombres.length; i++) {

        // Seleccionar un nombre aleatorio
        int indiceNombre = random.nextInt(nombres.length);
        String nombreAleatorio = nombres[indiceNombre];
        
        //Generar valores aleatorios
        double calificacion_materia1 = random.nextDouble() * 9 + 1;
        double calificacion_materia2 = random.nextDouble() * 9 + 1;
        double calificacion_materia3 = random.nextDouble() * 9 + 1;
        
        //Inicializar valores
        EstudianteX.setNombreEstudiante(nombreAleatorio);
        EstudianteX.setCalificacionMateria1(calificacion_materia1);
        EstudianteX.setCalificacionMateria2(calificacion_materia2);
        EstudianteX.setCalificacionMateria3(calificacion_materia3);
        
        //Invocar los metodos
        EstudianteX.calcularPromedio();
        EstudianteX.EstablecerEstado();
        
        //Imprimir los datos
        System.out.println("\nEstudiante"+ i +": " + EstudianteX.toString());
        }
        
    }
}

//Declaracion de la clase
class Estudiantes{
    public String nombre_estudiante;
    double calificacion_materia1;
    double calificacion_materia2;
    double calificacion_materia3;
    double promedio;
    public String estado_estudiante;
    
    // Constructor general
    public Estudiantes(){
        
    }
    
    // Constructor sobrecargado
    public Estudiantes(String nombre_estudiante,String estado_estudiante,double calificacion_materia1, double calificacion_materia2, double calificacion_materia3){
        this.nombre_estudiante = nombre_estudiante;
        this.calificacion_materia1 = calificacion_materia1;
        this.calificacion_materia2 = calificacion_materia2;
        this.calificacion_materia3 = calificacion_materia3;
    }
    
    // Declaracion de los setters
    public void setNombreEstudiante(String nombre_estudiante){
        this.nombre_estudiante = nombre_estudiante;
    }
    public void setCalificacionMateria1(double calificacion_materia1){
        this.calificacion_materia1 = calificacion_materia1;
    }
    public void setCalificacionMateria2(double calificacion_materia2){
        this.calificacion_materia2 = calificacion_materia2;
    }
    public void setCalificacionMateria3(double calificacion_materia3){
        this.calificacion_materia3 = calificacion_materia3;
    }
    
    // Declaracion de los getters
    public String getNombreEstudiante(){
        return this.nombre_estudiante;
    }
    public double getCalificacionMateria1(){
        return this.calificacion_materia1;
    }
    public double getCalificacionMateria2(){
        return this.calificacion_materia2;
    }
    public double getCalificacionMateria3(){
        return this.calificacion_materia3;
    }
    public double getPromedio(){
        return this.promedio;
    }
    public String getEstadoEstudiante(){
        return this.estado_estudiante;
    }
    
    // Declaracion de los metodos para calcular promedio
    public void calcularPromedio(){
        this.promedio = (this.calificacion_materia1 + this.calificacion_materia2 + this.calificacion_materia3)/3;
    }
    
    // Declaracion del metodo para establecer el estado
    public void EstablecerEstado(){
        if (this.promedio >= 6.5){
            this.estado_estudiante = "Aprobado";
        }else{
            this.estado_estudiante = "Reprobado";
        } 
    }
    
    public String toString(){
        return "\n\nNombre: " + this.getNombreEstudiante()
                + "\nCalificacion materia 1: " + this.getCalificacionMateria1()
                + "\nCalificacion materia 2: " + this.getCalificacionMateria2()
                + "\nCalificacion materia 3: " + this.getCalificacionMateria3()
                + "\nPromedio: " + this.getPromedio()
                + "\nEstado del estudiante: " + this.getEstadoEstudiante()
                ;
    }
}