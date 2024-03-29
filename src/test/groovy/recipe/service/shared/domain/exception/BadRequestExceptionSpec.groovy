package recipe.service.shared.domain.exception

import recipe.service.shared.domain.code.SharedCode
import spock.lang.Specification

class BadRequestExceptionSpec extends Specification {
    void 'lanza el error generico con texto'() {
        when:
            throw new BadRequestException(SharedCode.create(1), "error A")
        then:
            thrown BadRequestException
    }

    void 'lanza el error generico sin texto'() {
        when:
            throw new BadRequestException(SharedCode.create(1))
        then:
            thrown BadRequestException
    }
}
