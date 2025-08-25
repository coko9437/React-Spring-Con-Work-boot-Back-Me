package webproject_2team.api_rest_test_jwt_react.service;


import org.springframework.transaction.annotation.Transactional;
import webproject_2team.api_rest_test_jwt_react.dto.PageRequestDTO;
import webproject_2team.api_rest_test_jwt_react.dto.PageResponseDTO;
import webproject_2team.api_rest_test_jwt_react.dto.TodoDTO;


@Transactional
public interface TodoService {
    Long register(TodoDTO todoDTO);
    TodoDTO read(Long tno);
    PageResponseDTO<TodoDTO> list(PageRequestDTO pageRequestDTO);
    void remove(Long tno);
    void modify(TodoDTO todoDTO);
}