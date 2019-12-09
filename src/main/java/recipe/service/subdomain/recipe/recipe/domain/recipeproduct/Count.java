package recipe.service.subdomain.recipe.recipe.domain.recipeproduct;

import recipe.service.shared.domain.types.TypeInteger;
import recipe.service.shared.domain.exception.BadRequestException;
import recipe.service.subdomain.recipe.recipe.domain.RecipeCode;

public class Count extends TypeInteger {

    public Count(Integer value) {
        super(value);
        if (value() <= 0) {
            throw new BadRequestException(RecipeCode.create(1), "la cantida de la receta debe ser mayor que cero");
        }
    }

    @Override
    public String toString() {
        return null;
    }
}
