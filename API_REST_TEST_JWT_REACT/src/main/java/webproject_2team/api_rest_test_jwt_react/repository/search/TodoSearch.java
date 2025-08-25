package webproject_2team.api_rest_test_jwt_react.repository.search;


import org.springframework.data.domain.Page;
import webproject_2team.api_rest_test_jwt_react.dto.PageRequestDTO;
import webproject_2team.api_rest_test_jwt_react.dto.TodoDTO;

public interface TodoSearch {
    Page<TodoDTO> list(
            PageRequestDTO pageRequestDTO);
}