package email.example;

public class EmailPreviewBuilder implements EmailBuilder{
    private final StringBuilder sb =new StringBuilder("===OUTGOING EMAIL PREVIEW===\n");
    public EmailPreviewBuilder setRecipient(String recipient){sb.append("To:").append(recipient).append("\n");return this;}
    public EmailPreviewBuilder setSubject(String subject_){
        sb.append("Subject:").append(subject).append("\n");return this;
    }
    public EmailPreviewBuilder setBody(String body){
        sb.append("Content:").append(body).append("\n");return this;
    }
    public EmailPreviewBuilder setIsHtml(boolean isHtml){sb.append("Type:").append(isHtml?"HTML Format":"Plain Text").append("\n");return this;}
    public String getResult(){return sb.toString();}
}
