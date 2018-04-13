import externo.Mail;
import externo.MailSender;

public class ObservadorEnviarMail implements ObservadorVenta {

  @Override
  public void notificarVenta(Venta venta) {
    Cliente cliente = venta.getCliente();
    Mail mail = new Mail(
            "ventas@macowins.com",
            cliente.getMail(),
            "copias@macowins.com",
            "Gracias por su compra",
            "Gracias, vuelva pronto"
    );
    MailSender.sendMail(mail);
  }

}
