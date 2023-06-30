package boliche.model.partida;


import boliche.entity.Partida;
import boliche.model.jogador.IJogadorMapper;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring", uses = {IJogadorMapper.class})
public interface IPartidaMapper {

    PartidaResponse toResponse(Partida partida);
}
