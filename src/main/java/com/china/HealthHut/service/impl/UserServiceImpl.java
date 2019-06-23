package com.china.HealthHut.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china.HealthHut.mapper.UsersMapper;
import com.china.HealthHut.pojo.Users;
import com.china.HealthHut.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UsersMapper usersMapper;

	// 分页查询Users
	@Override
	public List<Users> findUsersList(String issutdent, int page, int limit) {
		return this.usersMapper.findUsersList(issutdent, new RowBounds(page, limit));
	}

	// 查询所有Users
	@Override
	public int findUsersAll(String issutdent) {
		List<Users> usersAll = this.usersMapper.findUsersAll(issutdent);
		int count  = usersAll.size()/9;
		if (usersAll.size()%9>0) {
			count++;
		}
		return count;
	}

	// 根据ID查找
	@Override
	public Users findUsersById(int code) {
		Users userCode = this.usersMapper.findUsersById(code);
		return userCode;
	}

	// 创建账户
	@Override
	public int createUsers(Users users) {
		int add = this.usersMapper.createUsers(users);
		return add;
	}

	// 删除账户
	@Override
	public int deleteUsers(int id) {
		int del = this.usersMapper.deleteUsers(id);
		return del;
	}

	// 更新账户信息
	@Override
	public int updateUsers(Users users) {
		int upd = this.usersMapper.updateUsers(users);
		return upd;
	}

}
