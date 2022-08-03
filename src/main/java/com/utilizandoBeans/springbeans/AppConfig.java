package com.utilizandoBeans.springbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Livro getLivro() {
        return new Livro();
    }
    //<bean id="livro" class="com.utilizandoBeans.Livro"/>
}
