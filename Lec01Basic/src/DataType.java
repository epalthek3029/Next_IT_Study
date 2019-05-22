
/**

자바 Document 주석
@Description :  이 클래스에 대한 설명을 기술.
@Author : 홍길동
@Since : Ver1.8

*/


class DataType{

    /**
     @Description :  이 클래스에 대한 설명을 기술.
     @Return : void
    */
   public static void main(String [] args){

        // 주석(comment): 프로그램에 대한 설명
        // 한 줄 주석
        /*
            여러 줄 주석
        */
      

        // 논리형(boolean), true or false

        boolean bool = false;       // 그냥 boolean bool; 이것만 쓰면 이건 defalt가 false이다.
            

            bool = true;            // c 언어에서는 0이 false지만 java에서는 그저 정수이다.
            bool = 20 > 30;
            System.out.println("bool : " + bool); // 읽기



            int age = 20;
            int balance = 1000000; // 잔액

            // 정수형 (byte, short, int주로쓰는것, long)

            byte a = 127;
            a++;    // a = a + 1; 과 같다. 
            System.out.println("byte : " +  a );

            int b = 210000000;
            System.out.println("int : " + b);

            long c = 3000000000L;
            System.out.println("long : " + c);

            // 문자 (char)
            char ch ='A';
            char ch2 = 66;
            char ch3 = '\u0153';
            System.out.println("char : " + ch + '\n' + "char : " + ch2 + '\n' + "char : " + ch3);

            // 실수형 (float, double)
            float f = 3.14F;
            System.out.println("float : " + f);

            double d = 3.141592329;
            System.out.println("double : " + d);

            // 문자열, String str = new String("문자열");
            String name = new String("문자열");
            String str = "자바의 문자열";
            System.out.println("str : " + str);
            System.out.println("name : " + name);
            
            System.out.println("이클립스 테스트!!!!!");

   }

}
