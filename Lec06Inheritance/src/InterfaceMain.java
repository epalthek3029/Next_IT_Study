
public class InterfaceMain {

	public static void main(String[] args) {
		
		
		/*
		SeperateVolume book1 = 
				new SeperateVolume("가-1234-56", "행복한 곰돌이 푸", "신용권");
		
		AppCDInfo cd1 = new AppCDInfo("A321-654", "리눅스 페도라 설치");
		
		SeperateVolume book2 = 
				new SeperateVolume("나-934-59", "몰라몰라", "오카르");
		
		AppCDInfo cd2 = new AppCDInfo("Z881-754", "끼야아아아 힝~");
		
		
		book1.checkOut("문별", "2019-01-29");
		cd1.checkOut("문별", "2019-01-29");
		book2.checkOut("문별", "2019-01-29");
		cd2.checkOut("문별", "2019-01-29");
		*/
		
		// upcasting
		/*
		Lendable book1 = 
				new SeperateVolume("가-1234-56", "행복한 곰돌이 푸", "신용권");
		
		Lendable cd1 = new AppCDInfo("A321-654", "리눅스 페도라 설치");
		
		Lendable book2 = 
				new SeperateVolume("나-934-59", "몰라몰라", "오카르");
		
		Lendable cd2 = new AppCDInfo("Z881-754", "끼야아아아 힝~");
		*/
		
		Lendable[] lendList = {
				new SeperateVolume("가-1234-56", "행복한 곰돌이 푸", "신용권"),
				new AppCDInfo("A321-654", "리눅스 페도라 설치"),
				new SeperateVolume("나-934-59", "몰라몰라", "오카르"),
				new AppCDInfo("Z881-754", "끼야아아아 힝~")
		};
		
		checkOutAll(lendList, "설현", "2019-01-29");
		
		}

	public static void checkOutAll(Lendable[] lendList, String borrower, String date) {
		for (int i = 0; i < lendList.length; i++) {
			lendList[i].checkOut(borrower, date);
		}

	}
}
