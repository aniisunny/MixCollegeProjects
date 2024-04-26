package myapp.javax.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private static int counter = 0;
	private int pid;

	private String name;
	private double price;
	private int quantity;
	private boolean sizeList;
	private final List<String> size = new ArrayList<String>();
	private final List<String> image = new ArrayList<String>();

	private ProductBean() {
		super();
		pid = counter++;
	}

	public ProductBean(String name, double price) {
		this();
		this.name = name;
		this.price = price;
	}

	public ProductBean(String name, double price, boolean sizeList) {
		this(name, price);
		this.sizeList = sizeList;
		if (sizeList) {
			size.addAll(Arrays.asList("S", "M", "L", "XL"));
		}
	}

	public int getPid() {
		return pid;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public boolean isSizeList() {
		return sizeList;
	}

	public List<String> getSize() {
		return size;
	}

	@Override
	public String toString() {
		return "ProductBean [pid=" + pid + ", name=" + name + ", price=" + price + "]";
	}

	public List<String> getImage() {
		return image;
	}

}
