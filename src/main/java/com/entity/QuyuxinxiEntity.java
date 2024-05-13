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
 * 区域信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
@TableName("quyuxinxi")
public class QuyuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QuyuxinxiEntity() {
		
	}
	
	public QuyuxinxiEntity(T t) {
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
	 * 停放车辆
	 */
					
	private String tingfangcheliang;
	
	/**
	 * 区域位置
	 */
					
	private String quyuweizhi;
	
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
	 * 设置：停放车辆
	 */
	public void setTingfangcheliang(String tingfangcheliang) {
		this.tingfangcheliang = tingfangcheliang;
	}
	/**
	 * 获取：停放车辆
	 */
	public String getTingfangcheliang() {
		return tingfangcheliang;
	}
	/**
	 * 设置：区域位置
	 */
	public void setQuyuweizhi(String quyuweizhi) {
		this.quyuweizhi = quyuweizhi;
	}
	/**
	 * 获取：区域位置
	 */
	public String getQuyuweizhi() {
		return quyuweizhi;
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
