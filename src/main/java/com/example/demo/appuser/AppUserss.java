package com.example.demo.appuser;

import org.springframework.security.core.userdetails.UserDetails;

public interface AppUserss extends UserDetails {
    String getEmail();
}
