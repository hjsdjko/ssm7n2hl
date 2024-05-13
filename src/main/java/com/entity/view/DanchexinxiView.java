package com.entity.view;

import com.entity.DanchexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 单车信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
@TableName("danchexinxi")
public class DanchexinxiView  extends DanchexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DanchexinxiView(){
	}
 
 	public DanchexinxiView(DanchexinxiEntity danchexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, danchexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
