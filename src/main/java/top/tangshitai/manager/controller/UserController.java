package top.tangshitai.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import top.tangshitai.manager.service.UserService;
@Controller
public class UserController {
	@Autowired
	private UserService userService;
}
