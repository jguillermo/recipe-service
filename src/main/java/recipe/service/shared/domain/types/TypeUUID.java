package recipe.service.shared.domain.types;


import recipe.service.shared.domain.exception.BadRequestException;

import java.util.UUID;

public abstract class TypeUUID extends TypeString {

    public TypeUUID(String uuid) {
        super(uuid);
        isValidate();
    }

    private void isValidate() {
        if (isNull()) {
            return;
        }
        try {
            UUID.fromString(value());
        } catch (IllegalArgumentException exception) {
            throw new BadRequestException(400001,"Uuid value no valid");
        }

    }
}
