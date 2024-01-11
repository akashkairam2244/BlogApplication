package com.springboot.blog.Service;

import com.springboot.blog.Payload.LoginDto;
import com.springboot.blog.Payload.RegisterDto;

public interface AuthService {
    String login(LoginDto loginDto);

    String register(RegisterDto registerDto);
}
