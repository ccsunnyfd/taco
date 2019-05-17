package com.flame.tacos.dao;

import com.flame.tacos.entity.Taco;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TacoRepository
        extends PagingAndSortingRepository<Taco, Long> {

}
