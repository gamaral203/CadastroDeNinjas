package dev.java10x.CadastroDeNinjas.ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService; // injetando denpedencia do service

    public NinjaController(NinjaService ninjaService){
        this.ninjaService = ninjaService;
    }

    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "Boas vindas";
    }

    //Criar Ninja (CREATE)
    @PostMapping("/criar")
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja) {
        return ninjaService.criarNinja(ninja);
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/listar")    //anotação usadda para mostrar algo
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNijas();
    }
    //Mostrar ninja por ID (READ)
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorId(@PathVariable Long id) {  // essa anotation faz o retorno do usuário fazer parte da URL
        return ninjaService.ListarNinjasPorId(id);
    }

    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarPorId")  //Anotação usada quando irá atualizar um recurso
    public String alterarPorID(){
        return "alterado por ID";
    }

    //Deletar  Ninja (DELETE)
    @DeleteMapping("deletarID")   //Anotação usada quando for deletar um recurso
    public String deletarNinjaPorID(){
        return "Ninjas deletados por ID";
    }
}
