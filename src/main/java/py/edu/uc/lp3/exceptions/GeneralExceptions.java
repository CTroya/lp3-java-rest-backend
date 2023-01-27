package py.edu.uc.lp3.exceptions;

public class GeneralExceptions extends RuntimeException {
	private static final long serialVersionUID = -1274534847665982497L;
	public GeneralExceptions() {
		super();
	}

	public GeneralExceptions(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public GeneralExceptions(String message, Throwable cause) {
		super(message, cause);
	}

	public GeneralExceptions(String message) {
		super(message);
	}
	public GeneralExceptions(Throwable cause) {
		super(cause);	
	}
}
