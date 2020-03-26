package com.devsimple.leader_group.security;

import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class CustomUserDetail extends org.springframework.security.core.userdetails.User{
    private String id;

    public CustomUserDetail(String username, String password, Collection<? extends GrantedAuthority> authorities, String id) {
        super(username, password, authorities);
        this.id = id;
    }

    public String getId() {
        return id;
    }
}