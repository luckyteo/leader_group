package com.devsimple.leader_group.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Objects;

@Data
@Entity
@Table(name = "leadergroup_authority")
public class Authority implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "is_system_role")
	private Boolean isSystemRole;

	@NotNull
	@Size(max = 50)
	@Id
	@Column(name = "name", length = 50)
	private String name;

	@Column(name = "descriptions", length = 255)
	private String descriptions;


	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Authority)) {
			return false;
		}
		return Objects.equals(name, ((Authority) o).name);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(name);
	}
}
