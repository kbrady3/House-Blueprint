package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.Address;
import dmacc.beans.House;


@Configuration
public class BeanConfiguration {
	@Bean
	public House house() {
		House bean = new House("Bungalow", 10, false, 1890);
		return bean;
	}
	
	@Bean
	public Address address() {
		Address bean = new Address(5846, "Hidden Lane", "Urbandale", "Iowa", 56321);
		return bean;
	}
}