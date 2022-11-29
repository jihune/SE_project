package com.se.kmbss.service;

import org.springframework.stereotype.Service;

import com.se.kmbss.model.StudyUserVO;

@Service
public interface StudyUserService {

    /**
     * Integer signUp(StudyUserVO)
     * DB에 회원가입할 사용자의 정보를 Insert 합니다.
     * @param study_user DB에 추가할 계정입니다.
     */
    public Integer signUp(StudyUserVO study_user);

     /**
     * signInCheck(StudyUserVO)
     * 로그인 유효성 검사
     * @param study_user 사용자가 입력한 id, password 정보입니다.
     * @return 등록된 계정정보면 True, 등록되지 않은 정보면 False 반환.
     */
    public boolean signInCheck(StudyUserVO study_user);

     /**
     * signIn(StudyUserVO)
     * 로그인
     * @param study_user 사용자가 입력한 id, password 정보입니다.
     * @return 로그인 된 사용자의 정보를 반환.
     */
    public StudyUserVO signIn(StudyUserVO study_user);

    /**
     * isOverlapId(StudyUserVO)
     * DB와 비교하여 ID 중복을 확인합니다.
     * @param study_user 사용자가 입력한 id 정보입니다.
     * @return 사용 가능한 ID면 True, 이미 가입되어 있는 동일 id가 존재하면 False 반환.
     */
    public boolean isOverlapId(StudyUserVO study_user);

    /**
     * isOverlapNick(StudyUserVO)
     * DB와 비교하여 닉네임 중복을 확인합니다.
     * @param study_user 사용자가 입력한 nickname 정보입니다.
     * @return 사용 가능한 닉네임이면 True, 이미 가입되어 있는 동일 nickname이 존재하면 False 반환.
     */
    public boolean isOverlapNick(StudyUserVO study_user);

    /**
     * isOverlapPhoneNumber(StudyUserVO)
     * 휴대폰 번호 중복을 확인합니다.
     * @param study_user 사용자가 입력한 phone_number 정보입니다.
     * @return 사용 가능한 phone_number면 True, 이미 가입되어 있는 동일 phone_number가 존재하면 False 반환.
     */
    public boolean isOverlapPhoneNumber(StudyUserVO study_user);

    /**
     * isOverlapEmail(StudyUserVO)
     * 이메일 중복을 확인합니다.
     * @param study_user 사용자가 입력한 email 정보입니다.
     * @return 사용 가능한 Email이면 True, 이미 가입되어 있는 동일 email이 존재하면 False 반환.
     */
    public boolean isOverlapEmail(StudyUserVO study_user);

    /**
     * findMyId(StudyUserVO)
     * 사용자 ID 찾기
     * @param study_user 사용자가 찾을 계정에 대한 입력 정보입니다.
     * @return 부분적인 study_user 정보와 일치하는 DB 상의 사용자가 있다면 id를 반환.
     */
    public String findMyId(StudyUserVO study_user);

    /**
     * findMyPw(StudyUserVO)
     * 사용자 PW 찾기
     * @param study_user 사용자가 찾을 계정에 대한 입력 정보입니다.
     * @return 부분적인 study_user 정보와 일치하는 DB 상의 사용자가 있다면 Ture, 없다면 False 반환.
     */
    public boolean findMyPw(StudyUserVO study_user);

    /**
     * chageMypw(StudyUserVO)
     * 사용자 PW 변경
     * @param study_user 사용자가 변경할 비밀번호에 대한 입력 정보입니다.
     * @return 부분적인 study_user 정보와 일치하는 DB 상의 사용자가 있다면 su_pw 변경.
     */
    public Integer chageMypw(StudyUserVO study_user);

     /**
     * changeMyInfo(StudyUserVO)
     * 사용자 정보를 DB상에서 수정
     * @param study_user 사용자가 입력한 변경할 정보입니다.
     */
    public Integer changeMyInfo(StudyUserVO study_user);
}
