package ua.lviv.iot.models.dto.adress;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CityDto {
    private Integer id;
    private String name;
    private String country;
    private String region;
}
