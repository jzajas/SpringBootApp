package jzajas.com.testApp.Repositories;

import jzajas.com.testApp.Models.PokemonModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PokemonRepository extends JpaRepository<PokemonModel, Long> {
}
