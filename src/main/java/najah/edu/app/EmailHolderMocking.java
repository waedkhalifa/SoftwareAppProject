package najah.edu.app;
import static org.mockito.Mockito.*;

public class EmailHolderMocking {
	
	private WebEmailService emailService=mock(WebEmailService.class);// WebEmailService is thirdparty
	
	public EmailHolderMocking() {
		
		TheFinder.setEmailservice(emailService);
		ChooseByCombine.setEmailservice(emailService);
	} 
	
	public WebEmailService getEmailService() {
		return emailService;
	}
	
	public void setEmailService(WebEmailService emailService) {
		this.emailService=emailService;
	}

}
