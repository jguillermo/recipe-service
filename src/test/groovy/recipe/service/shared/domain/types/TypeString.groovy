package recipe.service.shared.domain.types

import spock.lang.Specification


class TypeStringImp extends TypeString {
    TypeStringImp(String value) {
        super(value)
    }

    public static TypeStringImp create(String value) {
        return new TypeStringImp(value)
    }
}

class TypeStringSpec extends Specification {

    void 'get value'() {
        expect:
            TypeStringImp.create(a).value() == b
        where:
            a || b
            '' || ''
            ' ' || ' '
            '_' || '_'
            ' _' || ' _'
            '"' || '"'
            'abcdefghiABCDFG' || 'abcdefghiABCDFG'
            'aAáéíóúÁÉÍÓÚÑñ' || 'aAáéíóúÁÉÍÓÚÑñ'
    }

    void 'get toString'() {
        expect:
            TypeStringImp.create(a).toString() == b
        where:
            a || b
            'abcdefghiABCDFG' || 'abcdefghiABCDFG'
    }

    void 'len string'() {
        expect:
            TypeStringImp.create(a).length() == b
        where:
            a || b
            'a' || 1
            'a-z' || 3
            'ñÑ' || 2
            'á' || 1
            'áéíóúÁÉÍÓÚÑñ' || 12
            'á é' || 3
    }



}
