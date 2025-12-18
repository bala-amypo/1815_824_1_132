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

    public Long getId(){
        return id;
    }
    public void setId(Long id){
        this.id=id;
    }

    public String getUserA(){
        return userA;
    }
    public void setUserA(String userA){
        this.userA=userA;
    }

     public String getUserB(){
        return userB;
    }
    public void setUserB(String userB){
        this.userB=userB;
    }   

    public String getSkillOfferedByA(){
        return skillOfferedByA;
    }
    public void setSkillOfferedByA(String skillOfferedByA){
        this.skillOfferedByA=skillOfferedByA;
    }

     public String getSkillOfferedByB(){
        return skillOfferedByB;
    }
    public void setSkillOfferedByA(String skillOfferedByA){
        this.skillOfferedByA=skillOfferedByA;
    }

}