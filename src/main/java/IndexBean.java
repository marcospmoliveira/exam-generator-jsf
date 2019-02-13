import java.io.Serializable;

import javax.faces.event.NamedEvent;
import javax.faces.view.ViewScoped;

@NamedEvent
@ViewScoped
public class IndexBean implements Serializable {
	private String message = "Wooooooorking";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
