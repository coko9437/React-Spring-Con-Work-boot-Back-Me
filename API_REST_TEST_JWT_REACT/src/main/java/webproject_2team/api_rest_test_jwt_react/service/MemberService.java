package webproject_2team.api_rest_test_jwt_react.service;


import org.springframework.transaction.annotation.Transactional;
import webproject_2team.api_rest_test_jwt_react.domain.APIUser;

@Transactional
public interface MemberService {
    void joinMember(APIUser apiUser);
    boolean checkMember(String mid);

}
