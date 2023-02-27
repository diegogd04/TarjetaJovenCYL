package com.dgd.tarjetaJovenCYL.domain.usecase;

import com.dgd.tarjetaJovenCYL.domain.UserRepository;
import com.dgd.tarjetaJovenCYL.domain.models.User;

import java.util.List;

public class GetUsersUseCase {
    private UserRepository userRepository;

    public GetUsersUseCase(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<User> execute(){
        return this.userRepository.getAll();
    }
}
