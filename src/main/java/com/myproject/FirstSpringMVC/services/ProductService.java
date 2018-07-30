package com.myproject.FirstSpringMVC.services;

import java.util.List;

import com.myproject.FirstSpringMVC.model.Product;

public interface ProductService {
		public void addProduct(Product p);
		public void addOrUpdateProduct(Product p);
		public void removeProduct(int id);
		public void updateProduct(int id);
		public List<Product> productList();
}
