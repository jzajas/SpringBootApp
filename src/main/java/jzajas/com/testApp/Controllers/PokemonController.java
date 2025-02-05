package jzajas.com.testApp.Controllers;


import jakarta.validation.Valid;
import jzajas.com.testApp.Models.PokemonModel;
import jzajas.com.testApp.Services.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController("/api/Pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }


    @PostMapping("/save")
    public PokemonModel addPokemon(@Valid @RequestBody PokemonModel pokemonModel) {
        return pokemonService.savePokemon(pokemonModel);
    }

    @GetMapping
    public List<PokemonModel> getAllPokemon() {
        return pokemonService.getAllPokemon();
    }

    @GetMapping("/{id}")
    public Optional<PokemonModel> getPokemonById(@PathVariable Long id) {
        return pokemonService.getPokemonById(id);
    }

    @DeleteMapping("/{id}")
    public void deletePokemonById(@PathVariable Long id) {
        pokemonService.deletePokemon(id);
    }
}
