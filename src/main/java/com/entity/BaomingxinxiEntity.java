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
 * 报名信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-02 11:45:35
 */
@TableName("baomingxinxi")
public class BaomingxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public BaomingxinxiEntity() {
		
	}
	
	public BaomingxinxiEntity(T t) {
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
	 * 报名编号
	 */
					
	private String baomingbianhao;
	
	/**
	 * 报考项目
	 */
					
	private String baokaoxiangmu;
	
	/**
	 * 报考位置
	 */
					
	private String baokaoweizhi;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 身份证号码
	 */
					
	private String shenfenzhenghaoma;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 专业
	 */
					
	private String zhuanye;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	
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
	 * 设置：报名编号
	 */
	public void setBaomingbianhao(String baomingbianhao) {
		this.baomingbianhao = baomingbianhao;
	}
	/**
	 * 获取：报名编号
	 */
	public String getBaomingbianhao() {
		return baomingbianhao;
	}
	/**
	 * 设置：报考项目
	 */
	public void setBaokaoxiangmu(String baokaoxiangmu) {
		this.baokaoxiangmu = baokaoxiangmu;
	}
	/**
	 * 获取：报考项目
	 */
	public String getBaokaoxiangmu() {
		return baokaoxiangmu;
	}
	/**
	 * 设置：报考位置
	 */
	public void setBaokaoweizhi(String baokaoweizhi) {
		this.baokaoweizhi = baokaoweizhi;
	}
	/**
	 * 获取：报考位置
	 */
	public String getBaokaoweizhi() {
		return baokaoweizhi;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：身份证号码
	 */
	public void setShenfenzhenghaoma(String shenfenzhenghaoma) {
		this.shenfenzhenghaoma = shenfenzhenghaoma;
	}
	/**
	 * 获取：身份证号码
	 */
	public String getShenfenzhenghaoma() {
		return shenfenzhenghaoma;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：专业
	 */
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
