import java.util.ArrayList;

public class Persona {
    private String nombre, direccion;
    private ArrayList<Producto> productos;
    private ArrayList<Pedido> pedidos;
    Persona (String nom, String dir){
        this.direccion = dir;
        this.nombre = nom;
        this.productos = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }
    public void agregarProducto(Producto prod){
        this.productos.add(prod);
    }

    public Producto buscarProducto(String nombre){
        return this.productos.stream().filter(producto -> producto.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    public Pedido crearPedido(Producto prod, Integer cant, FormaPago pago, Envio env){
        Pedido ped = new Pedido(prod,cant,pago,env);
        this.pedidos.add(ped);
        prod.decrementarStock(cant);
        return ped;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
