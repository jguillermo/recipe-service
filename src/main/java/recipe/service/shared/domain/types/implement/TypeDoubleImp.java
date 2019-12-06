package recipe.service.shared.domain.types.implement;

import recipe.service.shared.domain.types.TypeDouble;

final public class TypeDoubleImp extends TypeDouble {
    public TypeDoubleImp(Double value) {
        super(value);
    }

    public static TypeDoubleImp create(Double value) {
        return new TypeDoubleImp(value);
    }
}
