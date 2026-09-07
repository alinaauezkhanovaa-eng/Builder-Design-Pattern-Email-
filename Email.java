package email.example;

public class Email {
    private final String  recipient,subject,body;
    private final boolean isHtml;
    Email(String recipient, String subject, String body, boolean isHtml) {
        this.recipient=recipient;this.subject=subject;this.body=body;this.isHtml=isHtml;
    }
    @Override
    public String toString(){
        return "Email[To:"+recipient+",Subject:"+subject+",Format:"+(isHtml?"HTML":"Plain Text")+",Body length:"+body.length()+"chars]";
    }
}
