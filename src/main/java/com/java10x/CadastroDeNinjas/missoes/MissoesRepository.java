package com.java10x.CadastroDeNinjas.missoes;

import com.java10x.CadastroDeNinjas.missoes.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long > {
}