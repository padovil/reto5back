/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mintic.reto1.Repository.Crud;

import mintic.reto1.Model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;
/**
 *
 * @author USUARIO
 */
public interface UserCrudRepository extends MongoRepository<User, Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByEmailAndPassword(String email,String password);
    Optional<User> findTopByOrderByIdDesc();

    //* Reto 5 metodos
    @Query("{monthBirthtDay: ?0}")
    List<User> findByMonthBirthtDay(String monthBirthtDay);
    List<User> findByType(String type);
}
