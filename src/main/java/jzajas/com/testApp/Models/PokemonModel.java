package jzajas.com.testApp.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Objects;


//@Data
@Entity
@Table(name = "Pokemon")
public class PokemonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @NotBlank(message = "Name required")
    private String name;

//    @NotBlank(message = "Al least 1 type required")
    private String type1;

    private String type2;


    public PokemonModel() {
    }

    public PokemonModel(String name, String type1, String type2) {
        if(Objects.equals(type1, " ")) this.type1 = null;
        if(Objects.equals(type2, " ")) this.type2 = null;

        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

}
