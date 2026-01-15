package dev.java10x.CadastroDeNinjas.Missoes;

import dev.java10x.CadastroDeNinjas.ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomeDaMissao;

    private String Dificuldade;

    @OneToMany(mappedBy = "missoes")      //@OneToMany uma única missão terá muitos ninjas
    private List<NinjaModel> ninjas;
}
