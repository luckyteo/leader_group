package com.devsimple.leader_group.entity;

import com.devsimple.leader_group.config.Constants;
import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(Constants.SYSTEM_ACCOUNT);
    }
}
