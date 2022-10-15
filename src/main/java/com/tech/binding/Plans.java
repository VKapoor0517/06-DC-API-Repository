package com.tech.binding;

public class Plans {

	public Integer planId;
	public String name;

	public Plans() {
		// TODO Auto-generated constructor stub
	}

	public Integer getPlanId() {
		return planId;
	}

	public void setPlanId(Integer planId) {
		this.planId = planId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Plans(Integer planId, String name) {
		super();
		this.planId = planId;
		this.name = name;
	}

}
