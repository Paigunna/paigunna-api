package com.paigunna.api.service;

import com.paigunna.api.dto.VehicleDto;
import java.util.List;


public interface VehicleNearbyService {

    List<VehicleDto> findByUserIdAndDistanceAndVehicleType(Long userId, Long distance, String vehicleType);
    
}
