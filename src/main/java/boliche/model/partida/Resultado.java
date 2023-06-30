package boliche.model.partida;


import boliche.entity.Jogador;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Resultado {

    private String vencedor;

    private List<Jogador> jogadores;
}
