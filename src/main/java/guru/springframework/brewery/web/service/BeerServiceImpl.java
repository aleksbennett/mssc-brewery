package guru.springframework.brewery.web.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.brewery.web.model.BeerDto;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
            .id(UUID.randomUUID()).
            beerName("Galaxy Cat").
            beerStyle("Pale Ale").
            build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
            .id(UUID.randomUUID())
            .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo: do update
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("deleting a beer: " + beerId);
    }
    
}