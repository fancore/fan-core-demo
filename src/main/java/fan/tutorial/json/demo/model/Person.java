package fan.tutorial.json.demo.model;

import java.util.Date;

public class Person {

	private String sex;
	private String name;
	private Date birthdate;
	private String birthplace;
	
	public Person(String name, String sex, String birthplace, Date birthdate){
		this.sex = sex;
		this.name = name;
		this.birthdate = birthdate;
		this.birthplace = birthplace;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthplace() {
		return birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}
}