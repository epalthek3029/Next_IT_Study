
public class Ex06ForStmt {
	
	public static void main (String [] args) {
		
		//	2번
		//	**********
		//	*********
		//	********
		//	*******
		//	******
		//	*****
		//	****
		//	***
		//	**
		//	*

		System.out.println("=========2번문제=========");
		int cnt = 10;
		
		for(int i = 0; i < cnt; i++) {
			for(int j = 0; j < cnt - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//	3번
		//	*
		//	**
		//	***
		//	****
		//	*****
		//	******
		//	*******
		//	********
		//	*********
		//	**********		
		
		System.out.println("=========3번문제=========");
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//	4번
		//		     *
		//		    **
		//	       ***
		//	      ****
		//	     *****
		//	    ******
		//	   *******
		//	  ********
		//	 *********
		//	**********	
		System.out.println("=========4번문제=========");
		for(int i = 0; i <10; i++){
			for(int j = 0; j < 9 -i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 1 + i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 	5번
		//	**********
		//	 *********
		//	  ********
		//	   *******
		//	    ******
		//	     *****
		//	      ****
		//	       ***
		//	        **
		//	         *
		System.out.println("=========5번문제=========");
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 10 - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//	6번
		//	*******************
		//	 *****************  
		//    ***************		  
		//	   *************
		//      ***********
		//       *********
		//        *******
		//		   *****
		//			***
		//			 *
		System.out.println("=========6번문제=========");
		for(int i = 0; i < 10; i++) {
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			for(int j = 0; j < (10 - i) * 2 - 1; j++) {
				System.out.print("*");				
			}
			
			System.out.println();
		}
		
		//	7번
		//         AA
		//        ABBA
		//       ABCCBA
		//      ABCDDCBA
		//     ABCDEEDCBA
		//    ABCDEFFEDCBA
		//   ABCDEFGGFEDCBA
		//  ABCDEFGHHGFEDCBA
		// ABCDEFGHIIHGFEDCBA
		//ABCDEFGHIJJIHGFEDCBA		
		//ABCDEFGHIJJIHGFEDCBA
		// ABCDEFGHIIHGFEDCBA
		//  ABCDEFGHHGFEDCBA
		//   ABCDEFGGFEDCBA
		//    ABCDEFFEDCBA
		//     ABCDEEDCBA
		//      ABCDDCBA
		//       ABCCBA
		//        ABBA
		//         AA
		System.out.println("=========7번문제=========");
	
		
		int i, j, k, n;
		for( i = 0; i < 10; i++) {
			for( j = 0; j < 9 - i; j++ ) {
				System.out.print(" ");
			}
			for( k =0; k <= i; k++) {
				System.out.print((char)('A' + k));
			}
			for( n = k-1; n >= 0 ; n--) {
				System.out.print((char)('A' + n));
			}
			System.out.println();
		}
		
		for( i = 0; i < 10; i++) {
			for( j = 0; j <  i; j++ ) {
				System.out.print(" ");
			}

			for( k =0; k <= 9 - i; k++) {
				System.out.print((char)('A' + k));
			}
			for( n = k-1; n >= 0 ; n--) {
				System.out.print((char)('A' + n));
			}
			System.out.println();
		}	
		
		
		//		8번
		//
		//		ABCDEFGHIJJIHGFEDCBA
		//		 ABCDEFGHIIHGFEDCBA
		//		  ABCDEFGHHGFEDCBA
		//		   ABCDEFGGFEDCBA
		//		    ABCDEFFEDCBA
		//		     ABCDEEDCBA
		//		      ABCDDCBA
		//		       ABCCBA
		//		        ABBA
		//		         AA
		//		         AA
		//		        ABBA
		//		       ABCCBA
		//		      ABCDDCBA
		//		     ABCDEEDCBA
		//		    ABCDEFFEDCBA
		//		   ABCDEFGGFEDCBA
		//		  ABCDEFGHHGFEDCBA
		//		 ABCDEFGHIIHGFEDCBA
		//		ABCDEFGHIJJIHGFEDCBA		
		System.out.println("=========8번문제=========");	
		for( i = 0; i < 10; i++) {
			for( j = 0; j <  i; j++ ) {
				System.out.print(" ");
			}

			for( k =0; k <= 9 - i; k++) {
				System.out.print((char)('A' + k));
			}
			for( n = k-1; n >= 0 ; n--) {
				System.out.print((char)('A' + n));
			}
			System.out.println();
		}
		for( i = 0; i < 10; i++) {
			for( j = 0; j < 9 - i; j++ ) {
				System.out.print(" ");
			}
			for( k =0; k <= i; k++) {
				System.out.print((char)('A' + k));
			}
			for( n = k-1; n >= 0 ; n--) {
				System.out.print((char)('A' + n));
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
