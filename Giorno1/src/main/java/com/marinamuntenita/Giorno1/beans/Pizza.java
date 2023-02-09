package com.marinamuntenita.Giorno1.beans;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("prototype")
public class Pizza extends Margherita {

	private String nome;
	private List<Toppings> toppings;
	
	public double getPrezzoTot() {
		
		for ( Toppings t : toppings) {
			t.getPrezzo();
		}
		
		return (toppings != null) ? prezzo + getPrezzoToppings() : prezzo;
	}
	
	public Pizza(String nome, List<Toppings> toppings) {
		super();
		this.nome = nome;
		this.toppings = toppings;
	}

	public int getPrezzoToppings() {
		int top = 0;
		for ( Toppings t : toppings) {
			 top += t.getPrezzo();
		}
		return top;
	}

	public String ToString() {
		return nome.toUpperCase() + " Ingredienti: " + pomodoro + " " + mozzarella + toppings + " Totale: " + getPrezzoTot();
		
	}
}
