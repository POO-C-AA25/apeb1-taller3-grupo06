/**
 * Diseñe una clase en UML y posteriormente codifíquela, en la cual se represente un emprendimiento en la ciudad de Loja, 
 * considerando que cada emprendimiento posee un nombre comercial, RUC, sector económico (gastronomía, tecnología, moda, etc.), 
 * propietario, y ubicación. Además, debe contar con atributos que permitan registrar su fecha de inicio de actividades y capital inicial. 
 * La clase debe incluir métodos para actualizar información del emprendimiento, calcular su antigüedad en años y 
 * determinar si es un micro, pequeño o mediano negocio en función de su capital.
 * 
 * @author David Gonzalez / Dudef-ui / Grupo06
 */

import java.util.Scanner;

public class EjercicioN9_EjecutorEmprendimientos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Emprendimiento Emprendimiento1 = new Emprendimiento("TechSolutions S.A.",123678901, "Juan Pérez","Tecnología", "Av. Principal 123, Lima, Perú", 2015,2023,50000.00);
        Emprendimiento1.calcularAntiguedad();
        Emprendimiento1.determinarTamanioEmp();
        
        System.out.println("\nEmprendimieto N1" + Emprendimiento1.toString());
        
        Emprendimiento1.ActualizarInformacion(teclado);
        System.out.println("\nEmprendimieto N1 (Nueva informacion)" + Emprendimiento1.toString());
    }
}
 class Emprendimiento{
    public String nombre_comercial;
    public int RUC;
    public String propietario;
    public String sector_economico;
    public String ubicacion;
    public int fecha_inicio_actividades;
    public int fecha_actual;
    public double capital_inicial;
    public String tamanio_emprendimiento;
    public int antiguedad;
     
    public Emprendimiento(){
     
    }
    public Emprendimiento(String nombre_comercial,int RUC,String propietario,String sector_economico,String ubicacion,int fecha_inicio_actividades,int fecha_actual,double capital_inicial){
        this.nombre_comercial = nombre_comercial;
        this.RUC = RUC;
        this.propietario = propietario;
        this.sector_economico = sector_economico;
        this.ubicacion = ubicacion;
        this.fecha_inicio_actividades = fecha_inicio_actividades;
        this.fecha_actual = fecha_actual;
        this.capital_inicial = capital_inicial;
    }
    //Setters
    public void setNombreComercial(String nombre_comercial){
        this.nombre_comercial = nombre_comercial;
    }
    public void setRUC(int RUC){
        this.RUC = RUC;
    }
    public void setPropietario(String propietario){
        this.propietario = propietario;
    }
    public void setSectorEconomico(String sector_economico){
        this.sector_economico = sector_economico;
    }
    public void setUbicacion(String ubicacion){
        this.ubicacion = ubicacion;
    }
    public void setFechaInicioActividades(int fecha_inicio_actividades){
        this.fecha_inicio_actividades = fecha_inicio_actividades;
    }
    public void setFechaActual(int fecha_actual){
        this.fecha_actual = fecha_actual;
    }
    public void setCapitalInicial(double capital_inicial){
        this.capital_inicial = capital_inicial;
    }
    
    // Getters
    public String getNombreComercial(){
        return this.nombre_comercial;
    }
    public int getRUC(){
        return this.RUC;
    }
    public String getPropietario(){
        return this.propietario;
    }
    public String getSectorEconomico(){
        return this.sector_economico;
    }
    public String getUbicacion(){
        return this.ubicacion;
    }
    public int getFechaInicioActividades(){
        return this.fecha_inicio_actividades;
    }
    public int getFechaActual(){
        return this.fecha_actual;
    }
    public double getCapitalInicial(){
        return this.capital_inicial;
    }
    public String getTamanioEmprendimiento(){
        return this.tamanio_emprendimiento;
    }
    public int getAntiguedad(){
        return this.antiguedad;
    }
    
    //Metodo para calcular el tamaño del emprendimiento
    public void determinarTamanioEmp(){
        if(this.capital_inicial >= 0 && this.capital_inicial <= 10000){
            this.tamanio_emprendimiento = "Microemprendimiento";
        }else if (this.capital_inicial >= 10001 && this.capital_inicial <= 100000){
            this.tamanio_emprendimiento = "Pequeña empresa";
        }else if (this.capital_inicial >= 100001 && this.capital_inicial <= 1000000){
            this.tamanio_emprendimiento = "Mediano emprendimiento";
        }else{
            this.tamanio_emprendimiento = "Gran empresa";
        }      
    }
    
    //Metodo para calcular la antiguedad
    public void calcularAntiguedad(){
        this.antiguedad = this.fecha_actual - this.fecha_inicio_actividades;
    }
    //Metodo para actualizar la informacion
    //El unico parametro recibido es el Scanner para que el usuario inserte la informacion
    public void ActualizarInformacion(Scanner teclado){
        System.out.print("\nDime el nombre del emprendimiento: ");
        String NuevoNombComercial = teclado.nextLine();
        System.out.print("Dime el nombre del nuevo propietario: ");
        String NuevoPropietario = teclado.nextLine();
        System.out.print("Dime el RUC del nuevo propietario: ");
        int NuevoRUC = teclado.nextInt();
        System.out.print("Dime el nuevo sector economico del emprendimiento: ");
        String NuevoSectorEco = teclado.nextLine();
        teclado.nextLine();
        System.out.print("Dime la nueva dirreccion del emprendimiento: ");
        String NuevaUbicacion = teclado.nextLine();
        
        this.nombre_comercial = NuevoNombComercial;
        this.propietario = NuevoPropietario;
        this.RUC = NuevoRUC;
        this.sector_economico = NuevoSectorEco;
        this.ubicacion = NuevaUbicacion;
    }
    //Metodo toString()
    public String toString(){
        return "\nNombre del comercio: " + this.getNombreComercial()
                + "\nRUC: " + this.getRUC()
                + "\nPropietario: " + this.getPropietario()
                + "\nSector economico: " + this.getSectorEconomico()
                + "\nUbicacion: " + this.getUbicacion()
                + "\nFecha de inicio de actividades: " + this.getFechaInicioActividades()
                + "\nFecha actual: " + this.getFechaActual()
                + "\nCapital inicial: " + this.getCapitalInicial()
                + "\nTamaño del emprendimiento: " + this.getTamanioEmprendimiento()
                + "\nAntiguedad del emprendimiento: " + this.getAntiguedad()  
                ;
    }
 }
