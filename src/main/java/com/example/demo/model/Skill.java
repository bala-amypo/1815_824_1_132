package com.example.demo.model;

@Entity
public class Skill{
    private Long id;
    private String category;
    private String description;
    private Boolean active;

    @Column(unique  = true)
    private String name;

    public long getId(){
        return id;
    }
    public void setid(int id){
        this.id=id;
    }

     public long getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

     public long getCategory(){
        return category;
    }
    public void setCategory(String category){
        this.category=category;
    }

     public long getActive(){
        return active;
    }
    public void setActive(String active){
        this.active=active;


        public Skill(Long id, String name, String category, String description,Boolean active)
        this.id=id;
        this.
    }
}