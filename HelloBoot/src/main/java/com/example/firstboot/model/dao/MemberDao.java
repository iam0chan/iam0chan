package com.example.firstboot.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.example.firstboot.model.dto.Member;

public interface MemberDao {
	List<Member> selectMemberAll(SqlSession session);

	Member selectMemberById(SqlSession session, String id);
	
	int insertMember(SqlSession session, Member m);
	int updateMember(SqlSession session, Member m);
	int deleteMember(SqlSession session, String userId);
}
