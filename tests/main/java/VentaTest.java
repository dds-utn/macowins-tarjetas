import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class VentaTest {
    @Test
    public void probarQueLaVentaPuedeCobrarSatisfactoriamente() {
        Cliente cliente = new Cliente("alan", "szpigiel", "123123", "798789", "4567", "alanszp@gmail.com", "124124");
        MedioDePago pagoVisa = new PagoSiempreAprueba();
        Venta venta = new Venta(cliente, 100, pagoVisa);

        venta.cobrar();
    }

    @Test(expected = RuntimeException.class)
    public void probarQueLaVentaPuedeFallar() {
        Cliente cliente = new Cliente("alan", "szpigiel", "123123", "798789", "4567", "alanszp@gmail.com", "124124");
        MedioDePago pagoVisa = new PagoSiempreFalla();
        Venta venta = new Venta(cliente, 100, pagoVisa);

        venta.cobrar();
    }

    @Test
    public void probarQueSeLlameAlObservador() {
        Cliente cliente = new Cliente("alan", "szpigiel", "123123", "798789", "4567", "alanszp@gmail.com", "124124");
        MedioDePago pagoVisa = new PagoSiempreAprueba();
        Venta venta = new Venta(cliente, 100, pagoVisa);

        ObservadorDePrueba observadorDePrueba = new ObservadorDePrueba();
        venta.agregarObservador(observadorDePrueba);

        venta.cobrar();

        assertEquals(1, observadorDePrueba.getCantidadDeLlamados());
    }

    @Test
    public void probarQueSeLlameAlObservadorDosVeces() {
        Cliente cliente = new Cliente("alan", "szpigiel", "123123", "798789", "4567", "alanszp@gmail.com", "124124");
        MedioDePago pagoVisa = new PagoSiempreAprueba();
        Venta venta = new Venta(cliente, 100, pagoVisa);

        ObservadorDePrueba observadorDePrueba = new ObservadorDePrueba();
        venta.agregarObservador(observadorDePrueba);
        venta.agregarObservador(observadorDePrueba);

        venta.cobrar();

        assertEquals(2, observadorDePrueba.getCantidadDeLlamados());
    }

    @Test
    public void probarQueSeLlameADosObservadoresDistintos() {
        Cliente cliente = new Cliente("alan", "szpigiel", "123123", "798789", "4567", "alanszp@gmail.com", "124124");
        MedioDePago pagoVisa = new PagoSiempreAprueba();
        Venta venta = new Venta(cliente, 100, pagoVisa);

        ObservadorDePrueba observadorDePrueba1 = new ObservadorDePrueba();
        ObservadorDePrueba observadorDePrueba2 = new ObservadorDePrueba();
        venta.agregarObservador(observadorDePrueba1);
        venta.agregarObservador(observadorDePrueba2);

        venta.cobrar();

        assertEquals(1, observadorDePrueba1.getCantidadDeLlamados());
        assertEquals(1, observadorDePrueba2.getCantidadDeLlamados());
    }
}
