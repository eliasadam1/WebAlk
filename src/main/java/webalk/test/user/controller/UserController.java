package webalk.test.user.controller;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import webalk.test.user.DAO.repo.UserRepository;
import webalk.test.user.businesslogic.entity.UserEntity;

@Controller
public class UserController {
	
	
	private UserRepository userRepository;
	private UUID id;

	public UserController(UserRepository userRepository, UUID id) {
		this.userRepository=userRepository;
		this.id = id;
	}
	
	
	@RequestMapping("/showRegistration")
	public String showregistration() {
		return "/registerUser";
	}
	
	@RequestMapping(value = "/registerUser", method = RequestMethod.POST)
	public String register(@ModelAttribute("user")UserEntity user) {

		
		user.setUserID(id.randomUUID().toString());
		userRepository.save(user);
		
		return "/login"; 
	}
	
	
}
