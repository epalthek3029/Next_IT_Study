
public class Member {

	String id;
	String name;
	int age;
	String phone;
	
	public Member(){}
	
	Member(String id, String name, int age, String phone){
	
		this.id = id;
		this.name = name;
		this.age = age;
		this.phone = phone;
		
		
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member) {
			
			Member m = (Member)obj;
			
			if(this.id.equals(m.id) && 
			   this.name.equals(m.name) &&
			   this.age == m.age &&
			   this.phone.equals(m.phone)) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return id + " | " + name + " ( " + age + " ) | " + phone; 
	}
	
	
	
	
	
	
	
}
