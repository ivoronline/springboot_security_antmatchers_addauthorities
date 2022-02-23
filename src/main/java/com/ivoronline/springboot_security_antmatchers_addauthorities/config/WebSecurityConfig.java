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
      .antMatchers("/EndPoint1").hasRole        ("USER")                     //Add Role
      .antMatchers("/EndPoint2").hasAnyRole     ("USER", "GUEST")            //Add Roles
      .antMatchers("/EndPoint3").hasAuthority   ("ROLE_USER")                //Add Authority
      .antMatchers("/EndPoint4").hasAnyAuthority("ROLE_USER", "ROLE_GUEST")  //Add Authorities
      .antMatchers("/EndPoint5").hasRole        ("ADMIN");                   //Add Role

    //REDIRECT TO LOGIN FORM
    httpSecurity.formLogin();

  }

}
