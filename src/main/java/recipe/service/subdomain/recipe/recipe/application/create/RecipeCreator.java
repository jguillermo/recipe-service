package recipe.service.subdomain.recipe.recipe.application.create;

import recipe.service.subdomain.recipe.recipe.domain.RecipeRepository;

final public class RecipeCreator {
    private RecipeRepository recipeRepository;

    public RecipeCreator(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }
    

}
