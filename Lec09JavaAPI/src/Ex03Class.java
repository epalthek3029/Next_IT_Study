import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

interface IHello{
	public void sayHello(String userName);
}

class Hello implements IHello{
	public String userName;
	
	public Hello() {}
	
	public void sayHello() {
		System.out.println(userName + "안녕.");
	}
	
	public void sayHello(String userName) {
		System.out.println(userName + "안녕하세요.");
	}
}



public class Ex03Class {

	private static final Object instance = null;

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		
		// 클래스 정적 로딩 #1
		Member m1 = new Member();
		m1.name = "이산";
		System.out.println("m1.name =  " + m1.name);
		// Member member;  << Framework, IoC(DI)
		
		// 클래스 동적 로딩 #2
		Class cls = Member.class;
		System.out.println("클래스 명 : " + cls.getName());
		System.out.println("클래스 명 : " + cls.getSimpleName());
		
		// 클래스 정보로 객체 생성
		Object obj = cls.newInstance();	// new 생성자();
		Member m2 = (Member)obj; // 다운캐스팅.
		m2.name = "설현";
		System.out.println("m2.name = " + m2.name);
				
		// ### 클래스 동적 로딩 : 리플렉션 이유 : 다운캐스팅이 불가능한 상황에서 객체 사용
		String className = "Hello";//args[0];
		cls = Class.forName(className); // 클래스를 동적 로딩.
		System.out.println("Class Name : " + cls.getName());
		
		Object instance = cls.newInstance(); // new Hellow();
		
		// Hellow h = (Hellow)instance; 다운캐스팅 불가 왜? 모르니깐 어딧는지
		
		Field field = cls.getField("userName");
		field.set(instance, "문별");
		
		Method method = cls.getMethod("sayHellow", null);
		method.invoke(instance, null);

		method = cls.getMethod("sayHello", String.class);
		method.invoke(instance, "화사");
		
		// ## 리플렉션 2 예제.
		IHello h = (IHello)instance; // 다운캐스팅
		h.sayHello("제니");

		
		
		
		
		
		
		
		
		
		
		/*
		// 생성자 정보
		System.out.println(">>>>>>>>>생성자 정보<<<<<<<<<");
		Constructor[] constructors = cls.getConstructors();
		for(int i = 0; i < constructors.length; i++) {
			System.out.println(constructors[i]);
		}
			
		// 필드 정보
		System.out.println(">>>>>>>>>필 정보<<<<<<<<<");
		Field[] fields = cls.getFields();
		for(int i = 0; i < fields.length; i++) {
			System.out.println(fields[i]);
		}
		
		// 메소드 정보
		System.out.println(">>>>>>>>>메서 정보<<<<<<<<<");
		Method[] methods = cls.getMethods();
		for(int i = 0; i < methods.length; i++) {
			System.out.println(methods[i]);
		}
		*/
		
		
		
	}
}
