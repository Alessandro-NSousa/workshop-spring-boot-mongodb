package com.workshop.mongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.mongodb.domain.User;
import com.workshop.mongodb.dto.UserDTO;
import com.workshop.mongodb.repository.UserRepository;
import com.workshop.mongodb.services.excepition.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
		
	}
	
	public User findById(String id) {
	    Optional<User> optionalUser = repo.findById(id);
	    if (optionalUser.isEmpty()) {
	        throw new ObjectNotFoundException("Objeto não encontrado");
	    }
	    return optionalUser.get();
	}

	public User insert(User object) {
		return repo.insert(object);
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
	}
	
	public User fromDto(UserDTO objectDTO) {
		return new User(objectDTO.getId(), objectDTO.getName(), objectDTO.getEmail());
	}

}
