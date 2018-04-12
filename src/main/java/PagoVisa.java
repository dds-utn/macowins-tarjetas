import externo.VisaHomeLibrary;

public class PagoVisa implements MedioDePago {

  @Override
  public void cobrar(Cliente cliente, double monto) {
    boolean cobrado = VisaHomeLibrary.cobrar( //
        cliente.getDni(), //
        cliente.getNombre(), //
        cliente.getApellido(), //
        monto, //
        cliente.getNumeroTarjeta(), //
        cliente.getPin());
    if (!cobrado) {
      throw new RuntimeException("No se pudo cobrar");
    }
  }

}
