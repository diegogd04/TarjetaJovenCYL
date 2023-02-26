package com.dgd.tarjetaJovenCYL.domain.usecase;

import com.dgd.tarjetaJovenCYL.domain.PromotionRepository;
import com.dgd.tarjetaJovenCYL.domain.models.Promotion;

public class AddPromotionUseCase {
    private PromotionRepository promotionRepository;

    public AddPromotionUseCase(PromotionRepository promotionRepository){
        this.promotionRepository = promotionRepository;
    }

    public void execute(Promotion promotion){
        this.promotionRepository.add(promotion);
    }
}
