package bexysuttx.entity;

import java.io.Serializable;

public class Ttable implements Serializable {
	private static final long serialVersionUID = -3321975665507648045L;
	private int id;
	private String value;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return String.format("{\"ID\":%s,\"VALUE\":\"%s\"", getId(), getValue());
	}

}
