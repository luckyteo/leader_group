package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "Authority")
public class Authority {

	@Id
	@Column(name = "name")
	private String name;

	@Column(name = "descriptions")
	private String des;

	@Column(name = "is_system_role")
	private Boolean isSystemRole;

	protected Authority() {
	}

	public Authority(String name, String des, Boolean isSystemRole) {
		super();
		this.name = name;
		this.des = des;
		this.isSystemRole = isSystemRole;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	public Boolean getIsSystemRole() {
		return isSystemRole;
	}

	public void setIsSystemRole(Boolean isSystemRole) {
		this.isSystemRole = isSystemRole;
	}

	@Override
	public String toString() {
		return "Authority [name=" + name + ", des=" + des + ", isSystemRole="
				+ isSystemRole + "]";
	}

}
