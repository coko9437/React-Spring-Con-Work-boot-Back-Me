package webproject_2team.api_rest_test_jwt_react.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webproject_2team.api_rest_test_jwt_react.domain.Todo;
import webproject_2team.api_rest_test_jwt_react.repository.search.TodoSearch;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long>, TodoSearch {
}
