package com.lucaslima.workshopmongo.services;

import com.lucaslima.workshopmongo.domain.Post;
import com.lucaslima.workshopmongo.domain.User;
import com.lucaslima.workshopmongo.repository.PostRepository;
import com.lucaslima.workshopmongo.service.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PotsService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}


