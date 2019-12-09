package recipe.service.shared.domain.exception;

import lombok.Getter;

@Getter
public class AppException extends RuntimeException {

	// https://en.wikipedia.org/wiki/List_of_HTTP_status_codes


	
	private int statusCode;
	private int code;
	private String message;

	public AppException(int statusCode, int code, String message) {
		this.statusCode = statusCode;
		this.code = code;
		this.message = message;
	}
}
