package com.dgd.tarjetaJovenCYL.domain.usecase;

import com.dgd.tarjetaJovenCYL.domain.ShoppingRepository;
import com.dgd.tarjetaJovenCYL.domain.models.Shopping;

import java.util.List;

public class GetShoppingUseCase {
    private ShoppingRepository shoppingRepository;

    public GetShoppingUseCase(ShoppingRepository shoppingRepository){
        this.shoppingRepository = shoppingRepository;
    }

    public List<Shopping> execute(){
        return this.shoppingRepository.getAll();
    }
}
