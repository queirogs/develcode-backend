package com.develcode.demo.models;

import java.sql.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name=User.TABLE_NAME)
public class User {
    public static final String TABLE_NAME = "user";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", unique=true)
    private Long id;

    @Column(name="username", length = 30, nullable = false)
    private String username;

    @Column(name="birth_date")
    private Date birth_date;

    @Lob
    @Column(name="profile_picture")
    private byte[] profile_picture;



    public User(){

    }

    public User(String username, Date birth_date, byte[] profile_picture){
        this.username = username;
        this.birth_date = birth_date;
        this.profile_picture = profile_picture;
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

    public void setBirthdate(Date birth_date){
        this.birth_date = birth_date;
    }

    public Date getBirthdate(){
        return this.birth_date;
    }

    public void setProfilePicture(byte[] profile_picture){
        this.profile_picture = profile_picture;
   }

    public byte[] getProfilePicture(){
        return this.profile_picture;
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
