package dev.java10x.CadastroDeNinjas.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeNinjas.ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor // construtor vazio
@AllArgsConstructor // construtor cheio
@Data

public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nomeDaMissao;

    private String Dificuldade;

    @OneToMany(mappedBy = "missoes")//@OneToMany uma única missão terá muitos ninjas
    @JsonIgnore   // anotação usada para evitar o looping infinito
    private List<NinjaModel> ninjas;
}
