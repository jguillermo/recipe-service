package recipe.service.subdomain.recipe.product.application.create;


import recipe.service.shared.domain.bus.event.EventBus;
import recipe.service.shared.domain.exception.BadRequestException;
import recipe.service.subdomain.recipe.product.domain.*;

public class ProductCreator {
    private ProductRepository productRepository;
    private final EventBus eventBus;

    public ProductCreator(ProductRepository productRepository, EventBus eventBus) {
        this.productRepository = productRepository;
        this.eventBus = eventBus;
    }


    public void execute(ProductId productId, ProductName productName, ProductUnit productUnit) {

        if (this.productRepository.findById(productId).isPresent()) {
            throw new BadRequestException(ProductCode.create(1), "El id del producto ya existe");
        }

        Product product = Product.create(productId, productName, productUnit);

        this.productRepository.persist(product);
        this.eventBus.publish(product.pullDomainEvents());

    }
}
