package Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import Model.Product;
import Repositiory.ProductRepo;

@Component
public class ProductSevice {
	
	@Autowired
	private ProductRepo repo;
	

	// we are getting error when we are adding products becuase as we are having
	// asList it will b e mutable so
//	List<Product> listOfProducts = Arrays.asList(new Product(12, "mobile", 789000), new Product(13, "laptop", 789000),

//	List<Product> listOfProducts = new ArrayList<>(
//			Arrays.asList(new Product(12, "mobile", 789000), new Product(13, "laptop", 789000),
//
//					new Product(14, "tab", 7890003)));
//
//	public List<Product> getProducts() {
//		return listOfProducts;
//	}
////
//	public Product getProductsById(int prodId) {
//		return listOfProducts.stream().filter(p -> p.getProdId() == prodId).findFirst().get();
//		// orelse(add new object)in case of not there it will snd (but not agood idea);
//	}
//
//	public void addProducts(Product prod) {
//		listOfProducts.add(prod);
//	}
//////jackson we have in libarary that only coverst json to object and pbject to json
////
//	public void Updateproducts(Product prod) {
//
//
//		int index = 0;
//		for (int i = 0; i < listOfProducts.size(); i++)
//			if (listOfProducts.get(i).getProdId() == prod.getProdId()) {
//				index = i;
//				listOfProducts.set(index, prod);
//			}
//	}
//
//	public void deleteproducts(int prodId) {
//
//		int index = 0;
//		for (int i = 0; i < listOfProducts.size(); i++)
//			if (listOfProducts.get(i).getProdId() == prodId) {
//				index = i;
//				listOfProducts.remove(index);
//			} else {
//				System.out.println("item not found");
//			}
//	}
////jacl
//	
	
	
	//by database 
	public List<Product> getProducts1(){
		return repo.findAll();
	}
	
	
	public Product getProductsById1(int prodId){
		return repo.findById(prodId).orElse(new Product());
	}

	public void addProducts1(Product prod) {
		repo.save(prod);
	}
	public void Updateroducts1(Product prod) {
		repo.save(prod);
	}
	public void deleteroducts1(int prodId) {
		repo.deleteById(prodId);
	}
	
	
}
