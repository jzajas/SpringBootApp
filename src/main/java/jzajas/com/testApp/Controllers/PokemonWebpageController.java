package jzajas.com.testApp.Controllers;

import jzajas.com.testApp.Services.PokemonService;
import jzajas.com.testApp.Models.PokemonModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/pokemon")
public class PokemonWebpageController {

    private final PokemonService pokemonService;

    public PokemonWebpageController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }


    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("pokemon", new PokemonModel());
        return "PokemonForm";
    }

    @GetMapping("/all")
    public String showPokemonList() {
        return "PokemonList";
    }

}
