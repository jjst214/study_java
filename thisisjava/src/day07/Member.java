package day07;

public class Member {
	String name;
	String id;
	String password;
	int age;
	
	public Member() { }
	public Member(String name) {
			this.name = name;
	}
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}
	public Member(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	public Member(String name, String id, String password, int age) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
	void introduce() {
		System.out.println("이름 : " + name + "\n아이디 : " + id + "\n비번 : " + password + "\n나이 : " + age);
	}
}
