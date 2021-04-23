package nokitelinho.msscbeerservice.web.services.v1;

import nokitelinho.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
