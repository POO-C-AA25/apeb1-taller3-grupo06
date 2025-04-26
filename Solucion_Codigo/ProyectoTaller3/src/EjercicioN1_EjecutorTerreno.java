/***
 * Elaborar una solución que calcule e imprima el costo de un terreno rectangular; se tiene como datos el ancho y el largo en metros; 
 * el valor del metro cuadrado. El area del terreno es igual a largo por ancho. El costo del terreno es igual al valor del metro cuadrado por el área del terreno. 
 * Luego del análisis se decide usar las siguientes entidades:
 * Entidades o Clases
 * Terreno
 * Ejecutor
 * Terreno, tiene los siguientes atributos
 * costo_terreno
 * ancho
 * largo
 * area
 * valorMetroCuadrado
 * Ejecutor (clase de prueba)
 * Tiene el método main
 *
 * @author David Gonzalez / Dudef-ui / Grupo06
 */
public class EjercicioN1_EjecutorTerreno {
    
    public static Terreno terrenoX = new Terreno(); //Objeto global
    
    public static void main(String[] args) {
        System.out.println("FORMA LARGA: ");
        //Generar los datos de manera aleatoria 
        double ancho = (Math.random() * 10) + 1;
        double largo = (Math.random() * 10) + 1;
        double valor_metro = (Math.random() * 10) + 1;
        
        //Inicializar los valores
        terrenoX.setAncho(ancho);
        terrenoX.setLargo(largo);
        terrenoX.setValorMetro(valor_metro);
        
        //Invocar las funciones que calculan los valores 
        terrenoX.calcularArea();
        terrenoX.calcularCostoTerreno();
        
        //Imprimir los datos
        System.out.print("TerrenoX: " + terrenoX.toString());
        
        //Forma de inicializar los datos eficiente
        System.out.println("\nFORMA EFICIENTE: ");
        //Se inicializa los datos
        Terreno miTerreno = new Terreno(2,3,3);
        //Se calculan los datos
        miTerreno.calcularArea();
        miTerreno.calcularCostoTerreno();
        System.out.println("Mi terreno: " + miTerreno.toString());
    }
}

class Terreno{
     public double ancho;
     public double largo;
     public double valor_metro;
     public double area_terreno;
     public double costo_terreno;
     
     public Terreno (){
         
     }
    public Terreno (double ancho, double largo, double valor_metro){
        this.ancho = ancho;
        this.largo = largo;
        this.valor_metro = valor_metro;
    }
    
    public void setAncho(double ancho){
        this.ancho = ancho;
    }
    
    public void setLargo(double largo){
        this.largo = largo;
    }
    
    public void setValorMetro(double valor_metro){
        this.valor_metro = valor_metro;
    }
    
    public double getAncho(){
        return this.ancho;
    }
    
    public double getLargo(){
        return this.largo;
    }
    
    public double getValorMetro(){
        return this.valor_metro;
    }
    
    public double getArea(){
        return this.area_terreno;
    }
    
    public double getCostoTerreno(){
        return this.costo_terreno;
    }
    
    public void calcularArea(){
        this.area_terreno = this.ancho * this.largo;
    }
    
    public void calcularCostoTerreno(){
        this.costo_terreno = this.area_terreno * this.valor_metro;
    }
    
    public String toString(){
        return "\n{Ancho: " + this.getAncho() 
                + ", Largo: " + this.getLargo()
                + ", Valor metro: " + this.getValorMetro()
                + ", Valor area: " + this.getArea()
                + ", Valor terreno: " + this.getCostoTerreno()
                + "}\n"
                ;
    }
}