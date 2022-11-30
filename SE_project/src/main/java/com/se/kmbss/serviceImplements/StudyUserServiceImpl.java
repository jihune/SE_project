package com.se.kmbss.serviceImplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.se.kmbss.mapper.StudyUserMapper;
import com.se.kmbss.model.StudyUserVO;
import com.se.kmbss.service.StudyUserService;

@Service
public class StudyUserServiceImpl implements StudyUserService {

    @Autowired
    StudyUserMapper su_mapper;

    @Override
    public Integer signUp(StudyUserVO study_user){
        return su_mapper.signUp(study_user);
    }

    @Override
    public boolean signInCheck(StudyUserVO study_user) {

        if(su_mapper.signInCheck(study_user).size() == 0){
            return false;
        }
        
        else {
            return true;
        }
    }

    @Override
    public StudyUserVO signIn(StudyUserVO study_user){
        return su_mapper.signIn(study_user);
    }

    @Override
    public boolean isOverlapId(StudyUserVO study_user) {

        if(su_mapper.checkId(study_user).size() == 0){
            return true;
        }
        
        else {
            return false;
        }
    }

    @Override
    public boolean isOverlapNick(StudyUserVO study_user) {

        if(su_mapper.checkNick(study_user).size() == 0){
            return true;
        }
        
        else {
            return false;
        }
    }

    @Override
    public boolean isOverlapPhoneNumber(StudyUserVO study_user) {

        if(su_mapper.checkPhoneNumber(study_user).size() == 0){
            return true;
        }
        
        else {
            return false;
        }
    }

    @Override
    public boolean isOverlapEmail(StudyUserVO study_user) {

        if(su_mapper.checkEmail(study_user).size() == 0){
            return true;
        }
        
        else {
            return false;
        }
    }

    @Override
    public String findMyId(StudyUserVO study_user) {
        String result = su_mapper.findMyId(study_user);
        return result;
    }

    @Override
    public String findMyPw(StudyUserVO study_user) {
        String result = su_mapper.findMyPw(study_user);
        return result;
    }

    @Override
    public Integer chageMypw(StudyUserVO study_user) {
        return su_mapper.chageMyPw(study_user);
    }

    @Override
    public Integer changeMyInfo(StudyUserVO study_user) {
        return su_mapper.changeMyInfo(study_user);
    }
}
