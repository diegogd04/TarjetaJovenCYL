package com.dgd.tarjetaJovenCYL.domain.usecase;

import com.dgd.tarjetaJovenCYL.domain.CompanyRepository;
import com.dgd.tarjetaJovenCYL.domain.models.Company;

import java.util.List;

public class GetCompaniesUseCase {
    private CompanyRepository companyRepository;

    public GetCompaniesUseCase(CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }

    public List<Company> execute(){
        return this.companyRepository.getAll();
    }
}
