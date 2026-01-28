package dev.java10x.CadastroDeNinjas.ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/boasvindas")
    public String boasvindas() {
        return "Boas vindas";
    }

    //Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criado";
    }

    //Mostrar todos os ninjas (READ)
    @GetMapping("/todos")    //anotação usadda para mostrar algo
    public String mostrarTodosOsNinjas() {
        return "mostrar ninjas";
    }
    //Mostrar ninja por ID (READ)
    @GetMapping("/todosID")
    public String mostrarTodosNinjasPorId() {
        return "Mostrar Ninja por ID";
    }

    //Alterar dados dos ninjas (UPDATE)
    @PutMapping("/alterarId")  //Anotação usada quando irá atualizar um recurso
    public String alterarPorID(){
        return "alterado por ID";
    }

    //Deletar  Ninja (DELETE)
    @DeleteMapping("deletarID")   //Anotação usada quando for deletar um recurso
    public String deletarNinjaPorID(){
        return "Ninjas deletados por ID";
    }
}
