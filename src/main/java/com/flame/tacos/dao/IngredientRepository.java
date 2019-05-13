package com.flame.tacos.dao;

import com.flame.tacos.entity.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}
