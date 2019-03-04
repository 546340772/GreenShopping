package com.cn.service;

import java.util.List;

import com.cn.pojo.Orderitems;
import com.cn.pojo.Orders;
import com.cn.pojo.Shoppingcar;

public interface OrderSer {
	//��ѯѡ�е���Ʒ int[] carId; 
	public List<Shoppingcar> findByShoppingCarId(int[] carId);
	
	//����carId[] ɾ��shoppingcar���е�����
	public void delShoppingCar(int[] carId);
	
	// ����ύ���� (��������)
	public void addOrder(Orders orders, int[] carId,int userId);
	
	//�޸Ķ���״̬Ϊ�Ѹ���
	public void paymentOrder(int orderId);
	
	//��ѯ���ж���
	public List<Orders> findAllOrders(int userId);
	
	//ͨ������ID��ѯ�ܼ۸�
	public Orders findAllcountPrice(int orderId);
	
	//���Ķ���״̬Ϊ���ջ�
	public void updateOrdersStatus(int orderId);
	
	//��������
	public List<Shoppingcar> nowPay(int commdityId,int userId);
}
