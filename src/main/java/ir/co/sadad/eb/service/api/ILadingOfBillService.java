package ir.co.sadad.eb.service.api;

import ir.co.sadad.eb.domain.LadingOfBill;
import ir.co.sadad.eb.exception.BusinessException;
import ir.co.sadad.eb.service.dto.LadingBillStatusHistoryDto;
import ir.co.sadad.eb.service.dto.LadingOfBillDto;
import ir.co.sadad.eb.service.dto.LadingOfBillUpdateDto;

public interface ILadingOfBillService extends IService<LadingOfBill, Long>{

    LadingBillStatusHistoryDto createLadingOfBill(LadingOfBillDto ladingOfBillDto) throws BusinessException;

    LadingBillStatusHistoryDto updateLadingOfBill(LadingOfBillDto ladingOfBillDto) throws BusinessException;

    LadingOfBillDto findByTrackingCode(String trackingCode) throws BusinessException;
}
