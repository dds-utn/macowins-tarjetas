public class ObservadorDePrueba implements ObservadorVenta {

    private int cantidadDeLlamados = 0;

    @Override
    public void notificarVenta(Venta venta) {
        cantidadDeLlamados += 1;
    }

    public int getCantidadDeLlamados() {
        return cantidadDeLlamados;
    }
}
