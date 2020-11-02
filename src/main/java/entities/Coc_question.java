package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Coc_question {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String COC_INSTRUCTION;
    private String COC_TYPE;
    private String COC_LIBELLE;
    private String COC_VOICE;
    @ManyToOne
    private Coc_exercice coc_exercice;
    @OneToMany
    private Collection<Coc_reponse> coc_reponses;
}
