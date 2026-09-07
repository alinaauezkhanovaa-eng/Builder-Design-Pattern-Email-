package email.example;

public class EmailDirector {
    public void makeWelcomeEmail(EmailBuilder e){
        e.setRecipient("linna@email.com").setSubject("Welcome to the email sender!").setBody("Hi!Thanks for registering.").setIsHtml(true);
    }
    public void makeSecurityAlerttEmail(EmailBuilder e){
        e.setRecipient("alinn@email.com").setSubject("Security Alert!New Login").setBody("We've find new login to ur account from the web-browser.").setIsHtml(false);
    }
}
