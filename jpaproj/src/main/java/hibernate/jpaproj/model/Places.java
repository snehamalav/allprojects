package hibernate.jpaproj.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class Places {
@Id
private int placeid;
private String placename;
private String location;
public int getPlaceid() {
	return placeid;
}
public void setPlaceid(int placeid) {
	this.placeid = placeid;
}
public String getPlacename() {
	return placename;
}
public void setPlacename(String placename) {
	this.placename = placename;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public Places(int placeid, String placename, String location) {
	super();
	this.placeid = placeid;
	this.placename = placename;
	this.location = location;
}
public Places() {
	super();
}

}
