package com.entity.view;

import com.entity.ZulinfeiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 租赁费用
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
@TableName("zulinfeiyong")
public class ZulinfeiyongView  extends ZulinfeiyongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZulinfeiyongView(){
	}
 
 	public ZulinfeiyongView(ZulinfeiyongEntity zulinfeiyongEntity){
 	try {
			BeanUtils.copyProperties(this, zulinfeiyongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
