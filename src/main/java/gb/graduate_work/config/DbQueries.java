package gb.graduate_work.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
// класс, хранящий запросы к базе данных
@Component  // аннота
@ConfigurationProperties(prefix = "db") // аннотация для настроек с префиксом db
@Getter // аннотация
@Setter // аннотация для настроек се

        //
public class DbQueries {
    private String findAll; //
    private String save;
    private String delete;
    private String get;
    private String update;
}
