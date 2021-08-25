package hu.thaz.Thaz.Repository;

import hu.thaz.Thaz.Modul.Building;
import hu.thaz.Thaz.Modul.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

 List<User> findAll();
}
