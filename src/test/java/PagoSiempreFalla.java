public class PagoSiempreFalla implements MedioDePago {

    @Override
    public void cobrar(Cliente cliente, double monto) {
        throw new RuntimeException("No se pudo cobrar");
    }
}
