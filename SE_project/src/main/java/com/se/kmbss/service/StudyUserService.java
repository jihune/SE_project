package com.se.kmbss.service;

import org.springframework.stereotype.Service;

import com.se.kmbss.model.StudyUserVO;

@Service
public interface StudyUserService {

    /**
     * Integer signUp(UserDTO)
     * DB에 회원가입할 사용자의 정보를 Insert 합니다.
     * @param study_user DB에 추가할 계정입니다.
     */
    public Integer signUp(StudyUserVO study_user);

     /**
     * signIn(UserDTO)
     * 로그인
     * @param study_user 사용자가 입력한 id, password 정보입니다.
     * @return 로그인 된 사용자의 정보를 반환.
     */
    public StudyUserVO signIn(StudyUserVO study_user);

    /**
     * isOverlapId(UserDTO)
     * DB와 비교하여 ID 중복을 확인합니다.
     * @param study_user 사용자가 입력한 id 정보입니다.
     * @return 사용 가능한 ID면 True, 이미 가입되어 있는 동일 id가 존재하면 False 반환.
     */
    public boolean isOverlapId(StudyUserVO study_user);

    /**
     * isOverlapNick(UserDTO)
     * DB와 비교하여 닉네임 중복을 확인합니다.
     * @param study_user 사용자가 입력한 nickname 정보입니다.
     * @return 사용 가능한 닉네임이면 True, 이미 가입되어 있는 동일 nickname이 존재하면 False 반환.
     */
    public boolean isOverlapNick(StudyUserVO study_user);

    /**
     * isOverlapEmail(UserDTO)
     * 이메일 중복을 확인합니다.
     * @param study_user 사용자가 입력한 email 정보입니다.
     * @return 사용 가능한 Email이면 True, 이미 가입되어 있는 동일 email이 존재하면 False 반환.
     */
    public boolean isOverlapEmail(StudyUserVO study_user);

    /**
     * findMyId(UserDTO)
     * 사용자 ID 찾기
     * @param study_user 사용자가 입력한 찾을 id에 대한 정보입니다.
     * @return 부분적인 user 정보와 일치하는 DB 상의 가입된 사용자가 있다면 id를 반환.
     */
    public String findMyId(StudyUserVO study_user);

     /**
     * changeMyInfo(UserDTO)
     * 사용자 정보를 DB상에서 수정
     * @param study_user 사용자가 입력한 변경할 정보입니다.
     */
    public Integer changeMyInfo(StudyUserVO study_user);
}
