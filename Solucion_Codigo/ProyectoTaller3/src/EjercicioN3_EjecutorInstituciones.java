/***
 * Se necesita representar una entidad que permite administrar Instituciones Educativas. 
 * Cada institución tiene como características: nombre, tipo de institución, número de alumnos, número de docentes, 
 * número de sedes, gastos proyectados por estudiante, presupuesto. 
 * El presupuesto es igual a la cantidad de alumnos de la institución por el gato proyectado por estudiante.
 * 
 * @author David Gonzalez / Dudef-ui / Grupo06
 */
public class EjercicioN3_EjecutorInstituciones {
    public static void main(String[] args) {
        //(Los datos van a ser los mismos que se declararon el dia sotfware)
    
        //Declaracion del primer objeto 
        Institucion_Educativa Institucion1 = new Institucion_Educativa("Universidad Tecnológica Nacional","Universidad Pública",25000,1200,10,3500.75);
    
        //Invocacion del metodo para calcular el presupuesto
        Institucion1.calcularPresupuesto();
        System.out.println("Institucion 1: " + Institucion1.toString());
        
        //Declaracion del segundo objeto 
        Institucion_Educativa Institucion2 = new Institucion_Educativa( "Instituto de Artes Digitales","Instituto Privado",1200,90,2,12500.50);
        
        //Invocacion del metodo para calcular el presupuesto
        Institucion2.calcularPresupuesto();
        System.out.println("\nInstitucion 2: " + Institucion2.toString());
        
    }  
}

// Declaracion de la clase
class Institucion_Educativa{
   
    //Declaracion de los atributos
    public String nombre;
    public String tipo_institucion;
    public int numero_alumnos;
    public int numero_docentes;
    public int numero_sedes;
    public double gastos_estudiante;
    public double presupuesto;
    
    // Constructor general
    public Institucion_Educativa(){
    
    }
    
    // Constructor sobrecargado
    public Institucion_Educativa(String nombre,String tipo_institucion,int numero_alumnos,int numero_docentes,int numero_sedes,double gastos_estudiante){
        this.nombre = nombre;
        this.tipo_institucion = tipo_institucion;
        this.numero_alumnos = numero_alumnos;
        this.numero_docentes = numero_docentes;
        this.numero_sedes = numero_sedes;
        this.gastos_estudiante = gastos_estudiante;
        
    }
    
    // Declaracion de los setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setTipoInstitucion(String tipo_institucion){
        this.tipo_institucion = tipo_institucion;
    }
    public void setNumeroAlumnos(int numero_alumnos){
        this.numero_alumnos = numero_alumnos;
    }
    public void setNumeroDocentes(int numero_docentes){
        this.numero_docentes = numero_docentes;
    }
    public void setNumeroSedes(int numero_sedes){
        this.numero_sedes = numero_sedes;
    }
    public void setGastosEstudiante(double gastos_estudiante){
        this.gastos_estudiante = gastos_estudiante;
    }
    
    // Declaracion de los getters
    public String getNombre(){
         return this.nombre;
    }
    public String getTipoInstitucion(){
         return this.tipo_institucion;
    }
    public int getNumeroAlumnos(){
        return this.numero_alumnos;
    }
    public int getNumeroDocentes(){
        return this.numero_docentes;
    }
    public int getNumeroSedes(){
        return this.numero_sedes;
    }
    public double getGastosEstudiante(){
         return this.gastos_estudiante;
    }
    public double getpresupuesto(){
        return this.presupuesto;
    }
    
    // Declaracion de la funcion de calculo del presupuesto
    public void calcularPresupuesto(){
        this.presupuesto = this.gastos_estudiante * this.numero_alumnos;
    }
    
    // Declaracion toString()
    public String toString(){
        return "\nNombre de la institucion: " + this.getNombre()
                + "\nTipo de institucion: " + this.getTipoInstitucion()
                + "\nNumero de alumnos: " + this.getNumeroAlumnos()
                + "\nNumero de docentes: " + this.getNumeroDocentes()
                + "\nNumero de sedes: " + this.getNumeroSedes()
                + "\nGastos proyectados por estudiante: " + this.getGastosEstudiante()
                + "\nPresupuesto: " + this.getpresupuesto()
                ;
    }
}