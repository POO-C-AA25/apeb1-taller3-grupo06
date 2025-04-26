/***
 * Un automotor tiene entre sus características, cédula del dueño, marca de vehículo, año de fabricación, 
 * valor de vehículo y valor de la matricula. El valor de la matricula es igual al 0.002% del valor de vehículo 
 * por el número de años de antigüedad del vehículo.
 * 
 * @author David Gonzalez / Dudef-ui / Grupo06
 */
public class EjercicioN7_EjecutorAutomotor {
    public static void main(String[] args) {
        //Creacion de los objetos
        Automotor Vehiculo1 = new Automotor(17283945, "Toyota", 2018, 2025, 13500.00);
        Vehiculo1.calcularValorMatricula();
        
        Automotor Vehiculo2 = new Automotor(45678912, "Ford", 2015, 2025, 9800.50);
        Vehiculo2.calcularValorMatricula();
        
        Automotor Vehiculo3 = new Automotor(78945613, "Honda", 2020, 2025, 18500.75);
        Vehiculo3.calcularValorMatricula();
        
        System.out.println("\nVehiculo1: " + Vehiculo1.toString());
        System.out.println("\nVehiculo2: " + Vehiculo2.toString());
        System.out.println("\nVehiculo3: " + Vehiculo3.toString());
    }
}

class Automotor{
    
    //Atributos de la clase
    public int cedula_propietario;
    public String marca_vehiculo;
    public int anio_fabricacion;
    public int anio_actual;
    public double valor_vehiculo;
    public double valor_matricula;
    //Constructor general
    public Automotor(){
        
    }
    //Construtot sobrecargado
    public Automotor(int cedula_propietario, String marca_vehiculo, int anio_fabricacion, int anio_actual, double valor_vehiculo){
        this.cedula_propietario = cedula_propietario;
        this.marca_vehiculo = marca_vehiculo;
        this.anio_fabricacion = anio_fabricacion;
        this.anio_actual = anio_actual;
        this.valor_vehiculo = valor_vehiculo;

    }
    //Declaracion de setters y getters
    public void setCedulaPropietario(int cedula_propietario){
        this.cedula_propietario = cedula_propietario;
    }
    public void setMarcaVehiculo(String marca_vehiculo){
        this.marca_vehiculo = marca_vehiculo;
    }
    public void setAnioFabricacion(int anio_fabricacion){
        this.anio_fabricacion = anio_fabricacion;
    }
    public void setAnioActual(int anio_actual){
        this.anio_actual = anio_actual;
    }
    public void setValorVehiculo(int valor_vehiculo){
        this.valor_vehiculo = valor_vehiculo;
    }
    //Getters
     public int getCedulaPropietario(){
        return this.cedula_propietario ;
    }
    public String getMarcaVehiculo(){
        return this.marca_vehiculo;
    }
    public int getAnioFabricacion(){
        return this.anio_fabricacion;
    }
    public int getAnioActual(){
        return this.anio_actual;
    }
    public double getValorVehiculo(){
        return this.valor_vehiculo;
    }
    public double getValorMatricula(){
        return this.valor_matricula;
    }
    //Metodo para el calculo de la matricula 
    public void calcularValorMatricula(){
        this.valor_matricula = (0.002 * this.valor_vehiculo) * (this.anio_actual - this.anio_fabricacion);
    }
    //Metodo toString()
    public String toString(){
        return "\nCedula del propietario: " + this.getCedulaPropietario()
                + "\nMarca del behiculo: " + this.getMarcaVehiculo()
                + "\nAño de fabricacion: " + this.getAnioFabricacion()
                + "\nAño actual: " + this.getAnioActual()
                + "\nValor del vechiculo: " + this.getValorVehiculo()
                + "\nValor de la matricul: " + this.getValorMatricula()
                ;
    }
}