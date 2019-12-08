package recipe.service.shared.domain.types.implement;

import recipe.service.shared.domain.types.TypeId;

public class TypeIdImp extends TypeId {
    public TypeIdImp(String id) {
        super(id);
    }

    public static TypeIdImp create(String id) {
        return new TypeIdImp(id);
    }
}
