package recipe.service.subdomain.recipe.product.domain



import spock.lang.Specification

class ProductSpec extends Specification {
    void 'Entidad producto'() {
        given: 'definimos los value object'
            def productId = new ProductId('e9c42527-2c74-4605-8796-5e07fc3bedec')
            def productName = new ProductName('sal')
            def productUnit = new ProductUnit('EA')
        when: 'creamos la entidad'
            def product = Product.create(productId, productName, productUnit)
        then: 'comprobamos la entidad'
            product.name().value() == 'sal'
            product.id().value() == 'e9c42527-2c74-4605-8796-5e07fc3bedec'
            product.unit().value() == 'EA'
            "" + product == 'EA de sal'
    }
}
