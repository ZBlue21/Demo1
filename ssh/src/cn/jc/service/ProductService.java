package cn.jc.service;

import org.springframework.transaction.annotation.Transactional;

import cn.jc.dao.ProductDao;
import cn.jc.entity.Product;

/**
 * 业务层
 * @author Deng
 *
 */
//这个叫做事务注解
@Transactional
public class ProductService {
	//使用spring将dao注入
	private ProductDao productDao;
	//创建set方法方便spring进行注入
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	public void save(Product product) {
		// TODO Auto-generated method stub
		System.out.println("service层的save方法");
		productDao.save(product);
	}
	
	
}
