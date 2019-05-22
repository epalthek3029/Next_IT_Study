package control.model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

// JavaBeans, VO, model, DTO
public class Camera {
	
	private StringProperty maker;
	private StringProperty image;
	private IntegerProperty price;

	public Camera() {
		
		this.maker = new SimpleStringProperty();
		this.image = new SimpleStringProperty();
		this.price = new SimpleIntegerProperty();
		
	}

	public Camera(String maker, String image, int price) { 
		
		this.maker = new SimpleStringProperty(maker);
		this.image = new SimpleStringProperty(image);
		this.price = new SimpleIntegerProperty(price);
		
	}

	public String getMaker() {
		return maker.get();
	}

	public void setMaker(String maker) {
		this.maker.set(maker);
	}
	
	public StringProperty makerProperty() {
		return maker;
	}

	
	public String getImage() {
		return image.get();
	}

	public void setImage(String image) {
		this.image.set(image);
	}

	public StringProperty imageProperty() {
		return image;
	}
	
	
	public Integer getPrice() {
		return price.get();
	}

	public void setPrice(Integer price) {
		this.price.set(price);
	}
	
	public IntegerProperty priceProperty() {
		return price;
	}

	
}
