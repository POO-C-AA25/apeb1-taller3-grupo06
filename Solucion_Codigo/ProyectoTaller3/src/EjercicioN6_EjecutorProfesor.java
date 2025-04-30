/**
 * Los profesores de un instituto tienen algunas características: nombre, apellido, sueldo básico, 
 * sueldo total y cédula. El sueldo total es igual al sueldo básico más el 20% del sueldo básico.
 * @author Luis
 */
public class EjercicioN6_EjecutorProfesor {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Oscar", "Escudero", 850.70, 1105060550);
        profesor1.calcularSueldoTotal();
        Profesor profesor2 = new Profesor("Ruby", "Castillo", 910.00, 1104646847); 
        profesor2.calcularSueldoTotal();
        System.out.println("\nInformacion profesor1: " + profesor1.toString());
        System.out.println("\nInformacion profesor2: " + profesor2.toString());
    }
}
class Profesor{
    public String nombre;
    public String apellido;
    public double sueldo_basico;
    public double sueldo_Total;
    public int cedula;
    public Profesor(){
    }
    public Profesor (String nombre, String apellido, double sueldo_basico, int cedula){
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldo_basico = sueldo_basico;
        this.cedula = cedula;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApelllido(String apellido){
        this.apellido = apellido;
    }
    public void setSueldoBasico(double sueldo_basico){
        this.sueldo_basico = sueldo_basico;
    }
    public void setCedula (int cedula){
        this.cedula = cedula;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public double getSueldoBasico(){
        return this.sueldo_basico;
    }
    public int getCedula (){
        return this.cedula;
    }
    public double getSueldoTotal(){
        return this.sueldo_Total;
    }
    public void calcularSueldoTotal(){
        this.sueldo_Total = this.sueldo_basico + (this.sueldo_basico * 0.20);
    }
    public String toString(){
        return "\nNombre: " + this.getNombre()
                + "\nApellido: " + this.getApellido()
                + "\nSueldo Basico: " + this.getSueldoBasico()
                + "\nCedula: " + this.getCedula()
                + "\nSueldoTotal: " + this.getSueldoTotal()
                ;
    }
}