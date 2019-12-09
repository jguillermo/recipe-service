package recipe.service.shared.domain.types;


import recipe.service.shared.domain.code.SharedCode;
import recipe.service.shared.domain.exception.BadRequestException;

public abstract class TypeId extends TypeUUID {

    public TypeId(String id) {
        super(id);
        if (isNull()) {
            throw new BadRequestException(SharedCode.create(2), "El id no puede ser nulo");
        }
    }
}
