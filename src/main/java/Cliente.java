
public class Cliente {

  private String nombre;
  private String apellido;
  private String dni;
  private String numeroTarjeta;
  private String pin;
  private String mail;
  private String celular;
  private int puntosPorVentaAcumlados = 0;

  public Cliente(String nombre, String apellido, String dni, String numeroTarjeta, String pin, String mail, String celular) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.numeroTarjeta = numeroTarjeta;
    this.pin = pin;
    this.mail = mail;
    this.celular = celular;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getDni() {
    return dni;
  }

  public String getNumeroTarjeta() {
    return numeroTarjeta;
  }

  public String getPin() {
    return pin;
  }

  public String getNombreCompleto() {
    return nombre + " " + apellido;
  }

  public String getMail() {
    return mail;
  }

  public String getCelular() {
    return celular;
  }

  public void aumentarPuntosPorVenta(int puntosPorVenta) {
    puntosPorVentaAcumlados += puntosPorVenta;
  }

}
