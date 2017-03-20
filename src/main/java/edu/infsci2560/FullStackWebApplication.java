package edu.infsci2560;

import edu.infsci2560.models.Location;
import edu.infsci2560.models.Blog;
import edu.infsci2560.models.Event;
import edu.infsci2560.models.Location.LocationType;
import edu.infsci2560.repositories.LocationRepository;
import edu.infsci2560.repositories.BlogRepository;
import edu.infsci2560.repositories.EventRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;



@SpringBootApplication
public class FullStackWebApplication {

    private static final Logger log = LoggerFactory.getLogger(FullStackWebApplication.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(FullStackWebApplication.class, args);

        LocationRepository repository = ctx.getBean(LocationRepository.class);
        repository.save(new Location(1L, "Huston Woods", LocationType.NaturalAttractions,"Oxford, OH","A good Natural Park that allow pets" ));
        repository.save(new Location(2L, "Frick Park", LocationType.PublicPark,"Pittsburgh, PA", "A public park in Urban Pittsburgh, allow pets."));
        repository.save(new Location(3L, "Hampton Inn", LocationType.Hotel,"Pittsburgh, PA","A hotel which is pet-friendly, try to spend a great time with your dogs here! "));
    
        
        BlogRepository repositoryb = ctx.getBean(BlogRepository.class);
        repositoryb.save(new Blog(1L,"Blog#1","Author1","xxxxxxxx"));
        repositoryb.save(new Blog(2L,"Blog#2","Author1","xxxxxxxx"));
        
        EventRepository repositorye = ctx.getBean(EventRepository.class);
        repositorye.save(new Event(1L,"Yuki's Birth","2015-03-07","On March 7th, 2015, our little angel(sometimes can be an evil) -- Yuki was born."));
        repositorye.save(new Event(1L,"Yuto's Birth","2015-03-16","Yuto's birthday is on March 16th. As a Golden Retriever, she is so cute and lovely."));        
        
        
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
