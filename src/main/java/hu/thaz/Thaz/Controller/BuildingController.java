package hu.thaz.Thaz.Controller;

import hu.thaz.Thaz.Modul.Building;
import hu.thaz.Thaz.Service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/" )
public class BuildingController {
    @Autowired
    private BuildingService buildingService;

    @PostMapping("/home/building")
    public Boolean createBuilding(@RequestBody Building building) {
        buildingService.createNewBuilding(building);
        return true;
    }



}
