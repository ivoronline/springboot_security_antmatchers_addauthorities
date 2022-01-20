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

    //ADD AUTHORITIES TO ENDPOINTS
    httpSecurity.authorizeRequests()
      .antMatchers("/EndPoint1").hasRole        ("ADMIN")                     //Add Role
      .antMatchers("/EndPoint2").hasAnyRole     ("ADMIN", "USER")             //Add Roles
      .antMatchers("/EndPoint3").hasAuthority   ("ROLE_ADMIN")                //Add Authority
      .antMatchers("/EndPoint4").hasAnyAuthority("ROLE_ADMIN", "ROLE_USER");  //Add Authorities

    //REDIRECT TO LOGIN FORM
    httpSecurity.formLogin();

  }

}
