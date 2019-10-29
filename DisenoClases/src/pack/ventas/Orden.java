/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.ventas;

/**
 *
 * @author Angel BG
 */
public class Orden {
    private final int idOrden;
    private final Producto []productos;
    private int contadorProductos;
    private static int contadorOrden;
    private static final int maxProductos = 10;
    
    public Orden(){
        this.idOrden = ++contadorOrden;
        this.productos = new Producto[maxProductos];
    }
    
    public void agregarProducto(Producto producto){
        if(contadorProductos < maxProductos)
            productos[this.contadorProductos++] = producto;
        else System.out.println("Se ha superado el maximo de productos (" + maxProductos + ")");
    }
    public double calcularTotal(){
        double total=0;        
        for(int ind=0;ind<contadorProductos;ind++){
            total += productos[ind].getPrecio();
        }
        return total;
    }
    public void mostrarOrden(){
        System.out.println("Orden: #" + idOrden + "\nTotal: $" + calcularTotal());
        for(int ind=0; ind<contadorProductos; ind++)
            System.out.println(productos[ind]);
    }
}
