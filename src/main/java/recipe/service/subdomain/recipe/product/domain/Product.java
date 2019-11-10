package recipe.service.subdomain.recipe.product.domain;

public class Product {
    private ProductId productId;
    private ProductName productName;
    private ProductUnit productUnit;

    public Product(ProductId productId, ProductName productName, ProductUnit productUnit) {
        this.productId = productId;
        this.productName = productName;
        this.productUnit = productUnit;
    }

    public static Product create(ProductId productId, ProductName productName, ProductUnit productUnit) {
        return new Product(productId, productName, productUnit);
    }

    public ProductId productId() {
        return productId;
    }

    public ProductName productName() {
        return productName;
    }

    public ProductUnit productUnit() {
        return productUnit;
    }

    @Override
    public String toString() {
        return  productUnit  + " de " + productName;
    }
}
