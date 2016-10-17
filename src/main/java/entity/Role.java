package entity;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Aleksey on 20.09.2016.
 */
public enum Role implements GrantedAuthority {
    ROLE_USER,
    ROLE_ADMIN;

    @Override
    public String getAuthority() {
        return name();
    }
}