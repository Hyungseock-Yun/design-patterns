package gof.designpatterns._03_behavioral._10_template._03_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class TemplateInSpring {

  public static void main(String[] args) {
    // TODO 템플릿-콜백 패턴
    // JdbcTemplate
    JdbcTemplate jdbcTemplate = new JdbcTemplate();
    jdbcTemplate.execute("select * from member");

    // RestTemplate
    RestTemplate restTemplate = new RestTemplate();

    HttpHeaders headers = new HttpHeaders();
    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    headers.set("X-COM-PERSIST", "NO");
    headers.set("X-COM-LOCATION", "USA");

    HttpEntity<String> entity = new HttpEntity<>(headers);
    ResponseEntity<String> response = restTemplate
      .exchange("http//localhost:8080/users", HttpMethod.GET, entity, String.class);
  }

  @Configuration
  @EnableWebSecurity
  class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
      http.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());

      return http.build();
    }
  }
}
