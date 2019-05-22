package kr.or.nextit.jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;

public class ConnectionPool {

	private static Vector<Connection> pool = new Vector<Connection>();

	private static ConnectionPool instance = new ConnectionPool();
	
	public static ConnectionPool getInstance() {
		
		if(instance == null) {
			instance = new ConnectionPool();
		}
		return instance;
	}
	
	private ConnectionPool() {
		try {
			initPool();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 풀 생성
	public synchronized void initPool() throws SQLException{
		
		destroyPool();
		
		ConnectionFactory connFactory = ConnectionFactory.getInstance();
		
		for(int i = 0; i < connFactory.getmaxTotal(); i++) {
			pool.add(connFactory.getConnection());
		}
	}

	public synchronized void destroyPool() throws SQLException {
		
		for(Connection conn : pool) {
			if(conn != null) {
				conn.close();
			}
		}
		pool.clear();
	}

	// 커넥션 대여
	public synchronized Connection getConnection() throws InterruptedException {
		
		if(pool.size() == 0) {
			wait();
		}
		
		Connection conn = pool.remove(pool.size()-1);
		return conn;
	}
	
	// 커넥션 반납
	public synchronized void releaseConnection(Connection conn) {
		
		pool.add(conn);
		notify();
	}

}
