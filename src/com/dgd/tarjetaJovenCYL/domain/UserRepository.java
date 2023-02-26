package com.dgd.tarjetaJovenCYL.domain;

import com.dgd.tarjetaJovenCYL.domain.models.User;

import java.util.List;

public interface UserRepository {
    public void add(User user);

    public List<User> getAll();
}
