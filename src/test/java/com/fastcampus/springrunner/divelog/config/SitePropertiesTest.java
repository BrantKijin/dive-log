package com.fastcampus.springrunner.divelog.config;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("local")
@SpringBootTest
class SitePropertiesTest {

  @Test
  void test(@Autowired SiteProperties siteProperties) {
    assertThat(siteProperties.getAuthorName()).isEqualTo("Honeymon-local");
    assertThat(siteProperties.getAuthorEmail()).isEqualTo("ihoneymon.local@gmail.com");
  }

}
