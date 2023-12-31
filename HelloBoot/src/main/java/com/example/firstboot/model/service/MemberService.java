package com.example.firstboot.model.service;

import java.util.List;

import com.example.firstboot.model.dto.Member;

public interface MemberService {
	List<Member> selectMemberAll();

	Member selectMemberById(String id);
	
	int insertMember(Member m);
	int updateMember(Member m);
	int deleteMember(String userId);
}
