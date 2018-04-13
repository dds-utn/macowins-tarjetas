import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ObservadorSumarPuntosIntegrationTest {

    @Test
    public void probarQueSiSeLlamaALaNotificacionSeVaASumarPuntos() {
        Cliente cliente = new Cliente("alan", "szpigiel", "123123", "798789", "4567", "alanszp@gmail.com", "124124");
        MedioDePago pagoVisa = new PagoSiempreAprueba();
        Venta venta = new Venta(cliente, 5000, pagoVisa);

        ObservadorVenta observadorDePrueba = new ObservadorSumarPuntos();
        venta.agregarObservador(observadorDePrueba);

        venta.cobrar();

        assertEquals(5, cliente.getPuntosPorVentaAcumlados());
    }
}
