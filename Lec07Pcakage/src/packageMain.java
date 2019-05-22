
import kr.or.nextit.common.Member;
import kr.or.nextit.shape.Rectangle;

public class packageMain {

	public static void main(String[] args) {
		
		Rectangle rect = new Rectangle(20, 30); 
		rect.width = 4;
		rect.height = 8;
		
		System.out.println("넓이 : " + rect.getArea());
		
		Member m1 = Member.getInstance(); // new Member(); // error
		m1.setName("이 산");
		
		Member m2 = Member.getInstance();
		m2.setName("설 현");
		
		Member m3 = Member.getInstance();
		m3.setName("문 별");
		
		System.out.println("m1.name = " + m1.getName());
		System.out.println("m2.name = " + m2.getName());
		System.out.println("m3.name = " + m3.getName());
	}
}
