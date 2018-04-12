import externo.MasterLibrary;
import externo.TarjetaDto;

public class PagoMaster implements MedioDePago {

  @Override
  public void cobrar(Cliente cliente, double monto) {
    TarjetaDto tarjeta = new TarjetaDto();
    tarjeta.setNumero(cliente.getNumeroTarjeta());
    tarjeta.setPin(cliente.getPin());
    int codigoVenta = MasterLibrary.cargarVentaWs(cliente.getNombreCompleto(), tarjeta);
    if (codigoVenta != 0) {
      throw new RuntimeException("No se pudo cobrar");
    }
  }

}
