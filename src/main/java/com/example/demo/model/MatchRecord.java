pacakage com.example.demo.model;

@Entity
public class MatchRecord{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String userA;
    private String userB;
    private String skillOfferedByA;
    private String skillOfferedByB;
    private Timestamp matchedAt;
    private String status;

    public Long getId()

}