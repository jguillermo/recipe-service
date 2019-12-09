package recipe.service.shared.domain.exception;

public class BadRequestException extends AppException {


    private static final int STATUS_CODE = 400;

    /**
     * recomendaciones para el code
     * se antepone el status code
     * para el modulo shared poner 00, es muy improbable que tengas mas de 99  agregates
     * y luego poner un codigo para describir el error
     * ejemplo : 400 00 xxx
     * @param code
     */
    public BadRequestException(int code) {
        super(STATUS_CODE, code, "");
    }

    public BadRequestException(int code, String message) {
        super(STATUS_CODE, code, message);
    }

}