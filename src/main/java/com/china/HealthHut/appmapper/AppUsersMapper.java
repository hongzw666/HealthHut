package com.china.HealthHut.appmapper;

import com.china.HealthHut.pojo.Users;

public interface AppUsersMapper {
	//查找Users 是否存在
	Users findIsHaveUsers(Users users);
	//添加Users
	int addUser(Users users);

}
