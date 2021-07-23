package com.example.guestbooka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
//AuditingEntityListener 활성화 시키기 위한 애노테이션
@EnableJpaAuditing
public class GuestbookAApplication {

    public static void main(String[] args) {
        SpringApplication.run(GuestbookAApplication.class, args);
    }

}
