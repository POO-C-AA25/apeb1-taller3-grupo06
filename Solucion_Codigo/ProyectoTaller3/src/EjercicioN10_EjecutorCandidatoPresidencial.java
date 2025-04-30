/**
 * Diseñe una clase en UML denominada CandidatoPresidencial para modelar a los aspirantes a la presidencia de Ecuador 
 * en las elecciones de 2025. La clase debe incluir atributos esenciales como nombre, edad, partido político, plan de 
 * gobierno y número de propuestas clave. Implemente métodos para modificar y obtener esta información, además de un 
 * método que permita validar si el candidato cumple con los requisitos de edad mínima según la legislación electoral. 
 * Sobrecargue los constructores para permitir la creación de objetos con diferentes niveles de detalle: por ejemplo, 
 * uno que solo reciba el nombre y el partido, y otro que incluya todos los atributos
 * @author Luis
 */
import java.util.Scanner;
public class EjercicioN10_EjecutorCandidatoPresidencial {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        CandidatoPresidencial candidato1 = new CandidatoPresidencial ("Jorge Caceres", 39, "RC5", "Impulsar la reactivación económica con inversión extranjera, fortalecer el "
                                                                                                    + "\nsistema de salud pública, y modernizar la educación con enfoque digital. "
                                                                                                    + "\nSe priorizarán cinco propuestas clave: reducir el IVA, digitalizar hospitales, "
                                                                                                    + "\ncrear 100 mil empleos, reforzar la seguridad ciudadana y proteger el medio "
                                                                                                    + "\nambiente.", 5);
        candidato1.calcularEdad();
        
        System.out.println("\nCandidato 1" + candidato1.toString()); 
        
        candidato1.modificarInformacion(tcl);
        System.out.println("\nCandidato 1(Nueva Informacion)" + candidato1.toString());
    }
}
class CandidatoPresidencial{
    public String nombre;
    public int edad;
    public String partido_politico;
    public String plan_gobierno;
    public int numero_propuesta;
    public String edad_requerida;
    public CandidatoPresidencial(){
    }
    public CandidatoPresidencial(String nombre, int edad, String partido_politico, String plan_gobierno, int numero_propuesta){
        this.nombre = nombre;
        this.edad = edad;
        this.partido_politico = partido_politico;
        this.plan_gobierno = plan_gobierno;
        this.numero_propuesta = numero_propuesta;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setPartidoPolitico(String partido_politico){
        this.partido_politico = partido_politico;
    }
    public void setPlanDeGobierno(String plan_gobierno){
        this.plan_gobierno = plan_gobierno;
    }
    public void setNumeroDePropuestas(int numero_propuesta){
        this.numero_propuesta = numero_propuesta;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getPartidoPolitico(){
        return this.partido_politico;
    }
    public String getPlanDeGobierno(){
        return this.plan_gobierno;
    }
    public int getNumeroDePropuestas(){
        return this.numero_propuesta;
    }
    public String getEdadRequqerida(){
        return this.edad_requerida;
    }
    public void calcularEdad(){
        if (this.edad >= 35) 
            this.edad_requerida = "El candidato cumple con los requisitos de edad mínima según la legislación electoral";
        else
            this.edad_requerida = "No cumple con los requisitos de edad mínima según la legislación electoral";
}
    public void modificarInformacion(Scanner tcl ){      
        System.out.print("\nIngrese su nombre: ");
        String NuevoNombre = tcl.nextLine();
        System.out.print("Ingrese su edad: ");
        int NuevaEdad = tcl.nextInt();
        System.out.print("Ingrese su Partido politico: ");
        String NuevoPartidoPolitico = tcl.nextLine();
        tcl.nextLine();
        System.out.print("Ingrese su Plan de gobierno: ");
        String NuevoPlanDeGobierno = tcl.nextLine();
        System.out.print("Ingrese el numero de propuestas: ");
        int NuevoNumeroDePropuestas = tcl.nextInt();
        
        this.nombre = NuevoNombre;
        this.edad = NuevaEdad;
        this.partido_politico = NuevoPartidoPolitico;
        this.plan_gobierno = NuevoPlanDeGobierno;
        this.numero_propuesta = NuevoNumeroDePropuestas;
    
        this.calcularEdad();
        
    }
    public String toString(){
        return "\nNombre del candidato: " + this.getNombre()
                + "\nEdad: " + this.getEdad()
                + "\nPartido Politico: " + this.getPartidoPolitico()
                + "\nPlan de Gobierno: " + this.getPlanDeGobierno()
                + "\nNumero de propuestas: " + this.getNumeroDePropuestas()
                + "\n" + this.getEdadRequqerida()
                ;
    }
}