package com.flame.tacos;

import com.flame.tacos.dao.IngredientRepository;
import com.flame.tacos.entity.Ingredient;
import com.flame.tacos.entity.Ingredient.Type;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication   // <1>
public class TacoCloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TacoCloudApplication.class, args); // <2>
    }

    @Bean
    public CommandLineRunner dataLoader(IngredientRepository repo) {
        return new CommandLineRunner() {
            // because we use jpa, no need to create schema.sql and data.sql,
            // but we may have to insert initialized data into database manually
            @Override
            public void run(String... args) throws Exception {
                repo.save(new Ingredient("FLTO", "Flour Tortilla", Type.WRAP));
                repo.save(new Ingredient("COTO", "Corn Tortilla", Type.WRAP));
                repo.save(new Ingredient("GRBF", "Ground Beef", Type.PROTEIN));
                repo.save(new Ingredient("CARN", "Carnitas", Type.PROTEIN));
                repo.save(new Ingredient("TMTO", "Diced Tomatoes", Type.VEGGIES));
                repo.save(new Ingredient("LETC", "Lettuce", Type.VEGGIES));
                repo.save(new Ingredient("CHED", "Cheddar", Type.CHEESE));
                repo.save(new Ingredient("JACK", "Monterrey Jack", Type.CHEESE));
                repo.save(new Ingredient("SLSA", "Salsa", Type.SAUCE));
                repo.save(new Ingredient("SRCR", "Sour Cream", Type.SAUCE));
            }
        };
    }
}