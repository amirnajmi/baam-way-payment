package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.domain.FinancialAmounts;
import ir.co.sadad.eb.repository.api.FinancialAmountsRepository;
import ir.co.sadad.eb.service.api.IFinancialAmountsService;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class FinancialAmountsService extends AbstractGenericService<FinancialAmounts, Long> implements IFinancialAmountsService {

    private FinancialAmountsRepository financialAmountsRepository;

    @Inject
    public FinancialAmountsService(FinancialAmountsRepository genericRepository){
        super(genericRepository);
        this.financialAmountsRepository = genericRepository;
    }

    public FinancialAmountsService(){

    }
}
