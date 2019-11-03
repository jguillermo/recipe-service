package recipe.service.shared.exception;

public class ConflictRequestException extends LclException {
	private static final long serialVersionUID = 1L;

	public ConflictRequestException(String message) {
		super(409, 4, message, new Object());
	}

	public ConflictRequestException(String message, Object data) {
		super(409, 4, message, data);
	}

	public ConflictRequestException(String message, Object data, int code) {
		super(409, code, message, data);
	}

	public ConflictRequestException(String message, int code) {
		super(409, code, message, new Object());
	}
}