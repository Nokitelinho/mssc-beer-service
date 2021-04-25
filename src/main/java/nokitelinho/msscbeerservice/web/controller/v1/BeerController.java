package nokitelinho.msscbeerservice.web.controller.v1;

import lombok.RequiredArgsConstructor;
import nokitelinho.msscbeerservice.services.BeerService;
import nokitelinho.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/beer")
public class BeerController {
    private final BeerService beerService;

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        var beerDto = beerService.getById(beerId);
        return new ResponseEntity<>(beerDto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<BeerDto> saveNewBeer(@Valid @RequestBody BeerDto beerDto) {
        var newBeerDto = beerService.saveNewBeer(beerDto);
        return new ResponseEntity<>(newBeerDto, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<BeerDto> updateBeer(@PathVariable("beerId") UUID beerId,
                                              @Valid @RequestBody BeerDto beerDto) {
        var updateBeer = beerService.updateBeer(beerId, beerDto);
        return new ResponseEntity<>(updateBeer, HttpStatus.NO_CONTENT);
    }
}
