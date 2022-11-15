package com.se.kmbss.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.se.kmbss.model.UserDTO;

// 회원에 관한 동작을 정의하는 인터페이스입니다.

@Mapper
public interface UserMapper {

    public Integer join(UserDTO user);

    public List<UserDTO> checkId(UserDTO user);

    public List<UserDTO> checkNick(UserDTO user);

    public UserDTO login(UserDTO user);

    public UserDTO dummy();

    public List<UserDTO> checkEmail(UserDTO user);

    public UserDTO findMyId(UserDTO user);

    public Integer changeMyPassword(UserDTO user);

    public Integer changeMyInfo(UserDTO user);

}
