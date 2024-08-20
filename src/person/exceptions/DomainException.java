package person.exceptions;

public class DomainException extends Exception{

	private static final long serialVersionUID = 1L;

	public DomainException(String txt) {
		super(txt);
	}
	
}
