package boliche.model.frame;


import boliche.entity.Frame;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface IFrameMapper {

    FrameResponse toResponse(Frame frame);
}
