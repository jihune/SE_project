package com.se.kmbss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.se.kmbss.model.StudyUserVO;

// 회원에 관한 동작을 정의하는 인터페이스입니다.

@Mapper
public interface StudyUserMapper {

    public Integer signUp(StudyUserVO study_user);

    public StudyUserVO signIn(StudyUserVO study_user);

    public List<StudyUserVO> checkId(StudyUserVO study_user);

    public List<StudyUserVO> checkNick(StudyUserVO study_user);

    public List<StudyUserVO> checkEmail(StudyUserVO study_user);

    public StudyUserVO findMyId(StudyUserVO study_user);

    public Integer chageMyPw(StudyUserVO study_user);

    public Integer changeMyInfo(StudyUserVO study_user);

}
