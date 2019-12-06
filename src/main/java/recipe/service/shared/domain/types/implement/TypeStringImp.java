package recipe.service.shared.domain.types.implement;

import recipe.service.shared.domain.types.TypeString;

final public class TypeStringImp extends TypeString {
    TypeStringImp(String value) {
        super(value);
    }

    public static TypeStringImp create(String value) {
        return new TypeStringImp(value);
    }
}
