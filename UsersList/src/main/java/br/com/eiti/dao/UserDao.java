package br.com.eiti.dao;

import java.util.List;

import br.com.eiti.entity.User;

public interface UserDao {
	List<User> findAllBy(String username, String name, String email);
}
