package cn.jc.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.jc.entity.Product;

/**
 * DAO层
 * @author Deng
 *
 */
//两种办法实现对数据库的操作
//1.继承hibernate自带的Dao支持类
//2.通过spring注入sessionFactory
public class ProductDao extends HibernateDaoSupport{
	

	public void save(Product product) {
		// TODO Auto-generated method stub
		System.out.println("dao保存了商品");
		System.out.println(product);
		this.getHibernateTemplate().save(product);
	}

}
