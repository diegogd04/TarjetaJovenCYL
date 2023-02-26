package com.dgd.tarjetaJovenCYL.domain;

import com.dgd.tarjetaJovenCYL.domain.models.Shopping;

import java.util.List;

public interface ShoppingRepository {
    public void add(Shopping shopping);

    public List<Shopping> getAll();
}
