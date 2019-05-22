import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import kr.or.nextit.jdbc.ConnectionFactory;
import kr.or.nextit.jdbc.ConnectionPool;
import kr.or.nextit.member.dao.MemberDao;
import kr.or.nextit.member.model.Member;

public class JDBCBasic2 {

	public static void main(String[] args) {
		
		MemberDao memberDao = MemberDao.getInstance();
		
		ConnectionFactory connFactory = ConnectionFactory.getInstance();
		
		ConnectionPool pool = ConnectionPool.getInstance();
		
		// #1. 드라이버 로딩
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			System.out.println(">>>>> 드라이버 로딩 성공 <<<<<");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		// #2. 커넥션
		Connection conn = null;
//		String url = "jdbc:oracle:thin:@localhost:1521:XE";
//		String user = "java";
//		String password = "oracle";
		
		String query = "";
		Statement stmt= null;
		PreparedStatement pstmt = null;
		
		try {
//			conn = connFactory.getConnection();
			
			conn = pool.getConnection();
			
			System.out.println(">>> 데이터베이스 연결 성공 <<<");
			
			// #3. SQL수행, CRUD(Create, Read, Update, Delete)
			// DML : Insert, Update, Delete
			// DQL : Select
			
			// 데이터 등록
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			Member m = new Member();
			
			System.out.print("아 이 디 : ");
			m.setMem_id(reader.readLine());
			
			System.out.print("이    름: ");
			m.setMem_name(reader.readLine());
			
			System.out.print("패스워드 : ");
			m.setMem_pw(reader.readLine());
			
			System.out.print("전화번호 : ");
			m.setMem_phone(reader.readLine());
			
			System.out.print("이 메 일 : ");
			m.setMem_email(reader.readLine());
			
			// 쿼리 실행
//			int updCnt = memberDao.insertMeber(conn, m);
//			int updCnt = memberDao.updateMeber(conn, m);
			int updCnt = memberDao.deleteMeber(conn, m.getMem_id());
			
			System.out.println(updCnt + " 명의 회원이 등록 되었습니다.");
			
			
			
			// 데이터 조회
			ArrayList<Member> memberList = memberDao.selectMemberList(conn);
			
			System.out.println("====== 회원 목록 =====");
			
			for(Member member : memberList) {
				System.out.printf("%s\t %s\t %s\t %s\t %s\t %s\n", 
									member.getMem_id(),
									member.getMem_name(),
									member.getMem_pw(),
									member.getMem_phone(),
									member.getMem_email(),
									member.getReg_date()
									);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { // #4. 연결 종료
//			try {
				pool.releaseConnection(conn);
//				} catch (SQLException e) {}
			}
		}	
}

