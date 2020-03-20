package com.devsimple.leader_group.entity;

import com.devsimple.leader_group.config.Constants;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.HashSet;
import java.util.Set;

//Table - User
@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "leadergroup_user")
public class User extends AbstractAuditingEntity implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    //Relation
    @JsonIgnore
    @ManyToMany
    @JoinTable(
            name = "join_user_authority",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_name", referencedColumnName = "name")})
    private Set<Authority> authorities = new HashSet<>();


    //Properties
    @Id
    @GenericGenerator(name = "seq_id", strategy = "com.devsimple.leader_group.gen.SequenceGenerator")
    @GeneratedValue(generator = "seq_id")
    private String id;

    @NotNull
    @Pattern(regexp = Constants.LOGIN_REGEX)
    //@Size(min = 1, max = 50)
    @Column(length = 50, unique = true, nullable = false)
    private String login;

    @JsonIgnore
    @NotNull
    //@Size(min = 60, max = 60)
    @Column(name = "password_hash", length = 60, nullable = false)
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "status")
    private Integer status;

    @Column(name = "lang")
    private String lang;

    @Column(name = "fullname")
    private String fullname;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "activation_key")
    private String activationKey;

    @Column(name = "reset_key")
    private String resetKey;

    @Column(name = "reset_date")
    private String resetDate;


}
