package todolist.todolist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import todolist.todolist.domain.List;
import todolist.todolist.service.ListService;

public class ListController {
    private final ListService listService;

    @Autowired
    public ListController(ListService listService) {
        this.listService = listService;
    }

    @PostMapping("lists/new")
    public String create(ListForm listForm){
        List list = new List();
        list.setList(listForm.getList());

        System.out.println("저장되었습니다(" + list.getList() + ")");

        listService.join(list);
        return "redirect/";
    }
}
