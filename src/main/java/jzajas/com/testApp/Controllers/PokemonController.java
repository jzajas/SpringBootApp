package jzajas.com.testApp.Controllers;


import jakarta.validation.Valid;
import jzajas.com.testApp.Models.PokemonModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/api/Pokemon")
public class PokemonController {

    @PostMapping("/save")
    ResponseEntity<String> addPokemon(@Valid @RequestBody PokemonModel pokemonModel) {
        return ResponseEntity.ok("Valid Pokemon");
    }
}
