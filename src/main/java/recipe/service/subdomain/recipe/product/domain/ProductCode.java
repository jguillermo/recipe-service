package recipe.service.subdomain.recipe.product.domain;

import recipe.service.shared.domain.code.AppCode;
import recipe.service.shared.domain.code.SharedCode;

public class ProductCode extends AppCode {


    protected ProductCode(Integer code) {
        super(code);
    }

    public static ProductCode create(Integer code) {
        return new ProductCode(code);
    }

    @Override
    protected String getModuleCode() {
        return "01";
    }
}
