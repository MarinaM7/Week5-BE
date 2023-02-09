package com.marinamuntenita.Giorno1.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Margherita {
	
	 protected String pomodoro = "pomodoro";
	 protected String mozzarella = "mozzarella";
	 protected double prezzo = 4.50;
	
	 public String ToString() {
			return Margherita.class.getSimpleName().toUpperCase() + " Ingredienti: " + pomodoro + " " + mozzarella + " Totale: " + prezzo;
			
		}
}
