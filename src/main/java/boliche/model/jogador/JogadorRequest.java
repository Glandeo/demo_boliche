package boliche.model.jogador;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class JogadorRequest {

    private Long id;

    private String nome;

    private Map<Integer, Frame> frames;

    private Integer pontuacao;
}
