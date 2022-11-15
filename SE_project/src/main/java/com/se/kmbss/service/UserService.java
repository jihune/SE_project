package com.se.kmbss.service;

import org.springframework.stereotype.Service;

import com.se.kmbss.model.UserDTO;

/**
 * 회원가입 전 유효성 검사를 직접 거치고, 회원가입 시 유효성검사를 한번 더 거친다.
 */
@Service
public interface UserService {

    public Integer join(UserDTO user);

    /**
     * 기존에 가입한 계정이 있는지 확인합니다.
     * @param user 가입할 계정입니다.
     * @return 가입 가능한 계정이라면 true, 이미있는 계정이 존재하는 등 불가하면 false을 반환.
     */
    public boolean isUniqueId(UserDTO user);

    /**
     * @serial
     * 닉네임 중복을 확인합니다.
     * @param user 가입할 계정입니다.
     * @return 유일한 닉네임이라면 true를 반환합니다.
     */
    public boolean isOverlapNick(UserDTO user);

    /**
     * @serial
     * 로그인
     * @param user id, pw를 입력합니다.
     * @return 로그인 된 사용자의 정보를 반환.
     */
    public UserDTO login(UserDTO user);

    public boolean isOverlapEmail(UserDTO user);

    public String findMyId(UserDTO user);

    public Integer changeMyInfo(UserDTO user);
}
