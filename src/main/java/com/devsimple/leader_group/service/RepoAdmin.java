package com.devsimple.leader_group.service;

import com.devsimple.leader_group.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoAdmin extends JpaRepository<Admin, Long> {
}
