package com.dgd.tarjetaJovenCYL.domain.usecase;

import com.dgd.tarjetaJovenCYL.domain.PromotionRepository;
import com.dgd.tarjetaJovenCYL.domain.models.Promotion;

import java.util.List;

public class GetPromotionsUseCase {
    private PromotionRepository promotionRepository;

    public GetPromotionsUseCase(PromotionRepository promotionRepository){
        this.promotionRepository = promotionRepository;
    }

    public List<Promotion> execute(){
        return this.promotionRepository.getAll();
    }
}
