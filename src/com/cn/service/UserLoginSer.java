package com.cn.service;



import java.util.Map;

import com.cn.pojo.Users;

public interface UserLoginSer {
	//�û���¼
	public Users userLogin(String name,String pwd);
	//����û�
	public void addUser(Users users);
	//��ѯ�û����Ƿ����
	public Map<String, Object> findUserName(String name);

}
