package com.cn.service;

import java.util.List;

import com.cn.pojo.Shoppingcar;

public interface ShoppingcarService {
	void addShoppingCar(int commdityId,int userId);//��ӹ��ﳵ
	List<Shoppingcar> findAll(int userId);//��ѯ�û�id�����еĹ��ﳵ
	void deleteShoppingCar(int shoppingCarId);//ɾ�����ﳵ
	int editShoppingCar(int shoppingCarId,int flag);//���ﳵ�޸�����
}
