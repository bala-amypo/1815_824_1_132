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
        this.username=username;
    }

    public String getEmail(){
        return email;
    }
    public void SetEmail(String email){
        this.email=email;
    }

     public String getBio(){
        return bio;
    }
    public void SetBio(String bio){
        this.bio=bio;
    }

     public String getActive(){
        return active;
    }
    public void SetActive(Boolean active){
        this.active=active;
    }

     public String getCreatedAt(){
        return createdAt;
    }
    public void SetCreatedAt(Boolean createdAt){
        this.createdAt=createdAt;
    }

     public String getUpdatedAt(){
        return updatedAt;
    }
    public void SetUpdatedAt(Boolean updatedAt){
        this.updatedAt=updatedAt;
    }




}