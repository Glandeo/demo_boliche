package boliche.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Frame {
    @Id
    @GenerateValue(stragy = GenerationType.IDENTITY)
    private Long id;

    private int primeiraBola;

    private int segundaBola;

    private int terceiraBola;
}
