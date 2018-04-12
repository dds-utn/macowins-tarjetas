
public class Cliente {

  private String nombre;
  private String apellido;
  private String dni;
  private String numeroTarjeta;
  private String pin;

  public Cliente(String nombre, String apellido, String dni, String numeroTarjeta, String pin) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
    this.numeroTarjeta = numeroTarjeta;
    this.pin = pin;
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

}
