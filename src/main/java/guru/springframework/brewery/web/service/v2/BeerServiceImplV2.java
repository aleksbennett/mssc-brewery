package guru.springframework.brewery.web.service.v2;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.brewery.web.model.v2.BeerDtoV2;
import guru.springframework.brewery.web.model.v2.BeerStyleEnum;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class BeerServiceImplV2 implements BeerServiceV2 {

    @Override
    public BeerDtoV2 getBeerById(UUID beerId) {
        return BeerDtoV2.builder()
            .id(UUID.randomUUID()).
            beerName("Galaxy Cat").
            beerStyle(BeerStyleEnum.LAGER).
            build();
    }

    @Override
    public BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto) {
        return BeerDtoV2.builder()
            .id(UUID.randomUUID())
            .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDtoV2 beerDto) {
        //todo: do update
    }

    @Override
    public void deleteById(UUID beerId) {
        log.debug("deleting a beer: " + beerId);
    }
    
}