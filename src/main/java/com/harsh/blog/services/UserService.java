package com.harsh.blog.services;

import com.harsh.blog.domain.entities.User;
import lombok.Data;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
