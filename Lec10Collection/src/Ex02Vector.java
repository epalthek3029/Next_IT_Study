import java.util.Vector;

public class Ex02Vector {

	public static void main(String[] args) {
		
		Vector<Object> vec = new Vector<Object>();
		
		vec.add(new String("이산"));
		vec.add(new Integer(25));
		vec.add(78.23);	// auto Boxing
		
		System.out.println(vec);
		
		int size = vec.size();
		
		for(int i = 0; i < vec.size(); i++) {
			Object obj = vec.get(i);
			System.out.println(obj);
		}
		
	}
}
