package recipe.service.subdomain.recipe.product.domain;

import recipe.service.shared.domain.bus.event.DomainEvent;

import java.io.Serializable;
import java.util.HashMap;

public class ProductCreatedDomainEvent extends DomainEvent {


    private final String name;
    private final String unit;

    public ProductCreatedDomainEvent(String id, String name, String unit) {
        super(id);
        this.name = name;
        this.unit = unit;
    }

    public ProductCreatedDomainEvent(
            String aggregateId,
            String eventId,
            String occurredOn,
            String name,
            String unit
    ) {
        super(aggregateId, eventId, occurredOn);

        this.name = name;
        this.unit = unit;
    }

    @Override
    public String eventName() {
        return "product.created";
    }

    @Override
    public HashMap<String, Serializable> toPrimitives() {
        return new HashMap<String, Serializable>() {{
            put("name", name);
            put("unit", unit);
        }};
    }

    @Override
    public ProductCreatedDomainEvent fromPrimitives(
            String aggregateId,
            HashMap<String, Serializable> body,
            String eventId,
            String occurredOn
    ) {
        return new ProductCreatedDomainEvent(
                aggregateId,
                eventId,
                occurredOn,
                (String) body.get("name"),
                (String) body.get("unit"));
    }


}
