package nokitelinho.msscbeerservice.web.mappers;

import nokitelinho.msscbeerservice.web.domain.Beer;
import nokitelinho.msscbeerservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {
    BeerDto BeerToBeerDto(Beer beer);

    Beer BeerDtoToBeer(BeerDto dto);
}
