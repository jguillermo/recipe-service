package recipe.service.shared.domain.types.implement;

import recipe.service.shared.domain.types.TypeDateTime;

import java.time.LocalDateTime;

public class TypeDateTimeImp extends TypeDateTime {
    public TypeDateTimeImp(LocalDateTime value) {
        super(value);
    }

    public static TypeDateTimeImp create(int year, int month, int day) {
        LocalDateTime dateTime = LocalDateTime.of(year, month, day, 0, 0, 0);
        return new TypeDateTimeImp(dateTime);
    }

    public static TypeDateTimeImp create(int year, int month, int day, int hour, int minute, int second) {
        LocalDateTime dateTime = LocalDateTime.of(year, month, day, hour, minute, second);
        return new TypeDateTimeImp(dateTime);
    }

    public static TypeDateTimeImp now() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateTime = LocalDateTime.of(now.getYear(), now.getMonth(), now.getDayOfMonth(), now.getHour(), now.getMinute(), now.getSecond());
        return new TypeDateTimeImp(dateTime);
    }
}
