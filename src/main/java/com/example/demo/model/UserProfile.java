package com.example.demo.model;

@Entity
public class UserProfile{
    @Id-primary key
    private Long id;
    private String username;
    private String email;
    private String bio;
    private Boolean active;
    private String createdAt;
    private String updatedAt;

    public long getId(){
        return id;
    }

    public void setId(int id){
        this.id=id;
    }

    public String getUsername(){
        return Username;
    }

    public void setUsername(String username){
        this.name=name;
    }

    public String getEmail(){
        return email;
    }

    public void SetEmail(){
        return email;
    }
     public String getBio(){
        return bio;
    }

    public void SetBio(){
        return bio;
    }
     public String getEmail(){
        return email;
    }

    public void SetEmail(){
        return email;
    }

}