package todolist.todolist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import todolist.todolist.repository.JdbcTemplateListRepository;
import todolist.todolist.repository.ListRepository;
import todolist.todolist.service.ListService;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {
    private DataSource dataSource;

    @Autowired
    public SpringConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Bean
    public ListService listService(){
        return new ListService(listRepository());
    }

    @Bean
    public ListRepository listRepository(){
        return new JdbcTemplateListRepository(dataSource);
    }
}
