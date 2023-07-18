package com.workshop.mongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.workshop.mongodb.domain.User;
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

	
//	public User findById(String id) {
//		User user = repo.findById(id);
//		if (user == null) {
//			throw new ObjectNotFoundException("Objeto não encontrado");
//		}
//		return user;
//	}

}
