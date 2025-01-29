package com.deneme1.backend_deneme.services;

import com.deneme1.backend_deneme.dto.JwtAuthenticationResponse;
import com.deneme1.backend_deneme.dto.RefreshTokenRequest;
import com.deneme1.backend_deneme.dto.SignInRequest;
import com.deneme1.backend_deneme.dto.SignUpRequest;
import com.deneme1.backend_deneme.entities.User;

public interface AuthenticationService {
    User signup(SignUpRequest signUpRequest);
    JwtAuthenticationResponse signin(SignInRequest signInRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}
