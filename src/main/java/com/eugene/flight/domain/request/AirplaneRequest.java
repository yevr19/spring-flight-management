package com.eugene.flight.domain.request;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

@Getter
@Builder
@EqualsAndHashCode(callSuper = false)
@Relation(itemRelation = "airplane", collectionRelation = "airplanes")
public class AirplaneRequest extends RepresentationModel<AirplaneRequest> {
    private final Long id;
    private final String name;
    private final String serialNumber;
    private final String type;
}
