package com.workshop.mongodb.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.mongodb.domain.Post;
import com.workshop.mongodb.repository.PostRepository;
import com.workshop.mongodb.services.excepition.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repo;
	
//	public List<User> findAll(){
//		return repo.findAll();
//		
//	}
	
	public Post findById(String id) {
	    Optional<Post> optionalPost = repo.findById(id);
	    if (optionalPost.isEmpty()) {
	        throw new ObjectNotFoundException("Objeto não encontrado");
	    }
	    return optionalPost.get();
	}

//	public User insert(User object) {
//		return repo.insert(object);
//	}
//	
//	public void delete(String id) {
//		findById(id);
//		repo.deleteById(id);
//	}
//	
//	public User update(User obj) {
//	    Optional<User> optionalUser = repo.findById(obj.getId());
//	    if (optionalUser.isEmpty()) {
//	        throw new ObjectNotFoundException("Objeto não encontrado");
//	    }
//	    User newObj = optionalUser.get();
//	    updateData(newObj, obj);
//	    return repo.save(newObj);
//	}
//
//	private void updateData(User newObj, User obj) {
//	    newObj.setName(obj.getName());
//	    newObj.setEmail(obj.getEmail());
//	}
//
//
//	public User fromDto(UserDTO objectDTO) {
//		return new User(objectDTO.getId(), objectDTO.getName(), objectDTO.getEmail());
//	}

}
