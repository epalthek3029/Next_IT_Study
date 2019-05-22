package kr.or.nextit.common;

// VO(Value Object), Model
public class Member {

	private String name;
	private int age;
	private char gender;

	private static Member instance = new Member();

	public Member() {
	}

	//singleton 패턴
	public static Member getInstance() {
		if (instance == null) {
			instance = new Member();
		}
		return instance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
