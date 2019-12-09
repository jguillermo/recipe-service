package recipe.service.shared.domain.code;

public class SharedCode extends AppCode {

    protected SharedCode(Integer code) {
        super(code);
    }

    public static SharedCode create(Integer code) {
        return new SharedCode(code);
    }

    @Override
    protected String getModuleCode() {
        return "00";
    }
}
