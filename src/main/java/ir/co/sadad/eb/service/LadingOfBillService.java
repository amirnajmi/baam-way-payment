package ir.co.sadad.eb.service;

import ir.co.sadad.eb.domain.Invoice;
import ir.co.sadad.eb.domain.LadingOfBill;
import ir.co.sadad.eb.mapper.LadingOfBillMapper;
import ir.co.sadad.eb.mapper.LadingOfBillUpdateMapper;
import ir.co.sadad.eb.repository.api.LadingOfBillRepository;
import ir.co.sadad.eb.service.api.ILadingOfBillService;
import ir.co.sadad.eb.service.dto.LadingOfBillDto;
import ir.co.sadad.eb.service.dto.LadingOfBillUpdateDto;
import ir.co.sadad.eb.service.impl.AbstractGenericService;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless
public class LadingOfBillService extends AbstractGenericService<LadingOfBill, Long> implements ILadingOfBillService {

    @Inject
    private LadingOfBillMapper ladingOfBillMapper;

    @Inject
    private LadingOfBillUpdateMapper ladingOfBillUpdateMapper;

    @Inject
    public LadingOfBillService(LadingOfBillRepository genericRepository){super(genericRepository);}

    public LadingOfBillService() {
    }

    //TODO: Transactional??
    public LadingOfBillDto createLadingOfBill(LadingOfBillDto ladingOfBillDto){
        LadingOfBill ladingOfBill = ladingOfBillMapper.ladingOfBillDtoToLadingOfBill(ladingOfBillDto);
        return ladingOfBillMapper.ladingOfBillToLadingOfBillDto(save(ladingOfBill));
    }

    @Override
    //TODO: Transactional??
    public LadingOfBillDto updateLadingOfBill(LadingOfBillUpdateDto ladingOfBillUpdateDto) {
        LadingOfBill ladingOfBill = ladingOfBillUpdateMapper.LadingOfBillUpdateDtoToLadingOfBill(ladingOfBillUpdateDto);
        return ladingOfBillMapper.ladingOfBillToLadingOfBillDto(save(ladingOfBill));
    }


}
