package com.example.firstboot.model.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.example.firstboot.model.dao.MemberDao;
import com.example.firstboot.model.dto.Member;

import lombok.RequiredArgsConstructor;
@Repository
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {

	private final MemberDao dao;
	private final SqlSession session;
	
	@Override
	public List<Member> selectMemberAll() {
		// TODO Auto-generated method stub
		return dao.selectMemberAll(session);
	}

	@Override
	public Member selectMemberById(String id) {
		// TODO Auto-generated method stub
		return dao.selectMemberById(session, id);
	}

	@Override
	public int insertMember(Member m) {
		// TODO Auto-generated method stub
		return dao.insertMember(session, m);
	}

	@Override
	public int updateMember(Member m) {
		// TODO Auto-generated method stub
		return dao.updateMember(session, m);
	}

	@Override
	public int deleteMember(String userId) {
		// TODO Auto-generated method stub
		return dao.deleteMember(session, userId);
	}

}
