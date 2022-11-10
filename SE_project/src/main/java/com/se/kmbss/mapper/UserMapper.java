package com.se.kmbss.mapper;

// import java.util.List;

import org.apache.ibatis.annotations.Mapper;

// import com.shoping.dbckd.model.CustomerDTO; // UserDTO 만들면 수정 

/**
 * 회원에 관한 동작을 정의하는 인터페이스입니다.
 */

@Mapper
public interface UserMapper {

    /* 아래는 UserMapper의 Example로 가져온 쇼핑몰의 CustomerMapper
    UserDTO 만들면 아래처럼 구현해두기

    public Integer join(CustomerDTO customer);
    public List<CustomerDTO> checkID(CustomerDTO customer);
    public List<CustomerDTO> checkNick(CustomerDTO customer);
    public CustomerDTO login(CustomerDTO customer);
    public CustomerDTO dummy();
    public List<CustomerDTO> checkEmail(CustomerDTO customer);
    public CustomerDTO findMyID(CustomerDTO customer);
    public Integer chageMyPassword(CustomerDTO customer);
    public Integer chageMyInfo(CustomerDTO customer);
     */
}
