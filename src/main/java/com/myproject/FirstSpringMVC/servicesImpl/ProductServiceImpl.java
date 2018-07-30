package com.myproject.FirstSpringMVC.servicesImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myproject.FirstSpringMVC.dao.ProductDao;
import com.myproject.FirstSpringMVC.model.Product;
import com.myproject.FirstSpringMVC.services.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao prod;

	@Override
	public void addProduct(Product p) {
		prod.addProduct(p);

	}
	@Override
	public void addOrUpdateProduct(Product p) {
		prod.addOrUpdateProduct(p);
	}

	@Override
	public void removeProduct(int id) {
		prod.removeProduct(id);

	}

	@Override
	public void updateProduct(int id) {
		prod.updateProduct(id);

	}

	@Override
	public List<Product> productList() {
		return prod.productList();
	}
	
	

}
