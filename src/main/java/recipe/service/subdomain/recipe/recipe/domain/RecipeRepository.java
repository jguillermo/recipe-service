package recipe.service.subdomain.recipe.recipe.domain;

import java.util.Optional;

public interface RecipeRepository {

    public Optional<Recipe> findById(RecipeId id);

    public void persist(Recipe recipe);

}
