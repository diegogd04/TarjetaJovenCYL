package com.dgd.tarjetaJovenCYL.domain.usecase;

import com.dgd.tarjetaJovenCYL.domain.CompanyRepository;
import com.dgd.tarjetaJovenCYL.domain.models.Company;

public class AddCompanyUseCase {
    private CompanyRepository companyRepository;

    public AddCompanyUseCase(CompanyRepository companyRepository){
        this.companyRepository = companyRepository;
    }

    public void execute(Company company){
        this.companyRepository.add(company);
    }
}
