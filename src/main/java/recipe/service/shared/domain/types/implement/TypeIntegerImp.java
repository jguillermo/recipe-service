package recipe.service.shared.domain.types.implement;

import recipe.service.shared.domain.types.TypeInteger;

final public class TypeIntegerImp extends TypeInteger {
    TypeIntegerImp(Integer value) {
        super(value);
    }

    public static TypeIntegerImp create(Integer value) {
        return new TypeIntegerImp(value);
    }
}