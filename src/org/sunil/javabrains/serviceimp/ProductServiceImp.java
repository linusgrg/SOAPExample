package org.sunil.javabrains.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.sunil.javabrains.model.Product;

public class ProductServiceImp {

	List<String> bookList = new ArrayList<>();
	List<String> musicList = new ArrayList<>();
	List<String> movieList = new ArrayList<>();
	
	public ProductServiceImp(){
		bookList.add("munamadan");
		bookList.add("mero nepali book");
		bookList.add("jpt");
		
		musicList.add("abc");
		musicList.add("xyz");
		musicList.add("pqr");
		
		movieList.add("guru");
		movieList.add("kabaddi");
		movieList.add("sf");
	}

	public List<String> getProductCategory() {
		List<String> categories = new ArrayList<>();
		categories.add("books");
		categories.add("music");
		categories.add("movies");
		return categories;
	}
	
	public List<String> getProducts(String category){
		switch(category.toLowerCase()){
		case "books":
			return bookList;
		case "music":
			return musicList;
		case "movies" :
			return movieList;
		}
		return null;
		}
	

	public Boolean addProducts(String category, String product){
		switch(category.toLowerCase()){
		case "book":
			bookList.add(product);
			break;
		case "music":
			musicList.add(product);
			break;
		case "movies":
			movieList.add(product);
			break;
		default:
			return false;
		}
		return true;
		
		
		}
	
	public List<Product> getProductv2(String category){
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("javabrain","12",55222));
		productList.add(new Product("javabrain2","1232",5322));
		return productList;
	}
}
