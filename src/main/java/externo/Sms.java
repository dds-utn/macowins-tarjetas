package externo;

public class Sms {

  private String recipient;
  private String message;

  public Sms(String recipient, String message) {
    this.recipient = recipient;
    this.message = message;
  }

  public String getMessage() {
    return message;
  }

  public String getRecipient() {
    return recipient;
  }
}
