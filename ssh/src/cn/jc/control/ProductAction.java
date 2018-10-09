package cn.jc.control;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import cn.jc.entity.Product;
import cn.jc.service.ProductService;

/**
 * 控制层的Action类
 * @author Deng
 *
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product>{

	//手动创建实体类对象
	private Product product=new Product();
	//创建productService
	private ProductService productService;
	//为了方便spring的注入提供set方法
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@Override
	public Product getModel() {
		// TODO Auto-generated method stub
		return product;
	}
	
	

	//一个模拟保存的 方法
	public String save(){
		System.out.println("Action保存了商品");
		productService.save(product);
		return NONE;
	}

}
