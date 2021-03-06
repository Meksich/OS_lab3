package ua.lviv.iot.models.dto.snackmachine;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SnackMachineDto {
    private Integer id;
    private Integer fullAddressId;
    private Integer machineProducerId;
    private String machineModel;
}
