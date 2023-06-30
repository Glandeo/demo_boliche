package boliche.controller;


import org.springframework.boot.context.properties.DeprecatedConfigurationProperty;

@RestController
@RequestMapping("/jogador")
public class JogadorController {

    private final IJogadorMapper mapper;

    private final IJogadorService service;


    public JogadorController(IJogadorMapper mapper, IJogadorService service){
        this.mapper = mapper;
        this.service = service;

    }


    @PutMapping
    public JogadorResponse marcarPonto(@requestBody JogadorRequest JogadorRequest) {
        return mapper.toResponse(service.marcarPonto(JogadorRequest));
    }

  @GetMapping( "/{id}")
  public JogadorResponse getPontuacao(@PathVariable Long id) {
        return mapper.toResponse(service.getPontuacao(id));
    }
}
