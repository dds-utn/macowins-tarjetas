import java.util.ArrayList;

public class Venta {

  private Cliente cliente;
  private double monto;
  private MedioDePago medioDePago;
  private ArrayList<ObservadorVenta> observadores;

  public Cliente getCliente() {
    return cliente;
  }

  public Venta(Cliente cliente, double monto, MedioDePago medioDePago) {
    this.cliente = cliente;
    this.monto = monto;
    this.medioDePago = medioDePago;
    this.observadores = new ArrayList<ObservadorVenta>();
  }

  public void cobrar() {
    medioDePago.cobrar(cliente, monto);
    this.notificarObservadores();
  }

  public int getPuntosPorVenta() {
    return (int) (monto / 1000);
  }

  public void agregarObservador(ObservadorVenta observador) {
    this.observadores.add(observador);
  }

  public void notificarObservadores() {
    this.observadores.forEach((observador) -> observador.notificarVenta(this));
  }

}
