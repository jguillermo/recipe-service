package recipe.service.subdomain.recipe.product.domain;

public class Product {
    private ProductId id;
    private ProductName name;
    private ProductUnit unit;

    public Product(ProductId id, ProductName name, ProductUnit unit) {
        this.id = id;
        this.name = name;
        this.unit = unit;
    }

    public static Product create(ProductId id, ProductName name, ProductUnit unit) {
        return new Product(id, name, unit);
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
