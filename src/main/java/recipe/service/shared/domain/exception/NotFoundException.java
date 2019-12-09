package recipe.service.shared.domain.exception;

public class NotFoundException extends AppException {

    private static final int STATUS_CODE = 404;

    public NotFoundException(int code) {
        super(STATUS_CODE, code, "");
    }

    public NotFoundException(int code, String message) {
        super(STATUS_CODE, code, message);
    }



}