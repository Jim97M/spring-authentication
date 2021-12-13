package com.example.demo.appuser;

import org.springframework.security.core.userdetails.UserDetails;

public interface AppUsersDet extends UserDetails {
    String getfirstName();

    String getlastName();
}
