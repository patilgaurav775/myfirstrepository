package SerializationDeSerialization;

import java.util.List;

public class sampledata {

	public Integer id;
	public String firstname;
	public String lastname;
	public String email;
	public String job;
	
	List<String> courses;
	
	public int getid() {
		return id;
	}
	public void setid(Integer id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public String getdata() {
		return(this.id+" "+this.firstname+" "+this.lastname+" "+this.email+" "+this.job+" "+this.courses);
	}
	
}

