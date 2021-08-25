package hu.thaz.Thaz.Service;

import hu.thaz.Thaz.Exceptions.ValidationException;
import hu.thaz.Thaz.Modul.Building;
import hu.thaz.Thaz.Modul.User;
import hu.thaz.Thaz.Repository.BuildingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingService {


    @Autowired
    private BuildingRepository buildingRepository;

    public void createNewBuilding(Building building) {
        if(building.equals("") ||
                building.getBuildingname() == null){
            throw new ValidationException("Missing building name");
        } else {
            buildingRepository.save(building);
        }
    }

}
