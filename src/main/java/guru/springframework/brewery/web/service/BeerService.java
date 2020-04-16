package guru.springframework.brewery.web.service;

import java.util.UUID;

import guru.springframework.brewery.web.model.BeerDto;

public interface BeerService {    
    BeerDto getBeerById(UUID beerId);

	BeerDto saveNewBeer(BeerDto beerDto);

	void updateBeer(UUID beerId, BeerDto beerDto);

	void deleteById(UUID beerId);
}
