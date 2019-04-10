package ch07;

public class Class {
	static id;
	String password;
	String name;
	String age;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	
//	public int getAg() {
//		return age;
//	}
//	public void setAge(int a) {
//		if (a < 0 || a > 200) {
//			System.out.println("잘못된 나이입니다.");
//			return; // 캡슐화
//		}
//		age = a;
//	}
//	
//	public void setId(String i) {
//		id = i;
//	}

}
