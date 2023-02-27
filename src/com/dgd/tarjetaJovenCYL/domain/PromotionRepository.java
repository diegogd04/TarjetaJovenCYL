package com.dgd.tarjetaJovenCYL.domain;

import com.dgd.tarjetaJovenCYL.domain.models.Promotion;

import java.util.List;

public interface PromotionRepository {
    public void add(Promotion promotion);

    public List<Promotion> getAll();
}
