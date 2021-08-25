package hu.thaz.Thaz.Repository;

import hu.thaz.Thaz.Modul.Building;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BuildingRepository extends JpaRepository<Building,Long> {

}
