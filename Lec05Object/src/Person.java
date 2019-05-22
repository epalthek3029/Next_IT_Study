
// JavaBean,VO(Value Object), Model
public class Person {
	
	final float PI = 3.14f; // 상수 필드( 값 변경이 안됨, 상수 필드는 일반 변수와 구분하기 위해 대문자로 적는다)
	final int MAX_VALUE = 2100000;
	
	// 맴버 필드(Field) = 변수
	
	// 접근제한자 : private < default < protected < public		( 필드, 메서드, 클레스 에 사용 ) 
	private String name; // private 접근 불가능(외부에서는 일체 안됨)
	private int age;	  // default 같은 폴더면 사용 가능
	private char gender; // protected 같은 폴더라도 사용 x
	private String phone;// public 언제 어디서 누구든 사용 가능
	
	// Person(){}  << default constructor 디폴트 생성자
	// 생성자를 안만들면 위 기본적인 디폴트 생성자가 자동으로 생성되어 넣어진다.
	
	// 생성자
	Person(String name, int age){
		this.name = name; // 지역필드 name과 맴버 변수 name을 구분하기 위해서
		this.age = age;		
	}
	
	Person(String name, int age, char gender, String phone){
		this(name,age);
//		this.name = name;  중복되는건 안좋으니 위 처럼 내가 미리 만든걸 받아온다(첫줄에만 올 수 있다.),, Overloading(중복)되어있는 다른 생성자를 호출 할 수 있다.
//		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		if(age <0 || age > 120) {
			System.out.println("나이의 범위를 벗어났습니다.");
			return;
		}
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public char getGender() {
		return gender;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getPhone() {
		return phone;
	}

	
	
	
	
	
}
