package core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue
	private Integer id;
	@Column
	private Integer age;
	@Column
	private String name;
	@Column
	private String surname;

	public Person() {
		super();

	}

	public Person(Integer id, Integer age, String name, String surname) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.surname = surname;
	}
	public Person(Integer age, String name, String surname) {
		super();
		this.age = age;
		this.name = name;
		this.surname = surname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}


	

}
