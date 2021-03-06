package edu.infsci2560;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import edu.infsci2560.models.Event;




@Configuration
@EnableWebMvc
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("security");
        registry.addViewController("/locations").setViewName("locations");
        registry.addViewController("/blogs").setViewName("blogs");
        registry.addViewController("/photos").setViewName("photos");
        registry.addViewController("/accounts").setViewName("accounts");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/files").setViewName("uploadForm");
        registry.addViewController("/friends").setViewName("friends");
        registry.addViewController("/contact").setViewName("contact");
        registry.addViewController("/thankyou").setViewName("thankyou");
    }


    @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/").setCachePeriod(31556926);

    registry.addResourceHandler("/**").addResourceLocations("classpath:/META-INF/resources/", "classpath:/resources/",
		"classpath:/static/").setCachePeriod(31556926);
      
   
  }



 
    


}
