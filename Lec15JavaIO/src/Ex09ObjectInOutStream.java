import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	
	String name;
	int age;
	char gender;
	String phone;
	
	Person(String name, int age, char gender, String phone){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
	}
}

public class Ex09ObjectInOutStream {

	public static void main(String[] args) {
		
		File file = new File("person.ser");
		
		ObjectInputStream ois = null;
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(file));
			ois = new ObjectInputStream(new FileInputStream(file));
			
			Person[] person = {
					new Person("이산", 25, 'M', "010-1212-4545"),
					new Person("설현", 22, 'M', "010-1315-4222"),
					new Person("초아", 26, 'M', "010-9999-1111"),
					new Person("민지", 29, 'M', "010-9784-2435")
			};
			
			for(int i = 0; i < person.length; i++) {
				oos.writeObject(person[i]);	// 직렬화
			}
			System.out.println("파일 작석 완료");
			
			// 데이터 일기.
			while(true) {
				Person p = (Person)ois.readObject();
				System.out.printf("%s, %d, %c, %s\n", p.name, p.age, p.gender, p.phone);
			}
		} catch (EOFException e) {
			System.out.println("파일의 끝에 도달했습니다.");
		} catch (IOException e) {
			System.out.println("여기서 잡힘.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) oos.close();
				if(ois != null) ois.close();
			} catch (IOException e2) {}
		}
	}
}
