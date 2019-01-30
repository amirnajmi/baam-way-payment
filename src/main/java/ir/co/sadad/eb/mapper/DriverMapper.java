package ir.co.sadad.eb.mapper;


import ir.co.sadad.eb.domain.Driver;
import ir.co.sadad.eb.service.dto.DriverDto;
import org.mapstruct.Mapper;

@Mapper
public interface DriverMapper {

    Driver driverDtoToDriver(DriverDto driverDto);
    DriverDto driverToDriverDto(Driver driver);

}
