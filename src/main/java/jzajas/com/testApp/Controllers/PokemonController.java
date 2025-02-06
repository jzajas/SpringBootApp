package jzajas.com.testApp.Controllers;

import jzajas.com.testApp.Services.PokemonService;
import jzajas.com.testApp.Models.PokemonModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import lombok.Builder;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/pokemon")
public class PokemonController {

    private final PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }


//    @PostMapping("/save")
//    public PokemonModel addPokemon(@Valid @RequestBody PokemonModel pokemonModel) {
//        return pokemonService.savePokemon(pokemonModel);
//    }

//    @PostMapping("/new")
//    public ResponseEntity<PokemonModel> createPokemon(@ModelAttribute PokemonModel pokemon) {
//        PokemonModel savedPokemon = pokemonService.savePokemon(pokemon);
//        return ResponseEntity.ok(savedPokemon);
//    }

    @GetMapping("/new")
    public String showForm(Model model) {
        // Add an empty PokemonModel to the model so the form can bind to it
        model.addAttribute("pokemon", PokemonModel.builder().build());
        return "PokemonForm"; // The name of your HTML form view (e.g. pokemon_form.html)
    }

    @PostMapping("/save")
    public String savePokemon(@ModelAttribute PokemonModel pokemon) {
        pokemonService.savePokemon(pokemon);
        return "redirect:/pokemon/new"; // Redirect to the form after saving
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
