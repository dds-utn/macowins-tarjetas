
public class Venta {

  private Cliente cliente;
  private double monto;
  private MedioDePago medioDePago;

  public Venta(Cliente cliente, double monto, MedioDePago medioDePago) {
    this.cliente = cliente;
    this.monto = monto;
    this.medioDePago = medioDePago;
  }

  public void cobrar() {
    medioDePago.cobrar(cliente, monto);
  }

}
