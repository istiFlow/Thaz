package hu.thaz.Thaz.Service;

import hu.thaz.Thaz.Exceptions.ValidationException;
import hu.thaz.Thaz.Modul.Building;
import hu.thaz.Thaz.Modul.User;
import hu.thaz.Thaz.Repository.BuildingRepository;
import hu.thaz.Thaz.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BuildingRepository buildingRepository;


    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void createNewUser(User user) {
        if(user.equals("") ||
            user.getUserName() == null){
            throw new ValidationException("Missing user name");
        } else {
            user.setBuilding(user.getBuilding());
            userRepository.save(user);

        }
    }

    public void deleteUser(Long id){
        userRepository.deleteById(id);
    }

    public User updateUser(Long id, User user){
        user.setId(id);
        return userRepository.save(user);
    }

    public Optional<User> findOneUser(Long id){
        return userRepository.findById(id);
    }
    public void deleteAllUsers(){
        userRepository.deleteAll();
    }

}
