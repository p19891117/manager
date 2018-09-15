package top.tangshitai.manager.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import top.tangshitai.manager.dao.UserMapper;
@Service
public class UserServiceImp implements UserService {
	@Autowired
	private UserMapper userDao;
	
}
