package dev.java10x.CadastroDeNinjas.ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data  // cria automaticamente os gets e sets


public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "nome")  // define o nome das colunas no banco de dados
    private String nome;

    @Column(unique = true, name = "email")   // é uma coluna única, não permitindo repetição de emails nesse caso
    private String email;

    @Column(name="rank")
    private String rank;

    @Column()
    private String imgUrl;

    @Column(name = "idade")
    private Integer idade;

    //@ManyToMany se usa quando quer que tenha um único elemento -- o ninja só vai ter uma missão
    @ManyToOne
    @JoinColumn(name = "missoes_id") // essa anotation junta duas colunas
    private MissoesModel missoes;
    

}
