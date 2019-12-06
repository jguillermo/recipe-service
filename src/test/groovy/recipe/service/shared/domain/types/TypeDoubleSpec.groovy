package recipe.service.shared.domain.types

import recipe.service.shared.domain.types.implement.TypeDoubleImp
import spock.lang.Specification

class TypeDoubleSpec extends Specification {
    void 'get value'() {
        expect:
            TypeDoubleImp.create(a).value() == b
        where:
            a    || b
            1.0  || 1.0
            1    || 1.0
            0.0  || 0.0
            -1.0 || -1.0
            null || null
    }

    void 'get toString'() {
        expect:
            TypeDoubleImp.create(a).toString() == b
        where:
            a    || b
            1.0  || '1.0'
            1    || '1.0'
            0.0  || '0.0'
            -1.0 || '-1.0'
            null || ''
    }

    void 'is null'() {
        expect:
            TypeDoubleImp.create(a).isNull() == b
        where:
            a    || b
            1.0  || false
            1    || false
            0.0  || false
            -1.0 || false
            null || true
    }
}
