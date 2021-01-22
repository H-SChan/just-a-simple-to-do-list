package todolist.todolist.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import todolist.todolist.domain.List;
import todolist.todolist.repository.ListRepository;

@Service
public class ListService {
    private final ListRepository listRepository;

    @Autowired
    public ListService(ListRepository listRepository) {
        this.listRepository = listRepository;
    }

    public Long join(List list){
        listRepository.save(list);
        return list.getNumber();
    }
}
