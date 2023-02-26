package com.dgd.tarjetaJovenCYL.domain.usecase;

import com.dgd.tarjetaJovenCYL.domain.UserRepository;
import com.dgd.tarjetaJovenCYL.domain.models.User;

public class AddUserUseCase {
    private UserRepository userRepository;

    public AddUserUseCase(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public void execute(User user){
        this.userRepository.add(user);
    }
}
