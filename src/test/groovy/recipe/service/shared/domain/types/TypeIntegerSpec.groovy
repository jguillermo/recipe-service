package recipe.service.shared.domain.types

import recipe.service.shared.domain.types.implement.TypeIntegerImp
import spock.lang.Specification


class TypeIntegerSpec extends Specification {
    void 'get value'() {
        expect:
            TypeIntegerImp.create(a).value() == b
        where:
            a    || b
            1    || 1
            0    || 0
            -1   || -1
            null || null
    }

    void 'get toString'() {
        expect:
            TypeIntegerImp.create(a).toString() == b
        where:
            a    || b
            1    || '1'
            0    || '0'
            -1   || '-1'
            null || ''
    }

    void 'is null'() {
        expect:
            TypeIntegerImp.create(a).isNull() == b
        where:
            a    || b
            1    || false
            0    || false
            -1   || false
            null || true
    }
}
