package todolist.todolist.repository;

import todolist.todolist.domain.List;

import java.util.Optional;

public interface ListRepository {
    List save(List list);
    Optional<List> findByNumber(Long number);
    Optional<List> findByList(String list);
    java.util.List<List> findAll(); 
}
