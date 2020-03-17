package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "leadergroup_authority")
public class Authority {

	@Id
	@Column(name = "name")
	private String name;

	@Column(name = "descriptions")
	private String des;

	@Column(name = "is_system_role")
	private Boolean isSystemRole;
}
