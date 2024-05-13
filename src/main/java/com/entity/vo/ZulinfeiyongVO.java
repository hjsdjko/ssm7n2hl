package com.entity.vo;

import com.entity.ZulinfeiyongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 租赁费用
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-09 10:59:37
 */
public class ZulinfeiyongVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 单车编号
	 */
	
	private String danchebianhao;
		
	/**
	 * 押金
	 */
	
	private String yajin;
		
	/**
	 * 是否超时
	 */
	
	private String shifouchaoshi;
		
	/**
	 * 租赁费用
	 */
	
	private String zulinfeiyong;
		
	/**
	 * 超时费用
	 */
	
	private String chaoshifeiyong;
		
	/**
	 * 总费用
	 */
	
	private String zongfeiyong;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 用户手机
	 */
	
	private String yonghushouji;
		
	/**
	 * 归还时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date guihaishijian;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
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
	 * 设置：押金
	 */
	 
	public void setYajin(String yajin) {
		this.yajin = yajin;
	}
	
	/**
	 * 获取：押金
	 */
	public String getYajin() {
		return yajin;
	}
				
	
	/**
	 * 设置：是否超时
	 */
	 
	public void setShifouchaoshi(String shifouchaoshi) {
		this.shifouchaoshi = shifouchaoshi;
	}
	
	/**
	 * 获取：是否超时
	 */
	public String getShifouchaoshi() {
		return shifouchaoshi;
	}
				
	
	/**
	 * 设置：租赁费用
	 */
	 
	public void setZulinfeiyong(String zulinfeiyong) {
		this.zulinfeiyong = zulinfeiyong;
	}
	
	/**
	 * 获取：租赁费用
	 */
	public String getZulinfeiyong() {
		return zulinfeiyong;
	}
				
	
	/**
	 * 设置：超时费用
	 */
	 
	public void setChaoshifeiyong(String chaoshifeiyong) {
		this.chaoshifeiyong = chaoshifeiyong;
	}
	
	/**
	 * 获取：超时费用
	 */
	public String getChaoshifeiyong() {
		return chaoshifeiyong;
	}
				
	
	/**
	 * 设置：总费用
	 */
	 
	public void setZongfeiyong(String zongfeiyong) {
		this.zongfeiyong = zongfeiyong;
	}
	
	/**
	 * 获取：总费用
	 */
	public String getZongfeiyong() {
		return zongfeiyong;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：用户手机
	 */
	 
	public void setYonghushouji(String yonghushouji) {
		this.yonghushouji = yonghushouji;
	}
	
	/**
	 * 获取：用户手机
	 */
	public String getYonghushouji() {
		return yonghushouji;
	}
				
	
	/**
	 * 设置：归还时间
	 */
	 
	public void setGuihaishijian(Date guihaishijian) {
		this.guihaishijian = guihaishijian;
	}
	
	/**
	 * 获取：归还时间
	 */
	public Date getGuihaishijian() {
		return guihaishijian;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
