package com.devsimple.leader_group.config;

import com.devsimple.leader_group.entity.AuditorAwareImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.core.env.Environment;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaAuditing(auditorAwareRef = "auditorAware")
@EnableTransactionManagement
public class DatabaseConfiguration {

    private final Logger log = LoggerFactory.getLogger(DatabaseConfiguration.class);

    private final Environment env;

    public DatabaseConfiguration(Environment env) {
        this.env = env;
    }

     @Bean
    public AuditorAware<String> auditorAware() {
        return new AuditorAwareImpl();
    }

}

// Note important @EnableJpaAuditing(auditorAwareRef = "springSecurityAuditorAware") => springSecurityAuditorAware name of class create step 1
