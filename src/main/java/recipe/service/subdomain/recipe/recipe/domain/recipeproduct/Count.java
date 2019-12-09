package recipe.service.subdomain.recipe.recipe.domain.recipeproduct;

import recipe.service.shared.domain.types.TypeInteger;
import recipe.service.shared.domain.exception.BadRequestException;

public class Count extends TypeInteger {

    public Count(Integer value) {
        super(value);
        if (value() <= 0) {
            throw new BadRequestException(400021, "la cantida de la receta debe ser mayor que cero");
        }
    }

    @Override
    public String toString() {
        return null;
    }
}
