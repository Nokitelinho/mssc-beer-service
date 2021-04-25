package nokitelinho.msscbeerservice.services;

import nokitelinho.msscbeerservice.web.controller.NotFoundException;
import nokitelinho.msscbeerservice.web.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getById(UUID beerId) throws NotFoundException;

    BeerDto saveNewBeer(BeerDto beerDto);

    BeerDto updateBeer(UUID beerId, BeerDto beerDto);
}
