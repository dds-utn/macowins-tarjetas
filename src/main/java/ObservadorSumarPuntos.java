import externo.Sms;
import externo.SmsSender;

public class ObservadorSumarPuntos implements ObservadorVenta {

  @Override
  public void notificarVenta(Venta venta) {
    Cliente cliente = venta.getCliente();

    cliente.aumentarPuntosPorVenta(venta.getPuntosPorVenta());
  }

}
