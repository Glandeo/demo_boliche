package boliche.model.partida;



import boliche.model.jogador.JogadorResponse;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class PartidaResponse {

    private Long id;

    private List<JogadorResponse> jogadores;
}
