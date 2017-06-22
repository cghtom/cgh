package com.cgh.portal.service;

import com.cgh.pojo.TbUser;

public interface UserService {

	TbUser getUserByToken(String token);
}
