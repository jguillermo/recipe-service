package recipe.service.subdomain.recipe.product.application.create;


import recipe.service.shared.exception.BadRequestException;
import recipe.service.subdomain.recipe.product.domain.*;

public class ProductCreator {
    private ProductRepository productRepository;

    public ProductCreator(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public void execute(ProductId productId, ProductName productName, ProductUnit productUnit) {

        if (this.productRepository.findById(productId).isPresent()) {
            throw new BadRequestException("El id del producto ya existe");
        }

        Product product = Product.create(productId, productName, productUnit);

        this.productRepository.persist(product);

    }
}
