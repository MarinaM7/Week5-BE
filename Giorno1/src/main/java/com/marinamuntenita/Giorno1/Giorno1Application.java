package com.marinamuntenita.Giorno1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.marinamuntenita.Giorno1.beans.Drinks;
import com.marinamuntenita.Giorno1.beans.Margherita;
import com.marinamuntenita.Giorno1.beans.Pizza;
import com.marinamuntenita.Giorno1.beans.Toppings;

@SpringBootApplication
public class Giorno1Application {

	public static void main(String[] args) {
		SpringApplication.run(Giorno1Application.class, args);
		makePizza();
	}
	
	public static void makePizza() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		Margherita marghe = (Margherita)ctx.getBean("pizza0");
		Pizza hawaii = (Pizza)ctx.getBean("pizza1");
		Pizza salami = (Pizza)ctx.getBean("pizza2");
		
		Toppings onion = (Toppings)ctx.getBean("topping5");
		Toppings salame = (Toppings)ctx.getBean("topping4");
		Toppings ananas = (Toppings)ctx.getBean("topping1");
		Toppings ham = (Toppings)ctx.getBean("topping2");
		
		Drinks lem = (Drinks)ctx.getBean("drink1");
		Drinks wat = (Drinks)ctx.getBean("drink2");
		Drinks wine = (Drinks)ctx.getBean("drink3");
		
		System.out.println();
		System.out.println("-------------------------MENU-------------------------");
		System.out.println();
		System.out.println("***Pizza***");
		System.out.println();
		System.out.println(marghe.toString());
		System.out.println(hawaii.ToString());
		System.out.println(salami.ToString());
		
		System.out.println();
		System.out.println("***Toppings***");
		System.out.println();
		System.out.println(ananas);
		System.out.println(salame);
		System.out.println(ham);
		System.out.println(onion);
		
		System.out.println();
		System.out.println("***Drinks***");
		System.out.println();
		System.out.println(lem);
		System.out.println(wat);
		System.out.println(wine);
	}

}
