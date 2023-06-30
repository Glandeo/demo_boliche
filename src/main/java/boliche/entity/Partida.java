package boliche.entity;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Partida {
    @Id
    @GneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @OneToMany(mappedBy = "partida", cascade = CascadeType.ALL)
    private Liste<Jogador> jogadores;

}
