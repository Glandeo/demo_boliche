package boliche.service.partida;


import boliche.entity.Partida;
import boliche.model.partida.Resultado;

import java.util.List;


public interface IPartidaService {

    Partida create(List<String> Jogadores);

    Resultado getVencedor(Long id);
}
