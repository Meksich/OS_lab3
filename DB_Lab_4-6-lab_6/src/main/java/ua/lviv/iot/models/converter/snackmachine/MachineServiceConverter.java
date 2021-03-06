package ua.lviv.iot.models.converter.snackmachine;

import ua.lviv.iot.models.domain.snackmachine.MachineService;
import ua.lviv.iot.models.dto.snackmachine.MachineServiceDto;

public class MachineServiceConverter {
    public static MachineServiceDto toDTO(MachineService machineService) {
        MachineServiceDto machineServiceDto = MachineServiceDto.builder()
                .machineId(machineService.getMachineId())
                .loadedCoins(machineService.getLoadedCoins())
                .build();
        if (machineService.getLastCashGathering() != null) {
            machineServiceDto.setLastCashGathering(machineService.getLastCashGathering().toString());
            machineServiceDto.setGatheredCash(machineService.getGatheredCash());
        }
        if (machineService.getLastLoad() != null) {
            machineServiceDto.setLastLoad(machineService.getLastLoad().toString());
        }
        if (machineService.getLastCoinLoad() != null) {
            machineServiceDto.setLastCoinLoad(machineService.getLastCoinLoad().toString());
            machineServiceDto.setLoadedCoins(machineService.getLoadedCoins());
        }
        return machineServiceDto;
    }
}
