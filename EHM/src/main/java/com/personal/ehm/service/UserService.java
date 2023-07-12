package com.personal.ehm.service;

import com.personal.ehm.entity.User;

public interface UserService {

	User findById(Long id);

	User save(User user);

}
