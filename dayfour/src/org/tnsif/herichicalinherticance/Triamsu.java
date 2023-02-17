package org.tnsif.herichicalinherticance;

public class Triamsu extends Andorid_version{
	private int version;

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public Triamsu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Triamsu(String type,int version) {
		super();
		this.version = version;
	}

	@Override
	public String toString() {
		return "Triamsu [version=" + version + ", getType()=" + getType() + ", toString()=" + super.toString() + "]";
	}

	
	
	

	
	

}
