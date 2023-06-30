package boliche.controller;


import java.util.List;

@RequestController
@RequestMapping("/partida")
public class PartidaController {
    private final IPartidaService service;
    private final IPartidaMapper mapper;
    public PartidaController(IPartidaService service, IPartidaMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }
    @PostMapping
    public  PartidaResponse create(@RequestBody List<String> jogadores) {
        return mapper.toResponse(service.create(jogadores));
    }

    @GetMapping("/{id}")
    public Resultado getVencedor(@PathVariable Long id) { return service.getVencedor(id);}
}
