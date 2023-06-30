package boliche.model.jogador;

import boliche.model.frame.IFrameMapper;

@Mapper(componentModel = "spring", uses = {IFrameMapper.class})
public interface IJogadorMapper {
    JogadorResponse toResponse(Jogador jogador);
}
