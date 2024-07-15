package gb.graduate_work.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// класс, реализующий интерфейс WebSecurityConfigurerAdapter
public abstract class WebSecurityConfigurerAdapter {
    protected abstract void configure(HttpSecurity http) throws Exception;
}
