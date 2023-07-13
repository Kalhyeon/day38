package sample2;

import java.awt.Color;

// 가격, 생산지, 색상, 품종

public class Apple {
	private String kind;
	private String place;
	private Color color;
	private Long price; // null 값을 받으려면 long => Long
	
	public Apple(String kind, String place, Color color, Long price) {
		this.kind = kind;
		this.place = place;
		this.color = color;
		this.price = price;
	}

	public String getKind() {
		return kind;
	}

	public String getPlace() {
		return place;
	}

	public Color getColor() {
		return color;
	}

	public Long getPrice() {
		return price;
	}
	
}
