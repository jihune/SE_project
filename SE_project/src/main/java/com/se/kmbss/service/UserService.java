package com.se.kmbss.service;

import org.springframework.stereotype.Service;

import com.se.kmbss.model.UserDTO;

@Service
public interface UserService {

    /**
     * Integer join(UserDTO)
     * DB에 user정보를 Insert 합니다.
     * @param user DB에 추가할 계정입니다.
     * @return 생성된 seq 값을 반환.
     */
    public Integer join(UserDTO user);

     /**
     * signIn(UserDTO)
     * 로그인
     * @param user 사용자가 입력한 id, password 정보입니다.
     * @return 로그인 된 사용자의 정보를 반환.
     */
    public UserDTO signIn(UserDTO user);

    /**
     * isUniqueID(UserDTO)
     * DB와 비교하여 ID 중복을 확인합니다.
     * @param user 사용자가 입력한 id 정보입니다.
     * @return 사용 가능한 ID면 true, 이미 가입되어 있는 ID가 존재하면 false을 반환.
     */
    public boolean isUniqueId(UserDTO user);

    /**
     * isOverlapNick(UserDTO)
     * DB와 비교하여 닉네임 중복을 확인합니다.
     * @param user 사용자가 입력한 nickname 정보입니다.
     * @return 사용 가능한 닉네임이면 true, 이미 가입되어 있는 닉네임이 존재하면 false을 반환.
     */
    public boolean isOverlapNick(UserDTO user);

    /**
     * isOverlapEmail(UserDTO)
     * 이메일 중복을 확인합니다.
     * @param user 사용자가 입력한 email 정보입니다.
     * @return 사용 가능한 Email이면 true, 이미 가입되어 있는 Email이 존재하면 false을 반환.
     */
    public boolean isOverlapEmail(UserDTO user);

    /**
     * findMyId(UserDTO)
     * 사용자 ID 찾기
     * @param user 사용자가 입력한 부분적인 user 정보입니다.
     * @return 부분적인 user 정보와 일치하는 DB 상의 가입된 사용자가 있다면 id를 반환.
     */
    public String findMyId(UserDTO user);

     /**
     * changeMyInfo(UserDTO)
     * 사용자 정보를 DB상에서 수정
     * @param user 사용자가 입력한 변경할 부분적인 user 정보입니다.
     * @return 정보가 변경된 사용자의 seq 값을 반환.
     */
    public Integer changeMyInfo(UserDTO user);
}
