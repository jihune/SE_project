// 손지훈 작업중

// package com.se.kmbss.serviceImplements;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

// import com.se.kmbss.mapper.UserMapper;
// import com.se.kmbss.model.UserDTO;
// import com.se.kmbss.service.UserService;

// @Service
// public class UserServiceImpl implements UserService {

//     @Autowired
//     UserMapper user_mapper;

//     @Override
//     public Integer join(UserDTO user){
//         return user_mapper.join(user);
//     }

//     @Override
//     public boolean isUniqueID(UserDTO user) {
//         if(user_mapper.checkID(user).size() == 0){
//             return true;
//         } else {
//             return false;
//         }
//     }

//     @Override
//     public boolean is_overlap_nick(UserDTO user) {
//         if(user_mapper.is_overlap_nick(user).size() == 0){
//             return true;
//         } else {
//             return false;
//         }
//     }

//     @Override
//     public UserDTO login(UserDTO user){
//         return user_mapper.login(user);
//     }

//     @Override
//     public boolean is_overlap_email(UserDTO user) {
//         if(user_mapper.check_email(user).size() == 0){
//             return true;
//         } else {
//             return false;
//         }
//     }

//     @Override
//     public String find_my_id(UserDTO user) {
//         UserDTO result = user_mapper.find_my_id(user);
//         System.out.println(result);
//         return result.getId();
//     }

//     @Override
//     public Integer change_my_info(UserDTO user) {
//         return user_mapper.change_my_info(user);
//     }
// }
