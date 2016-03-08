package org.sunil.javabrains;

import java.util.List;

import javax.jws.WebService;

import org.sunil.javabrains.model.Product;
import org.sunil.javabrains.service.ProductService;
import org.sunil.javabrains.serviceimp.ProductServiceImp;

@WebService(endpointInterface="org.sunil.javabrains.service.ProductService", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService")
public class ProductCatalog implements ProductService {

	ProductServiceImp productService = new ProductServiceImp();

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sunil.javabrains.ProductService#getProduct()
	 */
	@Override

	public List<String> getProduct() {
		return productService.getProductCategory();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sunil.javabrains.ProductService#getProducts(java.lang.String)
	 */
	@Override

	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sunil.javabrains.ProductService#addProductToCategory(java.lang.
	 * String, java.lang.String)
	 */
	@Override

	public boolean addProductToCategory(String category, String product) {
		return productService.addProducts(category, product);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.sunil.javabrains.ProductService#getProductsv2(java.lang.String)
	 */
	@Override

	public List<Product> getProductsv2(String category) {
		return productService.getProductv2(category);
	}

}
