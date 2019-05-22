
public class PersonMain {

		public static void main (String [] args) {
			
			// Person p = new Person(); // 객체 생성
			// Person p = new Person("이산", 25);
			 Person p = new Person("지민", 22, 'F', "010-3158-1234");
			
			//p.name = "이주";
			//p.age = 9847987;
			 
			 
			// p.name = "이산";
			// p.age = 25;
			//p.gender = 'M';
			//p.phone = "010-2158-3158";
			
			p.setName("고은");
			p.setAge(23);
			p.setGender('M');
			p.setPhone("010-3158-9999");
			 
			
//			System.out.println("이름 : " + p.name);
//			System.out.println("나이 : " + p.age);
//			System.out.println("성별 : " + p.gender);
//			System.out.println("핸폰 : " + p.phone);
			
			System.out.println("이름 : " + p.getName());
			System.out.println("나이 : " + p.getAge());
			System.out.println("성별 :" + p.getGender());
			System.out.println("핸폰 : " + p.getPhone());
			
			
			
		}
}
