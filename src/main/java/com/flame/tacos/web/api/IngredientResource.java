package com.flame.tacos.web.api;

import org.springframework.hateoas.ResourceSupport;

import lombok.Getter;
import com.flame.tacos.entity.Ingredient;
import com.flame.tacos.entity.Ingredient.Type;

public class IngredientResource extends ResourceSupport {

  @Getter
  private String name;

  @Getter
  private Type type;
  
  public IngredientResource(Ingredient ingredient) {
    this.name = ingredient.getName();
    this.type = ingredient.getType();
  }

}
