package recipe.service.subdomain.recipe.product.domain;

import recipe.service.shared.domain.DomainEvent;

import java.util.Objects;

public class ProductCreated implements DomainEvent {
    private static final String FULL_QUALIFIED_EVENT_NAME = "recipe.service.recipe.event.product.created";

    private final String id;
    private final String name;
    private final String unit;

    public ProductCreated(String id, String name, String unit) {
        this.id = id;
        this.name = name;
        this.unit = unit;
    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String unit() {
        return unit;
    }

    @Override
    public String fullQualifiedEventName() {
        return FULL_QUALIFIED_EVENT_NAME;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductCreated that = (ProductCreated) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(name, that.name) &&
                Objects.equals(unit, that.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, unit);
    }
}
