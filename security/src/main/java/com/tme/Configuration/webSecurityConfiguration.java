package com.tme.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class webSecurityConfiguration extends WebSecurityConfigurerAdapter {

    public void config(AuthenticationManagerBuilder auth) throws Exception{
        auth
                .inMemoryAuthentication()
                    .withUser("user").password("password").roles("user")
                        .and()
                    .withUser("admin").password("password").roles("admin");

    }


    public void config(HttpSecurity http) throws Exception{
            http.authorizeRequests()
                    .antMatchers("/").permitAll()
                    .antMatchers("/login","/index").permitAll()
                    .and()
                    .formLogin().loginPage("/login").failureUrl("error")
                    .and()
                    .logout().logoutSuccessUrl("/index")
                    .deleteCookies()
                    .logoutUrl("/index")
                    .clearAuthentication(true);


    }
}
