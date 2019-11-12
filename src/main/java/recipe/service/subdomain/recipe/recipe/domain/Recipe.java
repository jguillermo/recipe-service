package recipe.service.subdomain.recipe.recipe.domain;

import recipe.service.subdomain.recipe.recipe.domain.recipeproduct.RecipeProduct;

import java.util.List;

public class Recipe {
    private RecipeId id;
    private List<RecipeProduct> recipeProducts;
    private Preparation preparation;
}
