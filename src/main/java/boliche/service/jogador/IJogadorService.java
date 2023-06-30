package boliche.service.jogador;

import boliche.entity.Jogador;
import boliche.model.jogador.JogadorRequest;

public interface IJogadorService {

    jogador marcarPonto(JogadorRequest jogadorRequest);

    Jogador getPontuacao(Long id);
}

