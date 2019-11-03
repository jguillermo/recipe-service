package recipe.service.subdomain.recipe.recipe.domain.recipeproduct;

import recipe.service.shared.domain.types.TypeInteger;
import recipe.service.shared.exception.BadRequestException;

public class Count extends TypeInteger {

    public Count(Integer value) {
        super(value);
        if (value() <= 0) {
            throw new BadRequestException("la cantida de la receta debe ser mayor que cero");
        }
    }

    @Override
    public String toString() {
        return null;
    }
}
