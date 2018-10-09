package cn.jc.entity;



/**
 * Product entity. @author MyEclipse Persistence Tools
 */

public class Product  implements java.io.Serializable {


    // Fields    

     private String pname;
     private Integer price;


    // Constructors

    /** default constructor */
    public Product() {
    }

	/** minimal constructor */
    public Product(String pname) {
        this.pname = pname;
    }
    
    /** full constructor */
    public Product(String pname, Integer price) {
        this.pname = pname;
        this.price = price;
    }

   
    // Property accessors

    public String getPname() {
        return this.pname;
    }
    
    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPrice() {
        return this.price;
    }
    
    public void setPrice(Integer price) {
        this.price = price;
    }

	@Override
	public String toString() {
		return "Product [pname=" + pname + ", price=" + price + "]";
	}
   


    





}