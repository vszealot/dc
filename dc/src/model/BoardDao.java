package model;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import entity.BoardInfo;

@Repository
public class BoardDao {
	@Autowired
	private SqlSessionFactory factory;

	public boolean createBoard(BoardInfo boardInfo) {
		int n = factory.openSession().insert("boardspace.createBoard", boardInfo);

		if (n > 0) {
			//		테이블 생성	=======================================================
			String sql = "create table boardContent_" + boardInfo.getUserId()
					+ "(postNo number primary key,boardName varchar2(30),postWriter varchar2(30),postPassword varchar2(30),postTitle varchar2(30),postContent varchar2(1000),postTime varchar2(30),postClick number,CONSTRAINT fkboardName FOREIGN KEY(boardName) references boardInfo ON DELETE CASCADE)";
			
			
			Map<String, String> map = new HashMap<>();
			map.put("sql", sql);

			factory.openSession().update("boardspace.createBoardTable", map);

			//		시퀀스 생성	=======================================================
			String sql2 = "create sequence " + boardInfo.getUserId() + "_postNo";
			map.put("sql2", sql2);
			
			factory.openSession().update("boardspace.createSequence", map);

			return true;

		} else {
			return false;
		}

	}

}
