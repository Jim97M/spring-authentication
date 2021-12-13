package com.example.demo.registration;

import com.example.demo.appuser.AppUser;
import com.example.demo.appuser.AppUserRole;
import com.example.demo.appuser.AppUserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {
    private AppUserService appUserService;
    private EmailValidator emailValidator;
    public String register(RegistrationRequest request){
        boolean isEmailValid = emailValidator.test(request.getEmail());
        if(!isEmailValid){
            throw new IllegalStateException("Invalid Email");
        }
        return  appUserService.signUpUser(
                new AppUser(
                        request.getEmail(),
                        request.getFirstName(),
                        request.getLastName(),
                        request.getPassword(),
                        AppUserRole.USER

                )
        );
    }
}
