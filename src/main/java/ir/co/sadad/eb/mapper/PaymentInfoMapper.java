package ir.co.sadad.eb.mapper;

import ir.co.sadad.eb.domain.PaymentInfo;
import ir.co.sadad.eb.service.dto.PaymentInfoDto;
import org.mapstruct.Mapper;

@Mapper
public interface PaymentInfoMapper {

    PaymentInfo paymentInfoDtoToPaymentInfo(PaymentInfoDto paymentInfoDto);
    PaymentInfoDto paymentInfoToPaymentInfoDto(PaymentInfo paymentInfo);
}
