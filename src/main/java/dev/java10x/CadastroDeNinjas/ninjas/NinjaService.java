package dev.java10x.CadastroDeNinjas.ninjas;

import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

//Injetando dependencias
private NinjaRepository ninjaRepository;    // o construtor inicializa os objetos

public NinjaService(NinjaRepository ninjaRepository){
    this.ninjaRepository=ninjaRepository;
}
//Listar todos os Ninjas
public List<NinjaModel> listarNijas(){
    return ninjaRepository.findAll();
}
//Listar todos os Ninjas por ID

public NinjaModel ListarNinjasPorId(Long id) {
    Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id); //retorna o ninja por ID, se não tiver, retorna null
    return ninjaPorId.orElse(null);
}
}

