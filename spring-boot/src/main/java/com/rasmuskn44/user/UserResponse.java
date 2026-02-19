package com.rasmuskn44.user;

public record UserResponse(long id, String username) {
    public UserResponse(User user) {
        this(user.getId(), user.getUsername());
    }
}
