package com.entity.view;

import com.entity.XinxitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 信息统计
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
@TableName("xinxitongji")
public class XinxitongjiView  extends XinxitongjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XinxitongjiView(){
	}
 
 	public XinxitongjiView(XinxitongjiEntity xinxitongjiEntity){
 	try {
			BeanUtils.copyProperties(this, xinxitongjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
