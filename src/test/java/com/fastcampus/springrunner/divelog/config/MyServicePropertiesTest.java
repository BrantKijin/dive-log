package com.fastcampus.springrunner.divelog.config;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@ActiveProfiles("my-service")
@SpringBootTest
class MyServicePropertiesTest {

  @Test
  void test(@Autowired MyServiceProperties myServiceProperties){
    assertThat(myServiceProperties.isEnabled()).isTrue();

  }

}