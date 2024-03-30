//package com.example.aulasecurity;
//
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//
//public class config {
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/").permitAll()
//                .antMatchers(HttpMethod.POST,"/login").permitAll()
//                .antMatchers("/managers").hasAnyRole("MANAGERS")
//                .antMatchers("/users").hasAnyRole("USERS","MANAGERS")
//                .anyRequest().authenticated().and().httpBasic();
//    }
//}
