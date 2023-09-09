public class SeisCuotas implements FormaPago {
    public Double calcularCosto(Double monto){
        return monto*1.2;
    }

}
