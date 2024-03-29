package recipe.service.shared.domain.exception;

import lombok.Getter;
import recipe.service.shared.domain.code.AppCode;

@Getter
public class AppException extends RuntimeException {

    // https://en.wikipedia.org/wiki/List_of_HTTP_status_codes

    private Integer statusCode;
    private Integer code;
    private String message;

    public AppException(Integer statusCode, AppCode code, String message) {
        this.statusCode = statusCode;
        this.code = this.generateCode(code);
        this.message = message;
    }
    private Integer generateCode(AppCode code){
        String concatcode = this.statusCode.toString().concat(code.value());
        return Integer.parseInt(concatcode);
    }
}
