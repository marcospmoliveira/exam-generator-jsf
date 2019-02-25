import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.examgenerator.persistence.dao.LoginDAO;
import br.com.examgenerator.persistence.model.Token;

@Named
@ViewScoped
public class IndexBean implements Serializable {
	private String message = "Wooooooorking";
	private final LoginDAO loginDAO;
	
	@Inject
	public IndexBean(LoginDAO loginDAO) {
		this.loginDAO = loginDAO;
	}
	
	public void login() {
		Token token = loginDAO.loginReturningToken("marcos", "devdojo");
		System.out.println(token);
	}
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
