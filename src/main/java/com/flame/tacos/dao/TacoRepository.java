package com.flame.tacos.dao;

import com.flame.tacos.entity.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {

}
