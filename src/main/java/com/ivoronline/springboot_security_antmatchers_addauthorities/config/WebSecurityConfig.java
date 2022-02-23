package com.ivoronline.springboot_security_antmatchers_addauthorities.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  //=================================================================
  // CONFIGURE
  //=================================================================
  @Override
  protected void configure(HttpSecurity httpSecurity) throws Exception {

    //ADD  ROLES & AUTHORITIES TO ENDPOINTS
    httpSecurity.authorizeRequests()
      .antMatchers("/EndPoint2").hasRole        ("USER")                     //Add Role
      .antMatchers("/EndPoint3").hasAnyRole     ("USER", "GUEST")            //Add Roles
      .antMatchers("/EndPoint4").hasAuthority   ("ROLE_USER")                //Add Authority
      .antMatchers("/EndPoint5").hasAnyAuthority("ROLE_USER", "ROLE_GUEST")  //Add Authorities
      .antMatchers("/EndPoint6").hasRole        ("ADMIN");                   //Add Role

    //REDIRECT TO LOGIN FORM
    httpSecurity.formLogin();

  }

}
