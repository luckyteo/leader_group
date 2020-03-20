package com.devsimple.leader_group.config;

public final class AuthoritiesConstants {
    public static final String SUPER_ADMIN = "ROLE_SUPER_USER";
    public static final String ADMIN = "ROLE_ADMIN";

    public static final String USER = "ROLE_USER";
    public static final String ROLE_LEADER = "ROLE_LEADER";
    public static final String ROLE_TEAM_MEMBER = "ROLE_TEAM_MEMBER";

    public static final String ANONYMOUS = "ROLE_ANONYMOUS";


    public static final String ADMIN_AUTH = "\""+SUPER_ADMIN+"\",\""+ADMIN+"\"";

    private AuthoritiesConstants() {
    }
}
