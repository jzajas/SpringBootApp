package jzajas.com.testApp.Controllers;


import jzajas.com.testApp.Models.PokemonModel;
import jzajas.com.testApp.Services.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    @GetMapping("/")
    public String showHomePage() {
        return "home";
    }
}
