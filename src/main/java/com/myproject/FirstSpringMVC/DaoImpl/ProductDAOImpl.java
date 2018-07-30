package com.myproject.FirstSpringMVC.DaoImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.myproject.FirstSpringMVC.dao.ProductDao;
import com.myproject.FirstSpringMVC.model.Product;
@Repository
@Transactional
public class ProductDAOImpl implements ProductDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	private Logger log=Logger.getLogger(Product.class);

	@Override
	public void addProduct(Product p) {
		sessionFactory.getCurrentSession().save(p);
		log.info("Product added : "+p.toString());
	}
	
	@Override
	public void addOrUpdateProduct(Product p) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void removeProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product p=session.get(Product.class, id);
		session.delete(p);
		log.info("Product deleted : "+p.toString());
	}

	@Override
	public void updateProduct(int id) {
		Session session=sessionFactory.getCurrentSession();
		Product p=session.get(Product.class, id);
		session.update(p);
		log.info("Product updated : "+p.toString());
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<Product> productList() {		
		return (List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	}

}
