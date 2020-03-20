package com.devsimple.leader_group.gen;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;

public class SequenceGenerator implements IdentifierGenerator {

    private SnowFlakeService snowFlakeService = new SnowFlakeService();

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) {
        return  snowFlakeService.nextLongID()+"";
    }

}
