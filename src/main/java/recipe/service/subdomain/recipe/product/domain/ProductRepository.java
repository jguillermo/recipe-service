package recipe.service.subdomain.recipe.product.domain;

import java.util.Optional;

public interface ProductRepository {
    public boolean persist(Product product);

    public Optional<Product> findById(ProductId productId);
}
