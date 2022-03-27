package com.ms.parkingcontrol.adapters.out.parkingmanagement;

import java.util.List;

public class ResearchedParkingSpot {
    private final Integer total;

    private final List<ParkingSpot> result;

    public ResearchedParkingSpot(Integer total, List<ParkingSpot> result) {
        this.total = total;
        this.result = result;
    }

    public Integer getTotal() {
        return total;
    }

    public List<ParkingSpot> getResult() {
        return result;
    }
}