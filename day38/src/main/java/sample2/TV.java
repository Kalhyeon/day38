package sample2;

// 제조 회사, 가격, 화면 대각선 크기 (인치), OLED 여부

public class TV {
	private String company;
	private Long price;
	private Long size;
	private Boolean oled;
	
	public TV(String company, Long price, Long size, Boolean oled) {
		this.company = company;
		this.price = price;
		this.size = size;
		this.oled = oled;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public Long getSize() {
		return size;
	}

	public Boolean getOled() {
		return oled;
	}
	
}
