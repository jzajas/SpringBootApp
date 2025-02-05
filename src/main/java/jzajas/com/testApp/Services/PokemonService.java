package jzajas.com.testApp.Services;

import jakarta.transaction.Transactional;
import jzajas.com.testApp.Models.PokemonModel;
import jzajas.com.testApp.Repositories.PokemonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;

    public PokemonService(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }


    @Transactional
    public PokemonModel savePokemon(PokemonModel pokemon) {
        return pokemonRepository.save(pokemon);
    }

    public List<PokemonModel> getAllPokemon() {
        return pokemonRepository.findAll();
    }

    public Optional<PokemonModel> getPokemonById(Long id) {
        return pokemonRepository.findById(id);
    }

    @Transactional
    public void deletePokemon(Long id) {
        pokemonRepository.deleteById(id);
    }
}
