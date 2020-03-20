package com.devsimple.leader_group.repositories;

import com.devsimple.leader_group.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DevRepository extends JpaRepository<Developer, String> {
}
