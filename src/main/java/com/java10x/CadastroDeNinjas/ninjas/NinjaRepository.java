package com.java10x.CadastroDeNinjas.ninjas;

import com.java10x.CadastroDeNinjas.ninjas.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NinjaRepository extends JpaRepository<NinjaModel,Long> {
    Iterable<Long> id(long id);


}