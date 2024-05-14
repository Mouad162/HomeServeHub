package com.example.homeservehub.security;

import javassist.bytecode.StackMap;
import org.hibernate.boot.model.source.spi.HibernateTypeSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.WeakCacheKey;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import static java.sql.DriverManager.getConnection;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeRequests(authorizeRequests ->
                        authorizeRequests.requestMatchers("/userList").hasRole("ADMIN")
                                .anyRequest().permitAll()
                ).csrf(csrf -> csrf.disable()).formLogin((form) -> form
                        .loginPage("/login")
                        .defaultSuccessUrl("/userList",true)
                        .permitAll()
                ).logout((logout) -> logout.permitAll())
                .exceptionHandling(exceptionHandling-> exceptionHandling.accessDeniedPage("/accessDenied"))
        ;

        return http.build();
    }
    @Bean
    public InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        return new InMemoryUserDetailsManager(
                User.withUsername("mouad").password(bCryptPasswordEncoder().encode("123")).roles("ADMIN").build()
        );
    }
}
