package com.entity.view;

import com.entity.QuyuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 区域信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
@TableName("quyuxinxi")
public class QuyuxinxiView  extends QuyuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public QuyuxinxiView(){
	}
 
 	public QuyuxinxiView(QuyuxinxiEntity quyuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, quyuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
