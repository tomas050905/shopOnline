package shoponline;

import java.time.LocalDate;
import java.util.ArrayList;

public class Venta {
    private Cliente cliente;
    private ArrayList<Producto> prodlista = new ArrayList<>();
    private static int cantVentas;
    private static int facNro = 1090;
    private LocalDate fecha;

    public Venta(Cliente cliente, LocalDate fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
        this.facNro++;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getprodlista() {
        return prodlista;
    }

    public void setprodlista(ArrayList<Producto> prodlista) {
        this.prodlista = prodlista;
    }

    public static int getCantVentas() {
        return cantVentas;
    }

    public static void setCantVentas(int cantVentas) {
        Venta.cantVentas = cantVentas;
    }

    public int getfacNro() {
        return facNro;
    }

    public void setfacNro(int nroFact) {
        Venta.facNro = facNro;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
    public void agregarProducto(Producto p){
        this.prodlista.add(p);
    }
    
    private double calcularImporteTotal(){
       double tot=0.0;
        for(Producto p:this.prodlista){ //for each precio in the arraylist prod repeat this
            tot += p.getPrecio();// acumulo los precios de cada producto en la lista
        }
        return tot;
    }
    public void imprimirFactura(){
        System.out.println("Factura N°: " + facNro + " - " + fecha);
        for(Producto p:this.prodlista){
            System.out.println(p.toString());
        }
        System.out.println("Total a Pagar: ........... $" + this.calcularImporteTotal());
    }
}
