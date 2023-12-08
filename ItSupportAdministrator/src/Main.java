import com.gl.email_app.CredentialServiceImpl;
import com.gl.email_app.EmailApplication;

public class Main {
    public static void main(String[] args) {
        //testEmailGeneration();
        //testGeneratePassword();
        testApplicationEntryPoint();
    }

    static void testEmailGeneration() {
        CredentialServiceImpl credentialService = new CredentialServiceImpl();
        System.out.println(credentialService.generateEmailAddress("Jitendra","Singh", 1));
    }

    static void testGeneratePassword() {
        CredentialServiceImpl credentialService = new CredentialServiceImpl();
        System.out.println(credentialService.generatePassword());
    }

    static void testApplicationEntryPoint() {
        EmailApplication emailApplication = new EmailApplication();
        emailApplication.init();
    }

}