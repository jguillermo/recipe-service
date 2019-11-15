package recipe.service.subdomain.recipe.product.domain;

import recipe.service.shared.domain.AggregateRoot;

public class Product extends AggregateRoot {
    private ProductId id;
    private ProductName name;
    private ProductUnit unit;

    private Product(ProductId id, ProductName name, ProductUnit unit) {
        this.id = id;
        this.name = name;
        this.unit = unit;
    }

    public static Product create(ProductId id, ProductName name, ProductUnit unit) {
        var product = new Product(id, name, unit);

        product.record(new ProductCreated(id.value(), name.value(), unit.value()));

        return product;
    }

    public ProductId id() {
        return id;
    }

    public ProductName name() {
        return name;
    }

    public ProductUnit unit() {
        return unit;
    }

    @Override
    public String toString() {
        return unit + " de " + name;
    }
}
