package br.com.cafecomjava.springsecurity.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cafecomjava.springsecurity.dto.User;

@RestController
@RequestMapping("/rest")
public class TestRest {

	@RequestMapping(value="/getUser", method= RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
	public @ResponseBody ResponseEntity<User> getUser(){
		User user = new User();
		user.setNome("Joel");
		user.setEmail("contato@cafecomjava.com.br");
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
}
