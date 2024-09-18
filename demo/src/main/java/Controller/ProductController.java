package Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import Model.Product;
import org.springframework.web.service.annotation.DeleteExchange;

import Model.Product;
import Service.ProductSevice;
import jakarta.websocket.server.PathParam;

@RestController
public class ProductController {
	

//	@Autowired
//	private ProductSevice service;
////	
//	 public ProductController(ProductSevice productService) {
//	        this.service = productService;
//	    }

//	@RequestMapping("/product")
//	public List<Product> getProduct() {
//		return service.getProducts();
//	}

//	public ProductController(ProductSevice obj) {
//		super();
//		this.obj = obj;
//	}

	ProductSevice obj = new ProductSevice();

	@RequestMapping("/product") // or gettmaping
	public String method() {
		return "Hello welcome to the product page";
	}

//	List<Product> listOfProducts = Arrays.asList(new Product(12, "mobile", 789000), new Product(13, "laptop", 789000),
//			new Product(14, "tab", 7890003));
////
	@RequestMapping("/productList") // or gettmaping
	public List<Product> getProducts() {
		return obj.getProducts1();
	}

	@GetMapping("product/{prodId}")
	public Product getProductbyId(@PathVariable int prodId) {//path variable will help to connect the input id we are giving and match the input id in the list
		return obj.getProductsById1(prodId);
	}

//	@RequestMapping("/product") wont it cause ocnfusin on first method having same url yes so here we can go for postmmapping there we can go for getmapping
	@PostMapping("/product")
	public void addproducts(@RequestBody Product products) {//Requestbody will match the products we send from server
		System.out.println(products);

		obj.addProducts1(products);

	}
	@PutMapping("/product")
	public void updateProducts(@RequestBody Product products) {//Requestbody will match the products we send from server
		System.out.println(products);

		obj.Updateroducts1(products);

	}
	
	@DeleteMapping("/product/{prodId}")
	public void  deleteProducts(@PathVariable int prodId) {//Requestbody will match the products we send from server
		obj.deleteroducts1(prodId);

	}


}
