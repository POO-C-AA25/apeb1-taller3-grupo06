/**
 * Elaborar una solución que lea una cantidad de horas e imprima su equivalente en minutos, segundos, días.
 * Entididades o Clases
 * EquivalenteHora
 * Ejecutor (clase de prueba)
 * EquivalenteHora
 * horas
 * minutos
 * segundos
 * dias
 * Ejecutor (clase de prueba)
 * Tiene el método main
 * @author Luis
 */
public class EjercicoN2_EjecutorEquivalenteHoras {
    public static Equivalente equivalenteX = new Equivalente();
    public static void main(String[] args) {
        System.out.println("\n FORMA INEFICIENTE ");
        int horas = (int) ((Math.random() * 10) + 1);
        equivalenteX.setHoras(horas);
        equivalenteX.calcularMinutos();
        equivalenteX.calcularSegundos();
        equivalenteX.calcularDias();
        System.out.println("EquivalenteX: " + equivalenteX.toString());
        System.out.println(" FORMA EFICIENTE");
        Equivalente equivalente = new Equivalente(45);
        equivalente.calcularMinutos();
        equivalente.calcularSegundos();
        equivalente.calcularDias();
        System.out.println("Equivalente: " + equivalente.toString());
    }
}
class Equivalente {
    public int horas;
    public int minutos;
    public int segundos;
    public int dias;
    public Equivalente(){
    }
    public Equivalente (int horas){
        this.horas = horas;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }
    public int getHoras(){
        return this.horas;
    }
    public int getMinutos(){
        return this.minutos;
    }
    public int getSegundos(){
        return this.segundos;
    }
    public int getDias(){
        return this.dias;
    }
    public void calcularMinutos(){
        this.minutos = this.horas * 60;
    }
    public void calcularSegundos(){
        this.segundos = this.horas * 3600;
    }
    public void calcularDias(){
        this.dias = this.horas / 24;
    }
    public String toString(){
        return "\nHoras: " + this.getHoras()
                + "\n Minutos: " + this.getMinutos()
                + "\n Segundos: " + this.getSegundos()
                + "\n Dias: " + this.getDias()
                + "\n"
                ;
    }
}