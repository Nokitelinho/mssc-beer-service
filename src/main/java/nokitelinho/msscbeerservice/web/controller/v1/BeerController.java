package nokitelinho.msscbeerservice.web.controller.v1;

import nokitelinho.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("/{beerId}")
    public ResponseEntity getBeerById(@PathVariable("beerId") UUID beerId) {
        //TODO
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {
        //TODO saveBeer impl
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeer(@PathVariable("beerId") UUID beerId,
                                     @RequestBody BeerDto beerDto) {
        //TODO updateBeer impl
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }
}
