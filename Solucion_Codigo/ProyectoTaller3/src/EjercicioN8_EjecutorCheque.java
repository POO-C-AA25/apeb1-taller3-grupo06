/**
 * En una entidad financiera se requiere manejar los cheques. Cada cheque tiene las siguientes propiedades: 
 * nombre del cliente, nombre del banco, valor del cheque y comisión que cobra el banco. La comisión del banco 
 * es igual al valor del cheque por el 0.003%.
 * @author Luis
 */
public class EjercicioN8_EjecutorCheque {
    public static void main(String[] args) {
        Cheque cheque1 = new Cheque("Darwin", "Banco Pichincha", 10500.30);
        cheque1.calcularComision();
        Cheque cheque2 = new Cheque("Bryan", "Banco de Loja", 5790.30);
        cheque2.calcularComision();         
        System.out.println("\nVehiculo1: " + cheque1.toString());
        System.out.println("\nVehiculo2: " + cheque2.toString());
    }
}
class Cheque{
    public String nombre_cliente;
    public String nombre_banco;
    public double valor_cheque;
    public double comision;
    public Cheque(){
        
    }
    public Cheque(String nombre_cliente, String nombre_banco, double valor_cheque){
        this.nombre_cliente = nombre_cliente;
        this.nombre_banco = nombre_banco;
        this.valor_cheque = valor_cheque;
    }
    public void setNombreCliente(String nombre_cliente){
        this.nombre_cliente = nombre_cliente;
    }
    public void setNombreBanco(String nombre_banco){
        this.nombre_banco = nombre_banco;
    }
    public void setValorCheque(double valor_cheque){
        this.valor_cheque = valor_cheque;
    }
     public String getNombreCliente(){
        return this.nombre_cliente ;
    }
    public String getNombreBanco(){
        return this.nombre_banco;
    }
    public double getValorCheque(){
        return this.valor_cheque;
    }
    public double getComision(){
        return this.comision;
    }
    public void calcularComision(){
        this.comision = this.valor_cheque * (0.003);
    }
    public String toString(){
        return "\nNombre del cliente: " + this.getNombreCliente()
                + "\nNombre del banco: " + this.getNombreBanco()
                + "\nValor del cheque: " + this.getValorCheque()
                + "\nValor de la comisión que cobra el banco: " + this.getComision()
                ;
    }
}