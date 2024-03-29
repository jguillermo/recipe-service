package recipe.service.shared.domain.types

import recipe.service.shared.domain.types.implement.TypeDateTimeImp
import spock.lang.Specification

import java.time.LocalDateTime

class TypeDateTimeSpec extends Specification {

    void 'get formatDate'() {
        expect:
            TypeDateTimeImp.create(y, m, d).formatDate() == dt
        where:
            y    | m | d || dt
            2019 | 1 | 1 || '2019-01-01'
    }

    void 'get formatDateTime'() {
        expect:
            TypeDateTimeImp.create(y, m, d, h, mm, s).formatDateTime() == dt
        where:
            y    | m | d | h | mm | s  || dt
            2019 | 1 | 1 | 5 | 20 | 45 || '2019-01-01T05:20:45'
    }

    void 'date now'() {
        when:
            def now = LocalDateTime.now();
            def dateNow = TypeDateTimeImp.now()
        then:
            now.getYear() == dateNow.value().getYear()
    }


}
