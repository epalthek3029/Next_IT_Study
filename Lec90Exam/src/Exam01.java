
public class Exam01 {
	
	public static void main(String[] args) {
		
	// 기본 데이터 타입으로 정보 받기 (String, char, short, int, long, float, double, boolean)
	String name = "설 현";
	int age = 25;				// 선언과 동시에 초기
	char gender = 'F';
	double height = 167.5;
	float weight = 46.8F;
	String phone = "042-719-8850";
	String address;
	String jop;
    boolean marride = false;
    
	address = "대전 서구";
	jop = "연예인";
	
	// 출력란
	System.out.println("●●●●● 개인 정보 출력 시작 ●●●●●");
	System.out.println("이 름 : " + name + '\n' + "나 이 : " + age);
	System.out.print("성 별 : " + gender + '\n' + "신 장 : " + height + '\n' +"체 중 : " + weight + '\n' +"전 화­ : " + phone + '\n');
	System.out.printf("주 소 : %s\n직 업 : %s\n결혼여부 : %b\n", address, jop, marride);
	System.out.println("●●●●● 개인 정보 출력 종료 ●●●●●");
	}
}

		
	