package edu.infsci2560;

import edu.infsci2560.models.Location;
import edu.infsci2560.models.Blog;
import edu.infsci2560.models.Event;
import edu.infsci2560.models.Friend;
import edu.infsci2560.models.Location.LocationType;
import edu.infsci2560.repositories.LocationRepository;
import edu.infsci2560.repositories.BlogRepository;
import edu.infsci2560.repositories.EventRepository;
import edu.infsci2560.repositories.FriendRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan({"edu.infsci2560"})
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);

        LocationRepository repository = ctx.getBean(LocationRepository.class);
        repository.save(new Location(1L, "Huston Woods", LocationType.NaturalAttractions,"Oxford, OH","A good Natural Park that allow pets","http://www.markschupp.com/AccountData/150109499/147064800.jpg"));
        repository.save(new Location(2L, "Frick Park", LocationType.PublicPark,"Pittsburgh, PA", "A public park in Urban Pittsburgh, allow pets.","http://cdn.onlyinyourstate.com/wp-content/uploads/2016/05/1-Frick-Park.jpg"));
        repository.save(new Location(3L, "Hampton Inn", LocationType.Hotel,"Pittsburgh, PA","A hotel which is pet-friendly, try to spend a great time with your dogs here! ","https://images.bringfido.com/site_media/photos/2015/06/17/6_caenwPETS-2014.jpg"));
    
        
        BlogRepository repositoryb = ctx.getBean(BlogRepository.class);
        repositoryb.save(new Blog(1L,"Blog#1","Author1","xxxxxxxx","http://oi63.tinypic.com/63uc1j.jpg"));
        repositoryb.save(new Blog(2L,"Blog#2","Author1","xxxxxxxx","http://oi68.tinypic.com/10nyxya.jpg"));
        
        EventRepository repositorye = ctx.getBean(EventRepository.class);
        repositorye.save(new Event(1L,"Yuki's Birth","2015-03-07","On March 7th, 2015, our little angel (sometimes can be an evil) -- Yuki was born."));
        repositorye.save(new Event(1L,"Yuto's Birth","2015-03-16","Yuto's birthday is on March 16th. As a Golden Retriever, she is so cute and lovely."));        
        repositorye.save(new Event(1L,"New Home","2015-05-03","Yuki and Yuto come to our home! Yuki comes from a small Village in Indiana. She is the youngest among her sibings. Yuto comes from a small town of Indiana, she has bright eyes and there are heart-shaped hair on her chest."));
        repositorye.save(new Event(1L,"2 Months Old","2015-05-12","Yuki and Yuto adapt to the new environment only a few days after they moved in."));
        repositorye.save(new Event(1L,"Smiley Angel","2015-05-23","Yuki smiles like an angel."));
        repositorye.save(new Event(2L,"1st Birthday","2016-03-11","We celebrate their birthday together, eating cakes that has designated designs for them."));
        repositorye.save(new Event(2L,"First Time Boarding","2016-03-20","While we head to San Franciso for Spring Break, they spend first week away from us, boarding with other dogs."));
        repositorye.save(new Event(2L,"Move to Pittsburgh","2016-08-09","We move to pittsburgh for school they move to pittsburgh for fun"));
        repositorye.save(new Event(3L,"Two Years Old","2017-03-07","They turn to two while are as cute as the little puppies first brought into our family"));
        		
        FriendRepository repositoryf = ctx.getBean(FriendRepository.class);
        repositoryf.save(new Friend(1L,"Genki","Husky","3","http://cdn3-www.dogtime.com/assets/uploads/gallery/siberian-husky-dog-breed-pictures/siberian-husky-dog-breed-pictures-5.jpg"));
        repositoryf.save(new Friend(2L,"Kiki","Samoyed","3","http://cdn3-www.dogtime.com/assets/uploads/gallery/siberian-husky-dog-breed-pictures/siberian-husky-dog-breed-pictures-5.jpg"));
        
        
        
    }


//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }
//    @Bean
//    public CommandLineRunner databaseDemo(CustomerRepository repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Customer("Jack", "Bauer"));
//            repository.save(new Customer("Chloe", "O'Brian"));
//            repository.save(new Customer("Kim", "Bauer"));
//            repository.save(new Customer("David", "Palmer"));
//            repository.save(new Customer("Michelle", "Dessler"));
//            repository.save(new Customer("Billy", "Bean"));
//
//            // fetch all customers
//            log.info("[Database Demo] Customers found with findAll():");
//            log.info("[Database Demo] -------------------------------");
//            for (Customer customer : repository.findAll()) {
//                log.info("[Database Demo] " + customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Customer customer = repository.findOne(1L);
//            log.info("[Database Demo] Customer found with findOne(1L):");
//            log.info("[Database Demo] --------------------------------");
//            log.info("[Database Demo] " + customer.toString());
//
//            // fetch customers by last name
//            log.info("[Database Demo] Customer found with findByLastName('Bauer'):");
//            log.info("[Database Demo] --------------------------------------------");
//            for (Customer bauer : repository.findByLastName("Bauer")) {
//                log.info("[Database Demo] " + bauer.toString());
//            }
//        };
//    }
    
    
}
