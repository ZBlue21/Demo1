package cn.jc.control;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.jc.entity.Product;
import cn.jc.service.ProductService;

/**
 * ���Ʋ��Action��
 * @author Deng
 *
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{

	//�ֶ�����ʵ�������
	private Product product=new Product();
	//����productService
	private ProductService productService;
	//Ϊ�˷���spring��ע���ṩset����
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@Override
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	
	

	//һ��ģ�Ᵽ��� ����
	public String save(){
		System.out.println("Action��������Ʒ");
		productService.save(product);
		return NONE;
	}

}
