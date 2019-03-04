package com.cn.action;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.interceptor.SessionAware;

import com.cn.pojo.Orderitems;
import com.cn.pojo.Orders;
import com.cn.pojo.Users;


public class OrderAction extends Action5_Result implements SessionAware{
	private Map session;
	
	
	//��������
		@Action("nowPay")
		public String nowPay() {
			if(session.get("users")==null) {
				return "error";
			}
			//��ӵ����ﳵ,Ȼ���ύ����
			users=(Users) session.get("users");
			shoppingCarList = orderSer.nowPay(commditys.getCommdityId(),users.getUserId());
			return "findByCarIdsuccess";
			
		}
	
	//��ѯѡ�е���Ʒ int[] carId; 
	@Action("findByShoppingCarId")
	public String findByShoppingCarId() throws IOException {
		if(session.get("users")==null) {
			return "error";
		}
			shoppingCarList = orderSer.findByShoppingCarId(carId);
			return "findByCarIdsuccess";
	}
	//��������
	@Action("addOrder")
	public String addOrder() throws IOException {
		users = (Users) session.get("users");
		if(users==null) {
			return "error";
			}
			int userId=users.getUserId();
			orderSer.addOrder(orders, carId, userId);
			return "addOrderSuccess";
	}
	
	//�޸Ķ���Ϊ�Ѹ���
	@Action("paymentOrder")
	public String paymentOrder() {
		if(session.get("users")==null) {
			return "error";
		}
		System.out.println(orders.getOrderId());
		orderSer.paymentOrder(orders.getOrderId());
		System.out.println("A");
		return "paymentSuccess";
	}
	
	//��ѯ���ж���
	@Action("findAllOrders")
	public String findAllOrderitems() {
		users = (Users) session.get("users");
		if(users==null) {
			return "error";
		}
		ordersList = orderSer.findAllOrders(users.getUserId());
		return "fAOsuccess";
	}
	
	//ͨ��ID��ѯ�ܼ۸�
	@Action("findcountPriceById")
	public String findcountPriceById() {
		if(session.get("users")==null) {
			return "error";
		}
		orders = orderSer.findAllcountPrice(orders.getOrderId());
		return "success";
	}
	
	//�޸Ķ���״̬Ϊ���ջ�
	@Action("updateOrdersStatus")
	public String updateOrdersStatus() {
		if(session.get("users")==null) {
			return "error";
		}
		//��jspҳ�浯����ʾ��
		orderSer.updateOrdersStatus(orders.getOrderId());
		return "updateOrdersStatusSuccess";
	}
	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session=session;
	}

}
