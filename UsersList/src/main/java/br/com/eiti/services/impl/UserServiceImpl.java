package br.com.eiti.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eiti.dao.UserDao;
import br.com.eiti.entity.User;
import br.com.eiti.services.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	UserDao userDao;
	
	@Override
	public List<User> findAllBy(String username, String name, String email) {
		return userDao.findAllBy(username, name, email);
	}

}
