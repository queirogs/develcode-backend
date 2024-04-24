package com.develcode.demo.services;

import java.sql.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.develcode.demo.models.User;
import com.develcode.demo.repositories.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User findById(Long id){
        Optional<User> user = this.userRepository.findById(id);
        return user.orElseThrow(() -> new RuntimeException(
            "Usuario não encontrado! Id: " + id + "Da tabela: " + User.class.getName()
        ));
    }

    @Transactional
    public User create(User obj){
        obj.setId(null);
        obj = userRepository.save(obj);
        return obj;
    }

    @Transactional
    public User update(User obj, String username){
        User newObj = findById(obj.getId());
        newObj.setUsername(username);
        return newObj;
    }

    @Transactional
    public User update(User obj, Date birth_date){
        User newObj = findById(obj.getId());
        newObj.setBirthdate(birth_date);
        return newObj;
    }

    @Transactional
    public User update(User obj, byte[] profile_picture){
        User newObj = findById(obj.getId());
        newObj.setProfilePicture(profile_picture);
        return newObj;
    }

    @Transactional
    public void delete(Long id){
        findById(id);
        this.userRepository.deleteById(id);
    }
}
