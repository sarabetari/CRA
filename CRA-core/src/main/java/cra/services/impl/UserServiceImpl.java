package cra.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cra.dao.UserDao;
import cra.model.User;
import cra.services.UserService;

@Service
@Transactional
public class UserServiceImpl  implements UserService {
    
	@Autowired
	UserDao userDao;

	@Override
	public List<User> findAllUsers() {
		return userDao.findAllUsers();
	}
	
	
	
	
}
