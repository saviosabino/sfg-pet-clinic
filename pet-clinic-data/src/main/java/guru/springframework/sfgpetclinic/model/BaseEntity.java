package guru.springframework.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2441302184792880252L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	private Long id;
}
