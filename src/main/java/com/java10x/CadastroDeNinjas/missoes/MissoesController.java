package com.java10x.CadastroDeNinjas.missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    //Adicionar missoes (CREATE)
    @PostMapping("/criar")
    public String criarMissoes(){
        return "Missão Criada";
    }

    //Mostrar todas as missoes (READ)
    @GetMapping("/mostrar")
    public String mostrarMissoes(){
        return "Mostrar missoes";
    }

    //Listar missoes (READ)

    @GetMapping("/listar")
    public String listarMissoes(){
        return "missoes listadas";
    }

    //Alterar dados das missoes por ID (UPDATE)

    @PutMapping("/alteraPorID")
    public String alteraMissoesPorID(){
        return "Altera missoes por ID";
    }

    //Deletar Missao por ID(DELETE)

    @DeleteMapping("DeletarPorID")
    public String deletarPorID(){
        return "Deletar por ID";
    }
}