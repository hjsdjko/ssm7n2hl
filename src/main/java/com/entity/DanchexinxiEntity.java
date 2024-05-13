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
 * 单车信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
@TableName("danchexinxi")
public class DanchexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DanchexinxiEntity() {
		
	}
	
	public DanchexinxiEntity(T t) {
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
	 * 单车编号
	 */
					
	private String danchebianhao;
	
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
	 * 设置：单车编号
	 */
	public void setDanchebianhao(String danchebianhao) {
		this.danchebianhao = danchebianhao;
	}
	/**
	 * 获取：单车编号
	 */
	public String getDanchebianhao() {
		return danchebianhao;
	}
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
