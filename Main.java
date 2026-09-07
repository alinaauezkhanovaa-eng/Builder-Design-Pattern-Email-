package email.example;
public class Main{
    public static void main(String[] args) {
        EmailDirector director=new EmailDirector();

        EmailObjectBuilder objbuilder=new EmailObjectBuilder();
        director.makeWelcomeEmail(objbuilder);
        Email welcomeEmail=objbuilder.getResult();

        EmailPreviewBuilder previewbuilder=new EmailPreviewBuilder();
        director.makeWelcomeEmail(previewbuilder);
        String emailPreview=previewbuilder.getResult();
        System.out.println(emailPreview);
    }
}
