package jzajas.com.testApp.Repositories;

import jzajas.com.testApp.Models.PokemonModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends CrudRepository<PokemonModel, Long> {
}
