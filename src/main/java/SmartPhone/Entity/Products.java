package SmartPhone.Entity;

public class Products {
	private int id;
	private int id_catagory;
	private String name;
	private double price;
	private String detail;
	private String img;
	public Products() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId_catagory() {
		return id_catagory;
	}
	public void setId_catagory(int id_catagory) {
		this.id_catagory = id_catagory;
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
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
}
