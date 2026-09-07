package email.example;
//Builder
public interface EmailBuilder {
    EmailBuilder setRecipient(String recipient);
    EmailBuilder setSubject(String subject);
    EmailBuilder setBody(String body);
    EmailBuilder setIsHtml(boolean isHtml);
}
