package recipe.service.shared.domain.types

import recipe.service.shared.domain.types.implement.TypeIdImp
import recipe.service.shared.exception.BadRequestException
import spock.lang.Specification

class TypeIdSpec extends Specification {
    void 'cretae value null'() {
        when:
            TypeIdImp.create(null)
        then:
            thrown BadRequestException
    }
}
