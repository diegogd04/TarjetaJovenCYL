package com.dgd.tarjetaJovenCYL.domain.usecase;

import com.dgd.tarjetaJovenCYL.domain.ShoppingRepository;
import com.dgd.tarjetaJovenCYL.domain.models.Shopping;

public class AddShoppingUseCase {
    private ShoppingRepository shoppingRepository;

    public AddShoppingUseCase(ShoppingRepository shoppingRepository){
        this.shoppingRepository = shoppingRepository;
    }

    public void execute(Shopping shopping){
        this.shoppingRepository.add(shopping);
    }
}
