package boliche.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Map;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Jogador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(name = "NOME")
    private String nome;

    @ManyToOne
    private Partida partida;

    @OneToMany(cascade = CascadeType.ALL)
    private Map<Integer, Frame> frames;

    @Column(name = "PONTUAÇÃO")
    private Integer pontuacao;
}
