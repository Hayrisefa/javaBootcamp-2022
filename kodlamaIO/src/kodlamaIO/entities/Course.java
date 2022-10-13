package kodlamaIO.entities;

public class Course {
	
	private int id ;
	private String name;
	private String egitmen;
	private double price;
	private String kategori;
	public Course() {
	}
	public Course(int id, String name,String egitmen, double Price,String kategori) {
	
		this.id = id;
		this.name = name;
		this.egitmen =egitmen;
		this.price = Price;
		this.kategori=kategori;
	}
	
	
	public String getKategori() {
		return kategori;
	}
	public void setKategori_id(String kategori) {
		this.kategori = kategori;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getEgitmen() {
		return egitmen;
	}
	public void setEgitmen(String egitmen) {
		this.egitmen = egitmen;
	}
	

}
