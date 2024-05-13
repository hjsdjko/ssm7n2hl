package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 信息统计
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
@TableName("xinxitongji")
public class XinxitongjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XinxitongjiEntity() {
		
	}
	
	public XinxitongjiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 年月
	 */
					
	private String nianyue;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：年月
	 */
	public void setNianyue(String nianyue) {
		this.nianyue = nianyue;
	}
	/**
	 * 获取：年月
	 */
	public String getNianyue() {
		return nianyue;
	}
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
