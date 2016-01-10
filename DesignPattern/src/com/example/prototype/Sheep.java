package com.example.prototype;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * CloneAble克隆标记借口
 * 
 * @author 北飞的候鸟
 *
 */
public class Sheep implements Cloneable,Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4916037322367673975L;
	
	
	private String sname;
	private Date birthday;
	
	public Sheep() {
	}
	
	public Sheep(String sname, Date birthday) {
		super();
		this.sname = sname;
		this.birthday = birthday;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		//return super.clone();
		Object obj = super.clone();
		Sheep s = (Sheep)obj;
		s.birthday = (Date) this.birthday.clone();
		return obj;
		
	}

	@Override
	public String toString() {
		return "Sheep [sname=" + sname + ", birthday=" + birthday + "]";
	}
	
}
