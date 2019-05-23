package com.flame.tacos.web.api;

import com.flame.tacos.web.DesignTacoController;
import org.springframework.hateoas.mvc.ResourceAssemblerSupport;

import com.flame.tacos.entity.Taco;

public class TacoResourceAssembler
       extends ResourceAssemblerSupport<Taco, TacoResource> {

  public TacoResourceAssembler() {
    super(DesignTacoController.class, TacoResource.class);
  }
  
  @Override
  protected TacoResource instantiateResource(Taco taco) {
    return new TacoResource(taco);
  }

  @Override
  public TacoResource toResource(Taco taco) {
    return createResourceWithId(taco.getId(), taco);
  }

}
