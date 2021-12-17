package mintic.reto1;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import mintic.reto1.Model.Footwears;
import mintic.reto1.Model.User;
import mintic.reto1.Repository.Crud.FootwearsCrudRepository;
import mintic.reto1.Repository.Crud.UserCrudRepository;
import mintic.reto1.Repository.Crud.OrderCrudRepository;

@Component
@SpringBootApplication
@EnableConfigurationProperties
public class Reto1Application implements CommandLineRunner {
    

	@Autowired
    private FootwearsCrudRepository FootwearsCrudRepository;
    @Autowired
    private UserCrudRepository UserCrudRepository;
    @Autowired
    private OrderCrudRepository OrderCrudRepository;

	public static void main(String[] args) {
		SpringApplication.run(Reto1Application.class, args);
	}

	@Override
    public void run(String... args) throws Exception {
        // Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        FootwearsCrudRepository.deleteAll();
        UserCrudRepository.deleteAll();
        OrderCrudRepository.deleteAll();
        // UserCrudRepository.saveAll(List.of(            
        //     new User(1, "46669989", "ANGIE", date, "11", "CR 34-45", "3174565625", "angie@gmail.com", "Demo123.", "COMUNA_1_NORTE", "ASE"),
        //     new User(2, "12345678", "LORENA", date, "11", "CR 34-45", "3174565625", "lorena@gmail.com", "Demo123.", "COMUNA_1_NORTE", "COORD"),
        //     new User(3, "98765432", "ALDANA", date, "11", "CR 34-45", "3174565625", "aldana@gmail.com", "Demo123.", "COMUNA_1_NORTE", "ADM")
        // ));

        // FootwearsCrudRepository.saveAll(List.of(
        //     new Footwears("AP-903",  "ACME",  "CATEGORIA 1",  "MATERIAL 1",  "HOMBRE",  "M",  "DESCRIPCION 1",  true,  150000.0,  2000, "https://p4.wallpaperbetter.com/wallpaper/881/453/138/accessory-elegance-fashion-footwear-wallpaper-preview.jpg"),
        //     new Footwears("AP-904",  "ACME",  "CATEGORIA 2",  "MATERIAL 2",  "MUJER",  "M",  "DESCRIPCION 2",  true,  50000.0,  100, "https://p4.wallpaperbetter.com/wallpaper/265/936/851/shoes-feet-railway-outdoors-wallpaper-preview.jpg"),
        //     new Footwears("AP-905",  "ACME",  "CATEGORIA 3",  "MATERIAL 3",  "HOMBRE",  "M",  "DESCRIPCION 3",  true,  10000.0,  30, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT1Z5vQu4zTZqynJHb8ZJ-aDM309busXPqKRfnXUB36CJ_0hEHf3piqV58-4le2LiXYxfU&usqp=CAU")                         
        // ));

        // System.out.println("Listado");
        // UserCrudRepository.findAll().forEach(System.out::println);

        // System.out.println("Listado");
        // FootwearsCrudRepository.findAll().forEach(System.out::println);
    }

}
