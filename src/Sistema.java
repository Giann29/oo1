import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Sistema {
    private ArrayList<Persona> personas;
    Sistema (){
        this.personas = new ArrayList<>();
    }
    public Persona registrarPersona(String nombre, String direccion){
        Persona p = new Persona(nombre,direccion);
        this.personas.add(p);
        return p;
    }
    public Persona buscarPersona(String nombre) {
        return this.personas.stream().filter(persona -> persona.getNombre().equals(nombre)).findFirst().orElse(null);
    }

    public Producto registrarProducto(String nombre, String descrip, Double precio, Integer cant, Persona vendedor){
        Producto prod = new Producto(nombre,descrip,precio,cant);
        vendedor.agregarProducto(prod);
        return prod;
    }

    public List<Producto> buscarProducto(String nombre){
        return this.personas.stream().map(persona -> persona.buscarProducto(nombre)).filter(producto -> producto != null).collect(Collectors.toList());
    }

    public Pedido crearPedido(Persona cli, Producto prod, Integer cant, FormaPago pago, Envio env){
        if (prod.compararUnidades(cant)){
            return cli.crearPedido(prod,cant,pago,env);
        }
        else {
            return null;
        }
    }
    public Double calcularCosto(Pedido pedido){
        return pedido.calcularMontoTotal();
    }

}
