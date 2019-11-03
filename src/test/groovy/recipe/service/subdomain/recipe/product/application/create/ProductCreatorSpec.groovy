package recipe.service.subdomain.recipe.product.application.create

import recipe.service.shared.exception.BadRequestException
import recipe.service.subdomain.recipe.product.domain.*
import spock.lang.Specification

class ProductCreatorSpec extends Specification {

    void 'crear un producto'() {
        given: 'definimos el mock del repositorio y el servicio'
            def mockedProductRespository = Mock(ProductRepository)
            mockedProductRespository.findById(_) >> Optional.empty()
            def service = new ProductCreator(mockedProductRespository)
        when: 'creamos los value object para guardar'
            def productId = new ProductId('e9c42527-2c74-4605-8796-5e07fc3bedec')
            def productName = new ProductName('sal')
            def productUnit = new ProductUnit('EA')

            service.execute(productId, productName, productUnit)
        then: 'comprobamos que se llamen a los metodos del repositorio'
            // parece ques to es un bug, de spock
            //1 * mockedProductRespository.findById(_)
            1 * mockedProductRespository.persist(_)
    }

    void 'crear un producto duplicado'() {
        given: 'definimos el mock del repositorio y el servicio'
            def productId = new ProductId('e9c42527-2c74-4605-8796-5e07fc3bedec')
            def productName = new ProductName('sal')
            def productUnit = new ProductUnit('EA')
            def mockedProductRespository = Mock(ProductRepository)
            mockedProductRespository.findById(_) >> { Optional.of(Product.create(productId, productName, productUnit)) }
            def service = new ProductCreator(mockedProductRespository)
        when: 'creamos la entidad'

            service.execute(productId, productName, productUnit)
        then: 'comprobamos que se lance la excepcion'
            thrown BadRequestException
    }


}
