import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCBasic {

	public static void main(String[] args) {
		
		// #1. 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println(">>>>> 드라이버 로딩 성공 <<<<<");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// #2. 커넥션
		Connection conn = null;
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "java";
		String password = "oracle";
		
		String query = "";
		Statement stmt= null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println(">>> 데이터베이스 연결 성공 <<<");
			
			// #3. SQL수행, CRUD(Create, Read, Update, Delete)
			// DML : Insert, Update, Delete
			// DQL : Select
			
			// 데이터 등록
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("아 이 디 : ");
			String memId = reader.readLine();
			
			System.out.print("이    름: ");
			String memName = reader.readLine();
			
			System.out.print("패스워드 : ");
			String memPw = reader.readLine();
			
			System.out.print("전화번호 : ");
			String memPhone = reader.readLine();
			
			System.out.print("이 메 일 : ");
			String memEmail = reader.readLine();
			
			query = "INSERT INTO TB_MEMBER(" +
					"    MEM_ID," +
					"    MEM_NAME," +
					"    MEM_PW," +
					"    MEM_PHONE," +
					"    MEM_EMAIL," +
					"    REG_DATE" +
					" ) VALUES (" + 
					"    ?, " +
					"    ?, " +
					"    ?, " +
					"    ?, " +
					"    ?, " +
					"    SYSDATE " +
					" )";
			// 기준 쿼리 생성
			pstmt = conn.prepareStatement(query);
			
			// 데이터 바인딩
			pstmt.setString(1, memId);
			pstmt.setString(2, memName);
			pstmt.setString(3, memPw);
			pstmt.setString(4, memPhone);
			pstmt.setString(5, memEmail);

			// 쿼리 실행
			int updCnt = pstmt.executeUpdate();
			System.out.println(updCnt + " 명의 회원이 등록 되었습니다.");
			
			
			
			// 데이터 조회
			query =" SELECT MEM_ID, MEM_NAME, MEM_PW, MEM_PHONE, MEM_EMAIL, REG_DATE" +
					" FROM TB_MEMBER ORDER BY REG_DATE DESC";
			stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(query);
			
			System.out.println("===== 회원목록 =====");
			
			while(rs.next()) {
				String id 		= rs.getString("MEM_ID");
				String name 	= rs.getString("MEM_NAME");
				String pwd 	= rs.getString("MEM_PW");
				String phone 	= rs.getString("MEM_PHONE");
				String email	= rs.getString("MEM_EMAIL");
				String regDate	= rs.getString("REG_DATE");
				
				System.out.printf("%s\t, %s\t, %s\t, %s\t, %s\t, %s\n", id, name, pwd, phone, email, regDate);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // #4. 연결 종료
			if(conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}	
		
		
		
		
		

	}
}
