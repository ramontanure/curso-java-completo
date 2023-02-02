package entities;

import entities.enums.Color;

//É uma classe abstrata pois tem um metodo area
public abstract class Shape {
	
	private Color color;

	public Shape() {
		
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	//Esse metodo é abstrato pois pra cada forma a lógica da area é diferente, então não faz sentido 
	public abstract double area();
}
