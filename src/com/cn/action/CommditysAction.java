package com.cn.action;

import java.util.List;

import org.apache.struts2.convention.annotation.Action;

import com.cn.pojo.Commditys;

public class CommditysAction extends Action5_Result{
	
	//ģ����ѯ
	@Action("blurSelect")
	public String blurSelect() {
		commditysList = commdityService.blurSelect(blurString);
		return "tplistJsp";
	}
	
	//������Ʒid��ѯ��������Ʒ����ҳ
	@Action("SelectById")
	public String SelectById() {
		commditys=commdityService.selectByCommditysId(commditys.getCommdityId());
		return "cpxqJsp";
	}
	
	
	

}
