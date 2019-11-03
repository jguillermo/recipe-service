package recipe.service.shared.domain.types;

import example.micronaut.shared.exception.BadRequestException;

public abstract class TypeId extends TypeUUID {

    public TypeId(String id) {
        super(id);
        if (isNull()) {
            throw new BadRequestException("El id no puede nulo");
        }
    }
}
