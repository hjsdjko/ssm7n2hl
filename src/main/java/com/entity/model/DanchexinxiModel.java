package com.entity.model;

import com.entity.DanchexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 单车信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
public class DanchexinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 所属区域
	 */
	
	private String suoshuquyu;
		
	/**
	 * 停放位置
	 */
	
	private String tingfangweizhi;
		
	/**
	 * 小时价格
	 */
	
	private Integer xiaoshijiage;
		
	/**
	 * 单车图片
	 */
	
	private String danchetupian;
		
	/**
	 * 押金
	 */
	
	private Integer yajin;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：所属区域
	 */
	 
	public void setSuoshuquyu(String suoshuquyu) {
		this.suoshuquyu = suoshuquyu;
	}
	
	/**
	 * 获取：所属区域
	 */
	public String getSuoshuquyu() {
		return suoshuquyu;
	}
				
	
	/**
	 * 设置：停放位置
	 */
	 
	public void setTingfangweizhi(String tingfangweizhi) {
		this.tingfangweizhi = tingfangweizhi;
	}
	
	/**
	 * 获取：停放位置
	 */
	public String getTingfangweizhi() {
		return tingfangweizhi;
	}
				
	
	/**
	 * 设置：小时价格
	 */
	 
	public void setXiaoshijiage(Integer xiaoshijiage) {
		this.xiaoshijiage = xiaoshijiage;
	}
	
	/**
	 * 获取：小时价格
	 */
	public Integer getXiaoshijiage() {
		return xiaoshijiage;
	}
				
	
	/**
	 * 设置：单车图片
	 */
	 
	public void setDanchetupian(String danchetupian) {
		this.danchetupian = danchetupian;
	}
	
	/**
	 * 获取：单车图片
	 */
	public String getDanchetupian() {
		return danchetupian;
	}
				
	
	/**
	 * 设置：押金
	 */
	 
	public void setYajin(Integer yajin) {
		this.yajin = yajin;
	}
	
	/**
	 * 获取：押金
	 */
	public Integer getYajin() {
		return yajin;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
			
}
