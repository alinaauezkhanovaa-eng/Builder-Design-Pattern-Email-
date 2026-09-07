package email.example;

public class EmailObjectBuilder implements EmailBuilder{
    private String recipient,subject,body;
    private boolean isHtml;
    public EmailObjectBuilder setRecipient(String recipient){this.recipient=recipient;return this;}
    public EmailObjectBuilder setSubject(String subject){this.subject=subject;return this;}
    public EmailObjectBuilder setBody(String body){this.body=body;return this;}
    public EmailObjectBuilder setIsHtml(boolean isHtml){this.isHtml=isHtml;return this;}
    public Email getResult(){
        if (recipient==null || ! recipient.contains("@")){
            throw new IllegalArgumentException("Valid recipient email's required");
        }
        if (subject==null || subject.isEmpty()){
            throw new IllegalStateException("Email subject can't be empty");
        }
        return new Email(recipient,subject,body,isHtml);
    }
}
