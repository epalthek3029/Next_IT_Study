package kr.or.nextit.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import kr.or.nextit.member.model.Member;

public class MemberDao {

	private static MemberDao instance = new MemberDao();
	
	private MemberDao() {	}
	
	public static MemberDao getInstance() {
		
		if(instance == null) {
			instance = new MemberDao();
		}
		
		return instance;
	}
	// CRUD 작업

	// 회원목록 조회
	public ArrayList<Member> selectMemberList(Connection conn) throws SQLException {

		StringBuffer query = new StringBuffer();

		query.append(" SELECT           ");
		query.append("     mem_id,      "); // 회원아이디
		query.append("     mem_name,    "); // 회원
		query.append("     mem_pw,      ");
		query.append("     mem_phone,   ");
		query.append("     mem_email,   ");
		query.append("     reg_date     ");
		query.append(" FROM             ");
		query.append("     tb_member    ");

		PreparedStatement pstmt = conn.prepareStatement(query.toString());

		ResultSet rs = pstmt.executeQuery();

		ArrayList<Member> memberList = new ArrayList<Member>();

		while (rs.next()) {

			Member member = new Member();

			member.setMem_id(rs.getString("mem_id"));
			member.setMem_name(rs.getString("mem_name"));
			member.setMem_pw(rs.getString("mem_pw"));
			member.setMem_phone(rs.getString("mem_phone"));
			member.setMem_email(rs.getString("mem_email"));
			member.setReg_date(rs.getString("reg_date"));

			memberList.add(member);
		}
		return memberList;
	}

	// 회원정보 조회
	public Member selectMember(Connection conn, String mem_id) throws SQLException {

		StringBuffer query = new StringBuffer();

		query.append(" SELECT           ");
		query.append("     mem_id,      "); // 회원아이디
		query.append("     mem_name,    "); // 회원
		query.append("     mem_pw,      ");
		query.append("     mem_phone,   ");
		query.append("     mem_email,   ");
		query.append("     reg_date     ");
		query.append(" FROM             ");
		query.append("     tb_member    ");
		query.append(" WHERE mem_id = ?    ");

		PreparedStatement pstmt = conn.prepareStatement(query.toString());

		pstmt.setString(1, mem_id);

		ResultSet rs = pstmt.executeQuery();

		Member member = null;

		if (rs.next()) {
			member = new Member();
			member.setMem_id(rs.getString("mem_id"));
			member.setMem_name("     mem_name,    ");
			member.setMem_pw("     mem_pw,      ");
			member.setMem_phone("     mem_phone,   ");
			member.setMem_email("     mem_email,   ");
			member.setReg_date("     reg_date     ");
		}

		return null;
	}

	// 회원신규 등록
	public int insertMeber(Connection conn, Member member) throws SQLException {

		StringBuffer query = new StringBuffer();

		query.append("	INSERT INTO tb_member (  ");
		query.append("		    mem_id,          ");
		query.append("		    mem_name,        ");
		query.append("		    mem_pw,          ");
		query.append("		    mem_phone,       ");
		query.append("		    mem_email,       ");
		query.append("		    reg_date         ");
		query.append("		) VALUES (           ");
		query.append("		    ?,               ");
		query.append("		    ?,               ");
		query.append("		    ?,               ");
		query.append("		    ?,               ");
		query.append("		    ?,               ");
		query.append("		    SYSDATE          ");
		query.append("		)                    ");

		PreparedStatement pstmt = conn.prepareStatement(query.toString());

		int idx = 1;

		pstmt.setString(idx++, member.getMem_id());
		pstmt.setString(idx++, member.getMem_name());
		pstmt.setString(idx++, member.getMem_pw());
		pstmt.setString(idx++, member.getMem_phone());
		pstmt.setString(idx++, member.getMem_email());

		int updCnt = pstmt.executeUpdate();

		return updCnt;
	}

	// 회원정보 수정
	public int updateMeber(Connection conn, Member member) throws SQLException {

		StringBuffer query = new StringBuffer();

		query.append(" UPDATE tb_member    ");
		query.append(" SET                 ");
		query.append(" 	mem_name = ?,    ");
		query.append(" 	mem_pw = ?,      ");
		query.append(" 	mem_phone = ?,   ");
		query.append(" 	mem_email = ?    ");
		query.append(" WHERE mem_id = ?    ");
		
		PreparedStatement pstmt = conn.prepareStatement(query.toString());
		
		int idx = 1;
		
		pstmt.setString(idx++, member.getMem_name());
		pstmt.setString(idx++, member.getMem_pw());
		pstmt.setString(idx++, member.getMem_phone());
		pstmt.setString(idx++, member.getMem_email());
		pstmt.setString(idx++, member.getMem_id());
		
		int updCnt = pstmt.executeUpdate();

		
		return updCnt;
	}

	// 회원정보 삭제
	public int deleteMeber(Connection conn, String mem_id) throws SQLException {
		
		StringBuffer query = new StringBuffer();
		
		query.append(" DELETE FROM tb_member WHERE mem_id = ? ");
		
		PreparedStatement pstmt = conn.prepareStatement(query.toString());
		
		pstmt.setString(1, mem_id);
		
		int updCnt = pstmt.executeUpdate();
		
		return updCnt;
	}
}
