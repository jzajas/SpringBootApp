package jzajas.com.testApp.Controllers;

import jzajas.com.testApp.Models.PokemonModel;
import jzajas.com.testApp.Services.PokemonService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Map;
import java.util.Optional;

//@RestController
@Controller
@RequestMapping("/pokemon/api")
public class PokemonApiController {

    private final PokemonService pokemonService;


    public PokemonApiController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

//    @PostMapping("/save")
//    public String savePokemon(@ModelAttribute PokemonModel pokemon) {
//        pokemonService.savePokemon(pokemon);
//        return "PokemonForm";
//    }
    @PostMapping("/save")
    public String savePokemon(@ModelAttribute PokemonModel pokemon, RedirectAttributes redirectAttributes) {
        PokemonModel saved = pokemonService.savePokemon(pokemon);
        redirectAttributes.addFlashAttribute("message", "Pokemon saved successfully!");
        return "redirect:/pokemon/all";
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
