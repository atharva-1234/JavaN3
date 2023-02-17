package org.tnsif.herichicalinherticance;

public class Andorid_version {
private  String type;

public String getType() {
	return type;
}

public void setType(String type) {
	this.type = type;
}

public Andorid_version() {
	System.out.println(" parent class- andorid version");
	
	// TODO Auto-generated constructor stub
}

public Andorid_version(String type) {
	super();
	this.type = type;
}

@Override
public String toString() {
	return "Andorid_version [type=" + type + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
}

}
