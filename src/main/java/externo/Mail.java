package externo;

public class Mail {

  private String sender;
  private String recipient;
  private String blankCarbonCopy;
  private String subject;
  private String body;

  public Mail(String sender, String recipient, String blankCarbonCopy, String subject, String body) {
    this.sender = sender;
    this.recipient = recipient;
    this.blankCarbonCopy = blankCarbonCopy;
    this.subject = subject;
    this.body = body;
  }

}
