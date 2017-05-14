package com.zw.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 3072 kB
 * </p>
 *
 * @author zha
 * @since 2017-05-14
 */
@TableName("t_company")
public class Company extends Model<Company> {

    private static final long serialVersionUID = 1L;

	private String id;
	@TableField("company_name")
	private String companyName;
	private String address;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
