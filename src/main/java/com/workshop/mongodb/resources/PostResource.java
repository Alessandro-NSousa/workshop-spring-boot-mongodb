package com.workshop.mongodb.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.workshop.mongodb.domain.Post;
import com.workshop.mongodb.services.PostService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {
	@Autowired
	private PostService service;
	
//	@GetMapping
//	public ResponseEntity<List<UserDTO>> findAll(){
//		List<User> list = service.findAll();
//		List<UserDTO> listDTO = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
//		return ResponseEntity.ok().body(listDTO);
//		
//	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Post> findById(@PathVariable String id){
		Post obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
//	@PostMapping
//	public ResponseEntity<UserDTO> insert(@RequestBody UserDTO objDTO){
//		User obj = service.fromDto(objDTO);
//		obj = service.insert(obj);
//		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
//		return ResponseEntity.created(uri).build();
//		
//	}
//	
//	@DeleteMapping(value = "/{id}")
//	public ResponseEntity<Void> delete(@PathVariable String id){
//		service.delete(id);
//		return ResponseEntity.noContent().build();
//		
//	}
//	
//	@PutMapping(value = "/{id}")
//	public ResponseEntity<UserDTO> update(@RequestBody UserDTO objDTO, @PathVariable String id){
//		User obj = service.fromDto(objDTO);
//		obj.setId(id);
//		obj = service.update(obj);
//		return ResponseEntity.noContent().build();
//		
//	}
//	
//	@GetMapping(value = "/{id}/posts")
//	public ResponseEntity<List<Post>> findPosts(@PathVariable String id){
//		User obj = service.findById(id);
//		return ResponseEntity.ok().body(obj.getPosts());
//		
//	}

}
