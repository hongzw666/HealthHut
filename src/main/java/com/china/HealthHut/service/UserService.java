package com.china.HealthHut.service;

import java.util.List;

import com.china.HealthHut.pojo.Users;

public interface UserService {

	// 分页查找
	public List<Users> findUsersList(String issutdent, int page, int limit);

	// 查找页数
	public int findUsersAll(String issutdent);

	// 根据账号查找
	public Users findUsersById(int userId);

	// 创建账户
	public int createUsers(Users users);

	// 删除账户
	public int deleteUsers(int userId);

	// 更新账户信息
	public int updateUsers(Users userid);

}
