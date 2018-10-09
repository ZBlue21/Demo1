package cn.jc.service;

import org.springframework.transaction.annotation.Transactional;

import cn.jc.dao.ProductDao;
import cn.jc.entity.Product;

/**
 * ҵ���
 * @author Deng
 *
 */
//�����������ע��
@Transactional
public class ProductService {
	//ʹ��spring��daoע��
	private ProductDao productDao;
	//����set��������spring����ע��
	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}
	public void save(Product product) {
		// TODO Auto-generated method stub
		System.out.println("service���save����");
		productDao.save(product);
	}
	
	
}
