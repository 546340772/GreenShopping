package com.cn.action;

import org.apache.struts2.convention.annotation.Action;



public class CommditypeAction extends Action5_Result {
	
	//������ҳ
	@Action("execute1")
	public String execute() {
		commditypeList=commditypeService.findAll();
		return "indexJsp";
	}
	//���ݷ���id��ѯ��Ʒ  û�д���id�Ͳ�ѯ����
		@Action("findCommditysByTypeID")
		public String findCommditysByTypeID() {
			if(commdiType==null) {
				commditysList=commdityService.SelectAllCommditys();
			}else {
				commditysList=commdityService.SelectCommditysByTypeID(commdiType.getCommdiTypeId());
			}
			return "tplistJsp";
		}

}
