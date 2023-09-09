public class Pedido {
    private Producto producto;
    private Integer cantidad;
    private FormaPago formaDePago;
    private  Envio formaEnvio;
    Pedido ( Producto prod, Integer cant, FormaPago pago, Envio env){
        this.producto = prod;
        this.cantidad = cant;
        this.formaDePago = pago;
        this.formaEnvio = env;
    }

    public Double calcularMontoTotal() {
        Double aux = this.producto.calcularPrecio(this.cantidad);
        aux += this.formaDePago.calcularCosto(aux);
        aux += this.formaEnvio.calcularEnvio(aux);
        return aux;
    }
}
