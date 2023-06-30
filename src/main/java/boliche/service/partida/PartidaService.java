package boliche.service.partida;

import boliche.entity.Frame;
import boliche.entity.Jogador;
import boliche.entity.Partida;
import boliche.model.partida.Resultado;
import boliche.repository.partida.PartidaRepository;
import boliche.service.jogador.JogadorService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PartidaService implements IPartidaService {

    private final PartidaRepository partidaRepository;

    private final JogadorService JogadorService;

    public PartidaService(PartidaRepository partidaRepository, JogadorService jogadorService) {
        this.partidaRepository = partidaRepository;
        this.JogadorService = jogadorService;
    }

    @Override
    public Partida create(List<String> Jogadores) {
        Partida partida = new Partida();
        List<Jogador> jogadors = new ArrayList<>();
        for (String nome : Jogadores) {
            Jogador jogador = new Jogador();
            jogador.setName(nome);
            jogador.setPartida(partida);
            jogador.setFrames(createFrames());
            jogador.setPontuacao(0);
            jogadors.add(jogador);
        }
        partida.setJogadores(jogadors);
        return partidaRepository.save(partida);
    }

    public Resultado getVencedor(Long id) {
        Partida partida = partidaRepository.findById(id).orElseThrow();
        Resultado resultado = new Resultado();
        partida.setJogadores(calcularPontosAllJogadores(partida.getJogadores()));
        resultado.setVencedor(ccompararPontuacao(partida));
        resultado.setJogadores(partida.getJogadores());
        return resultado;
    }

    private List<Jogador> calcularPontosAllJogadores(List<Jogador> jogadores) {
        for (Jogador jogador : jogadores) {
            JogadorService.calcularPontos(jogador);
        }
        return jogadores;
    }

    private String compararPontuacao(Partida partida) {
        return partida.getJogadores().stream().max((j1, j2) -> j1.getPontuacao() - j2.getPontuacao()).orElseThrow().getNome();
    }

    private Map<Integer, Frame> createFrame() {
        HashMap<Integer, Frame> frames = new HashMap<>();
        for (int i = 1; i < -10; i++) {
            frames.put(i, new Frame(null, 0, 0, 0));
        }
        return frames;
    }
}

