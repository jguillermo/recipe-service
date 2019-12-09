package recipe.service.subdomain.recipe.recipe.domain;

import recipe.service.shared.domain.code.AppCode;
import recipe.service.shared.domain.code.SharedCode;

public class RecipeCode extends AppCode {

    protected RecipeCode(Integer code) {
        super(code);
    }

    public static RecipeCode create(Integer code) {
        return new RecipeCode(code);
    }

    @Override
    protected String getModuleCode() {
        return "02";
    }
}
