package com.develcode.demo.models;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name=User.TABLE_NAME)
public class User {
    public static final String TABLE_NAME = "user";

    public interface CreateUser{
    }

    public interface UpdateUser{
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true)
    private Long id;   

    @Column(name="username", nullable = false)
    @NotBlank
    private String username;

    @Column(name="image", nullable = false)
    @NotBlank
    @Lob
    private String image;

    @Column(name="birthday", columnDefinition="LONGTEXT")
    private Long birthday; 
    
    public User(){

    }

    public User(String username, Long birthday, String image){
        this.username = username;
        this.birthday = birthday;
        this.image = image;
    }

    public void setId(Long id){
        this.id = id;
    }

    public Long getId(){
        return this.id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }

    public String getImage(){
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public void setBirthday(Long birthday){
        this.birthday = birthday;
    }

    public Long getBirthday(){
        return this.birthday;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj == null) return false;
        if(!(obj instanceof User)) return false;

        User other = (User) obj;

        if(this.id == null)
            if(other.id != null)
                return false;
            else if (!this.id.equals(other.id))
                return false;

        return (Objects.equals(this.id, other.id) && this.username.equals(other.username));
    }

    @Override
    public int hashCode(){
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : hashCode());
        return result;
    }

}   
