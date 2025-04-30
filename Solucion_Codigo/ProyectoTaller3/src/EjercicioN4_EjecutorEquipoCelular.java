/**
 * Para un sistema, es necesario abstraer las características de dispositivos electrónicos Equipo celulares. Cada Equipo Celular 
 * tienen como características: sistema operativo, tamaño de pantalla, costo inicial, iva en porcentaje, iva del costo inicial 
 * costo final, dirección mac, información IMEI. El costo final del equipo es igual costo inicial más el iva del costo inicial.
 * @author Luis
 */
public class EjercicioN4_EjecutorEquipoCelular {
    public static void main(String[] args) {
        EquipoCelular celular1 = new EquipoCelular("Android", 7.00, 1550.80, 13.00, "I8:A5:99:U7:9O:S2", "894726509739534");
        celular1.calcularCostoFinal();
        EquipoCelular celular2 = new EquipoCelular("iOS", 6.50, 879.00, 15.00, "6Z:9B:A7:86:G6:E8", "195360789358347"); 
        celular2.calcularCostoFinal();
        System.out.println("\nDispositivo Celular1: " + celular1.toString());
        System.out.println("\nDispositivo Celular2: " + celular2.toString());
    }
}
class EquipoCelular{
    public String sistema_operativo;
    public double tamanio_pantalla;
    public double costo_inicial;
    public double iva_porcentaje;
    public double iva_costo;
    public double costo_final;
    public String direccion_mac;
    public String direccion_IMEI;
    public EquipoCelular(){
    }
    public EquipoCelular (String sistema_operativo, double tamanio_pantalla, double costo_inicial, double iva_porcentaje, String direccion_mac, String direccion_IMEI){
        this.sistema_operativo = sistema_operativo;
        this.tamanio_pantalla = tamanio_pantalla;
        this.costo_inicial = costo_inicial;
        this.iva_porcentaje = iva_porcentaje;
        this.direccion_mac = direccion_mac;
        this.direccion_IMEI = direccion_IMEI;
    }
    public void setSistemaOperativo(String sistema_operativo){
        this.sistema_operativo = sistema_operativo;
    }
    public void setTamanioPantalla(double tamanio_pantalla){
        this.tamanio_pantalla = tamanio_pantalla;
    }
    public void setCostoIncial(double costo_inicial){
        this.costo_inicial = costo_inicial;
    }
    public void setIvaPorcentaje (double iva_porcentaje){
        this.iva_porcentaje = iva_porcentaje;
    }
    public void setDireccionMac(String direccion_mac){
        this.direccion_mac = direccion_mac;
    }
    public void setDireccionIMEI (String direccion_IMEI){
        this.direccion_IMEI = direccion_IMEI;
    }
    public String getSistemaOperativo(){
        return this.sistema_operativo;
    }
    public double getTamanioPantalla(){
        return this.tamanio_pantalla;
    }
    public double getCostoIncial(){
        return this.costo_inicial;
    }
    public double getIvaPorcentaje (){
        return this.iva_porcentaje;
    }
    public String getDireccionMac(){
        return this.direccion_mac;
    }
    public String getDireccionIMEI (){
        return this.direccion_IMEI;
    }
    public double getIvaCosto(){
        return this.iva_costo;
    }
    public double getCostoFinal(){
        return this.costo_final;
    }
    public void calcularCostoFinal(){
        this.iva_costo = this.costo_inicial * (this.iva_porcentaje / 100);
        this.costo_final = this.costo_inicial + this.iva_costo;
    }
    public String toString(){
        return "\nSistema operativo: " + this.getSistemaOperativo()
                + "\nTamanio pantalla: " + this.getTamanioPantalla()
                + "\nCosto inicial: " + this.getCostoIncial()
                + "\nIVA porcentaje: " + this.getIvaPorcentaje()
                + "\nDireccion mac: " + this.getDireccionMac()
                + "\nDireccion IMEI: " + this.getDireccionIMEI()
                + "\nCosto del IVA inicial: " + this.getIvaCosto()
                + "\nCosto Final: " + this.getCostoFinal()
                ;
    }
}