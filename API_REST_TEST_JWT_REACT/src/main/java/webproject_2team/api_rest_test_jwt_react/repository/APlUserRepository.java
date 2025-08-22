package webproject_2team.api_rest_test_jwt_react.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webproject_2team.api_rest_test_jwt_react.domain.APIUser;

//작업순서8
@Repository
public interface APlUserRepository extends JpaRepository<APIUser, String> {
}
