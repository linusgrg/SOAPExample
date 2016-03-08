package org.sunil.javabrains.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.sunil.javabrains.model.Product;

@WebService(name = "TestMartCatalog", targetNamespace = "http://www.testmart.com")
public interface ProductService {
	@WebMethod(action ="fetch_categories", operationName="fetchCategories")
	List<String> getProduct();
	@WebMethod
	List<String> getProducts(String category);
	@WebMethod
	boolean addProductToCategory(String category, String product);
	@WebMethod
	List<Product> getProductsv2(String category);

}