package com.devsimple.leader_group.security.auditlog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.actuate.audit.AuditEvent;
import org.springframework.boot.actuate.audit.AuditEventRepository;
import org.springframework.stereotype.Repository;

import java.time.Instant;
import java.util.List;

@Repository
public class EvenAudit implements AuditEventRepository {
    private static final Logger LOG = LoggerFactory.getLogger(EvenAudit.class);
    @Override
    public void add(AuditEvent event) {
        LOG.info("=========================+> On audit application event: timestamp: {}, principal: {}, type: {}, data: {}",event.getTimestamp(), event.getPrincipal(),event.getType(),event.getData());
    }

    @Override
    public List<AuditEvent> find(String principal, Instant after, String type) {
        return null;
    }
}
