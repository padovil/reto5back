package mintic.reto1.Repository.Crud;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;
import mintic.reto1.Model.Footwears;


public interface FootwearsCrudRepository extends MongoRepository<Footwears, String> {
  //*Reto 5 metodos
  @Query("{'price': {$lte:?0}}")
  List<Footwears> findByPrice(double price);

  @Query("{'description': {$regex:?0,$options:'i'}}")
  List<Footwears> findByDescription(String description);

  @Query("{'category': {$regex:?0,$options:'i'}}")
  List<Footwears> findByCategory(String category);

}
