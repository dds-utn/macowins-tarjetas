import org.junit.Test;
import static org.junit.Assert.*;

public class VentaTest {
    @Test
    public void probarQueLaVentaPuedeCobrarSatisfactoriamente() {
        Cliente cliente = new Cliente("alan", "szpigiel", "123123", "798789", "4567");
        MedioDePago pagoVisa = new PagoVisa();
        Venta venta = new Venta(cliente, 100, pagoVisa);

        venta.cobrar();
    }
}
