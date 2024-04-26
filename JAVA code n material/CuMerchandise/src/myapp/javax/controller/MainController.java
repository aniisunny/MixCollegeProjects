package myapp.javax.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import myapp.javax.bean.ProductBean;

public class MainController {

	private static final List<ProductBean> products = new ArrayList<>();
	public static int size ;
	static {

		products.add(new ProductBean("cap", 180));
		products.add(new ProductBean("Coin pouch", 175));
		products.add(new ProductBean("Canvas leather tote bag", 300));
		products.add(new ProductBean("Cotton Hat", 180));
		products.add(new ProductBean("Diaries", 220));
		products.add(new ProductBean("Foldable backpack bag", 230));
		products.add(new ProductBean("Gym shaker sipper", 220));
		products.add(new ProductBean("Gadget pouch", 350));
		products.add(new ProductBean("Insulaotor Mug", 360));
		products.add(new ProductBean("key Chain Leatherette", 75));
		products.add(new ProductBean("Luggage Tag", 110));
		products.add(new ProductBean("Lamp", 180));
		products.add(new ProductBean(" Ladies wallet sling purse", 320));
		products.add(new ProductBean("metal sipper bottle", 140));
		products.add(new ProductBean("mug born china", 130));
		products.add(new ProductBean(" mobile wallet", 65));
		products.add(new ProductBean("passport holder", 150));
		products.add(new ProductBean(" pen", 120));
		products.add(new ProductBean(" printed unisex sling leather bag", 580));
		products.add(new ProductBean(" premium laptop bag", 870));
		products.add(new ProductBean("printed  men's wallet", 340));
		products.add(new ProductBean(" printed card's holders", 200));
		products.add(new ProductBean("rubber wrist band", 30));
		products.add(new ProductBean("sports jacket", 580, true));
		products.add(new ProductBean("sports pant", 360, true));
		products.add(new ProductBean("selfie stick", 165));
		products.add(new ProductBean("Sports shorts", 315));
		products.add(new ProductBean("Tshirt Polo", 360, true));// color blue,white &black//
		products.add(new ProductBean("Tshirt V-neck", 270));
		products.add(new ProductBean("toiletry travel bag", 370));
		products.add(new ProductBean("Umbrella", 200));
		products.add(new ProductBean("Waist pouch cum sling bag", 350));
		products.add(new ProductBean("Travel Bag in wooden box", 950));
		products.add(new ProductBean("4 in one set", 820));
		products.add(new ProductBean("Small diary with pen", 150));// color red &brown//
		products.add(new ProductBean("Girls wrist watch", 350));
		products.add(new ProductBean("Boys wrist watch", 350));

	}

	public static List<ProductBean> getProducts(String offset) {
		size=products.size();
		int j = Integer.parseInt(offset);
		return products.subList(9 * (j - 1), 9 * j);
	}

	public static List<ProductBean> search(final String item) {
		List<ProductBean> l=products.stream().filter(x -> x.getName().contains(item)).collect(Collectors.toList());
		size = l.size();
		return l;
	}

}
