package org.huxin.study.springboot.service;

import org.huxin.study.springboot.domain.User;
import org.huxin.study.springboot.util.PageBean;

public interface UserService<T> {
	
	PageBean<User> findUserList() ;

}
