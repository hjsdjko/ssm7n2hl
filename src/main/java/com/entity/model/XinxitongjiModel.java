package com.entity.model;

import com.entity.XinxitongjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 信息统计
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
public class XinxitongjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 保有押金
	 */
	
	private Integer baoyouyajin;
		
	/**
	 * 车辆数量
	 */
	
	private Integer cheliangshuliang;
		
	/**
	 * 在库车辆
	 */
	
	private Integer zaikucheliang;
		
	/**
	 * 维护费用
	 */
	
	private Integer weihufeiyong;
		
	/**
	 * 租金流水
	 */
	
	private Integer zujinliushui;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
				
	
	/**
	 * 设置：保有押金
	 */
	 
	public void setBaoyouyajin(Integer baoyouyajin) {
		this.baoyouyajin = baoyouyajin;
	}
	
	/**
	 * 获取：保有押金
	 */
	public Integer getBaoyouyajin() {
		return baoyouyajin;
	}
				
	
	/**
	 * 设置：车辆数量
	 */
	 
	public void setCheliangshuliang(Integer cheliangshuliang) {
		this.cheliangshuliang = cheliangshuliang;
	}
	
	/**
	 * 获取：车辆数量
	 */
	public Integer getCheliangshuliang() {
		return cheliangshuliang;
	}
				
	
	/**
	 * 设置：在库车辆
	 */
	 
	public void setZaikucheliang(Integer zaikucheliang) {
		this.zaikucheliang = zaikucheliang;
	}
	
	/**
	 * 获取：在库车辆
	 */
	public Integer getZaikucheliang() {
		return zaikucheliang;
	}
				
	
	/**
	 * 设置：维护费用
	 */
	 
	public void setWeihufeiyong(Integer weihufeiyong) {
		this.weihufeiyong = weihufeiyong;
	}
	
	/**
	 * 获取：维护费用
	 */
	public Integer getWeihufeiyong() {
		return weihufeiyong;
	}
				
	
	/**
	 * 设置：租金流水
	 */
	 
	public void setZujinliushui(Integer zujinliushui) {
		this.zujinliushui = zujinliushui;
	}
	
	/**
	 * 获取：租金流水
	 */
	public Integer getZujinliushui() {
		return zujinliushui;
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
