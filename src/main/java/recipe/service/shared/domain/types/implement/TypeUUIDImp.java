package recipe.service.shared.domain.types.implement;

import recipe.service.shared.domain.types.TypeUUID;

public class TypeUUIDImp extends TypeUUID {
    public TypeUUIDImp(String uuid) {
        super(uuid);
    }

    public static TypeUUIDImp create(String value) {
        return new TypeUUIDImp(value);
    }
}
