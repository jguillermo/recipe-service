package recipe.service.shared.domain.types;


import recipe.service.shared.domain.exception.BadRequestException;

public abstract class TypeId extends TypeUUID {

    public TypeId(String id) {
        super(id);
        if (isNull()) {
            throw new BadRequestException(400002, "El id no puede ser nulo");
        }
    }
}
