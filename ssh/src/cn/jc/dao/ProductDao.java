package cn.jc.dao;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import cn.jc.entity.Product;

/**
 * DAO��
 * @author Deng
 *
 */
//���ְ취ʵ�ֶ����ݿ�Ĳ���
//1.�̳�hibernate�Դ���Dao֧����
//2.ͨ��springע��sessionFactory
public class ProductDao extends HibernateDaoSupport{
	

	public void save(Product product) {
		// TODO Auto-generated method stub
		System.out.println("dao��������Ʒ");
		System.out.println(product);
		this.getHibernateTemplate().save(product);
	}

}
