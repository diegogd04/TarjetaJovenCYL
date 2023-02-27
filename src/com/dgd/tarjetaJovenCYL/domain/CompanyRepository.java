package com.dgd.tarjetaJovenCYL.domain;

import com.dgd.tarjetaJovenCYL.domain.models.Company;

import java.util.List;

public interface CompanyRepository {
    public void add(Company company);

    public List<Company> getAll();
}
