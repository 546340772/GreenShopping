package com.cn.action;

import java.util.Map;

public class Action3_Parameter extends Action2_Upload {
	//���ﳵ��������ID
	protected int[] carId;
	//�ж��û����Ƿ����
	protected Map<String, Object> userState;
	//ģ�������ַ���
	protected String blurString;
	//��Ӻ�������ﳵ����ʱ���� 0�Ǽ�1�Ǽ�
	protected int jiajian;
	

	public Map<String, Object> getUserState() {
		return userState;
	}

	public void setUserState(Map<String, Object> userState) {
		this.userState = userState;
	}

	public int[] getCarId() {
		return carId;
	}

	public String getBlurString() {
		return blurString;
	}

	public void setBlurString(String blurString) {
		this.blurString = blurString;
	}

	public int getJiajian() {
		return jiajian;
	}

	public void setJiajian(int jiajian) {
		this.jiajian = jiajian;
	}

	public void setCarId(int[] carId) {
		this.carId = carId;
	}
	
}
