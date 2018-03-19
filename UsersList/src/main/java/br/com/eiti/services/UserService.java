package br.com.eiti.services;

import java.util.List;

import br.com.eiti.entity.User;


public interface UserService {
	List<User> findAllBy(String username,  String name, String email);
}
