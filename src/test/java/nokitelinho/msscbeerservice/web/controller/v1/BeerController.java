package nokitelinho.msscbeerservice.web.controller.v1;

import nokitelinho.msscbeerservice.web.model.BeerDto;
import nokitelinho.msscbeerservice.web.services.v1.BeerService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {
    private final BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping("/{beerId}")
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {
        BeerDto beerDto = beerService.getBeerById(beerId);
        return new ResponseEntity<>(beerDto, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {
        //TODO saveBeer impl
        return new ResponseEntity(HttpStatus.OK);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId,
                                     @RequestBody BeerDto beerDto) {
        //TODO updateBeer impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
