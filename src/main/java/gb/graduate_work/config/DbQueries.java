package gb.graduate_work.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
// класс, хранящий запросы к базе данных
@Component
@ConfigurationProperties(prefix = "db")
@Getter
@Setter


public class DbQueries {
    private String findAll;
    private String save;
    private String delete;
    private String get;
    private String update;
}
