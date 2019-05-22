
public class Ex04Switch {

		public static void main(String[] args) {
			
			// int x = 1;
			char ch = 'E'; // A = 65
			
			switch(ch){
				case 'A':
					System.out.println("밀크커피.");
					break;
				case 'B':
					System.out.println("설탕커피.");
					break;
				case 'C':
					System.out.println("블랙커피.");
					break;
				case 'D':
					System.out.println("율무차.");
					break;
				default : System.out.println("A~D 범위 내에 입력하세요");
			}
			
			
		}
}
