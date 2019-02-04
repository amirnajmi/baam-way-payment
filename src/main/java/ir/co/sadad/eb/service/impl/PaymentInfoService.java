package ir.co.sadad.eb.service.impl;

import ir.co.sadad.eb.domain.PaymentInfo;
import ir.co.sadad.eb.mapper.PaymentInfoMapper;
import ir.co.sadad.eb.repository.api.PaymentInfoRepository;
import ir.co.sadad.eb.service.api.IPaymentInfoService;
import ir.co.sadad.eb.service.dto.PaymentInfoDto;

import javax.ejb.Stateless;
import javax.inject.Inject;
@Stateless
public class PaymentInfoService extends AbstractGenericService<PaymentInfo, Long> implements IPaymentInfoService {

    private PaymentInfoRepository paymentInfoRepository;

    @Inject
    public PaymentInfoService(PaymentInfoRepository genericRepository){
        super(genericRepository);
        this.paymentInfoRepository = genericRepository;
    }

    @Inject
    private PaymentInfoMapper paymentInfoMapper;

    public PaymentInfoService(){
    }

     public PaymentInfoDto create(PaymentInfoDto paymentInfoDto){
         return paymentInfoMapper.paymentInfoToPaymentInfoDto(save(paymentInfoMapper.paymentInfoDtoToPaymentInfo(paymentInfoDto)));
     }

     public PaymentInfoDto update(PaymentInfoDto paymentInfoDto){
         return paymentInfoMapper.paymentInfoToPaymentInfoDto(update(paymentInfoMapper.paymentInfoDtoToPaymentInfo(paymentInfoDto)));
     }
}
