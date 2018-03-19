package br.com.eiti.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.eiti.services.UserService;

@Controller
public class UsersController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
    public String productsList(@RequestParam(value="username") String username, @RequestParam(value="name") String name, @RequestParam(value="email") String email, Model model){
        model.addAttribute("users", userService.findAllBy(username, name, email));
        return "users_list";
    }
}
