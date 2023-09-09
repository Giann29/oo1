public class Producto {
    private String nombre, descripcion;
    private Double precio;
    private Integer unidades;

    Producto (String nom, String desc, Double precio1, Integer unidades1) {
        this.nombre = nom;
        this.descripcion = desc;
        this.precio = precio1;
        this.unidades = unidades1;
    }
    public Boolean compararUnidades(Integer cant){
        return this.unidades<=cant;
    }
    public void decrementarStock(Integer cant){
        this.setUnidades(this.getUnidades()-cant);
    }
    public Double calcularPrecio(Integer cant){
        return precio*cant;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getUnidades() {
        return unidades;
    }

    public void setUnidades(Integer unidades) {
        this.unidades = unidades;
    }
}
