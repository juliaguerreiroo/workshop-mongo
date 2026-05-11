package com.julia.workshopmongo.dto;

import com.julia.workshopmongo.domain.User;

import java.io.Serializable;

// AuthorDTO que recebe apenas o id e o nome dos autores
public class AuthorDTO implements Serializable {
    private String id;
    private String name;

    public AuthorDTO(User user) {
        this.id = user.getId();
        this.name = user.getName();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
