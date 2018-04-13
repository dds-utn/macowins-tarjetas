import externo.Sms;
import externo.SmsSender;

public class ObservadorEnviarSms implements ObservadorVenta {

  @Override
  public void notificarVenta(Venta venta) {
    Cliente cliente = venta.getCliente();
    Sms sms = new Sms(
            cliente.getMail(),
            "Gracias, vuelva pronto"
    );
    SmsSender.deliver(sms);
  }

}
