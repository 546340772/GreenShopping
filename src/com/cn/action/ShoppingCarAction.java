package com.cn.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.interceptor.SessionAware;

import com.cn.pojo.Shoppingcar;
import com.cn.pojo.Users;

public class ShoppingCarAction extends Action5_Result implements SessionAware{
	private Map session;
	
	//��ӹ��ﳵ
	@Action("AddShoppingCar")
	public String AddShoppingCar() {
		if(session.get("users")==null) {
			return "error";
		}
		users=(Users) session.get("users");
		//�����û�Id�͹��ﳵid
		shoppingCarService.addShoppingCar(commditys.getCommdityId(), users.getUserId());
		return "listShoppingCar";
	}
	
	//��ѯ���й��ﳵ
	@Action("findAllShoppingCar")
	public String findAllShoppingCar() {
		if(session.get("users")==null) {
			return "error";
		}
		users=(Users) session.get("users");
		//�����û�id��ѯ�û��µĹ��ﳵ����
		shoppingCarList = shoppingCarService.findAll(users.getUserId());
		return "shoppingCarJsp";
	}
	
	//ɾ�����ﳵ
	@Action("deleteShoppingCar")
	public String deleteShoppingCar() {
		if(session.get("users")==null) {
			return "error";
		}
		shoppingCarService.deleteShoppingCar(shoppingCar.getShoppingCarId());
		return "listShoppingCar";
	}
	
	
	//���ﳵ���Ӽ�������
	@Action("editShoppingCarNumber")
	public String editShoppingCarNumber() {
		if(session.get("users")==null) {
			return "error";
		}
		int num=shoppingCarService.editShoppingCar(shoppingCar.getShoppingCarId(), jiajian);
		return ""+num;
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		session=arg0;
	}
	

	
	
}
