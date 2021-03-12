//Kabrina Brady, Java II, 3/11/2021

package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import dmacc.beans.Address;
import dmacc.beans.House;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.HouseRepository;

@SpringBootApplication
public class SpringHouseApplication implements CommandLineRunner{
	
	public static void main(String[] args) {
		SpringApplication.run(SpringHouseApplication.class, args);
	}
	
	@Autowired
	HouseRepository repo;
	
	@Override
	public void run(String... args) throws Exception {
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		House h = appContext.getBean("House", House.class);
		h.setType("Two story");
		repo.save(h);
		
		House d = new House("Ranch", 6, true, 1560);
		Address a = new Address(2984, "Main Street", "Des Moines", "Iowa", 50312);
		d.setAddress(a);
		repo.save(d);
		
		((AbstractApplicationContext) appContext).close();
	}
}