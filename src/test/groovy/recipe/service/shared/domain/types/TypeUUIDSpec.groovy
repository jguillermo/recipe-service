package recipe.service.shared.domain.types


import recipe.service.shared.domain.types.implement.TypeUUIDImp
import recipe.service.shared.domain.exception.BadRequestException

import spock.lang.Specification

class TypeUUIDSpec extends Specification {
    void 'get value'() {
        expect:
            TypeUUIDImp.create(a).value() == b
        where:
            a                                      || b
            '9eccbece-f4df-4565-83fa-8f118b29ec45' || '9eccbece-f4df-4565-83fa-8f118b29ec45'
            null                                   || null
    }

    void 'get toString'() {
        expect:
            TypeUUIDImp.create(a).toString() == b
        where:
            a                                      || b
            '9eccbece-f4df-4565-83fa-8f118b29ec45' || '9eccbece-f4df-4565-83fa-8f118b29ec45'
            null                                   || ''
    }

    void 'is null'() {
        expect:
            TypeUUIDImp.create(a).isNull() == b
        where:
            a                                      || b
            '9eccbece-f4df-4565-83fa-8f118b29ec45' || false
            null                                   || true
    }

    void 'len string'() {
        expect:
            TypeUUIDImp.create(a).length() == b
        where:
            a                                      || b
            '9eccbece-f4df-4565-83fa-8f118b29ec45' || 36
            null                                   || 0
    }

    void 'invalid uuid'() {

        when:
            TypeUUIDImp.create('invalid uuid')
        then:
            thrown BadRequestException
    }

}
