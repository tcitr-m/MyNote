package main.java.entity;

/**
 * @author by PIG
 * @date 2020/3/18 11:11
 */
public class UnPerson extends Person {

	public UnPerson() {
	}

	public UnPerson(Person person) {
		this.setSex(person.getSex());
		this.setName(person.getName());

	}
}
