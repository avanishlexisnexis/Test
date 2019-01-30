package com.niit.rio;




import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.model.Product;

import dao.ProductDAO;
import daoimpl.ProductDAOImpl;

@Controller
public class ProductController 
{
	ProductDAO pd=new ProductDAOImpl();
	
	
	@RequestMapping(value= {"addproductcontroller"})
	public String addProduct(@ModelAttribute("prd") Product product)
	{
		pd.addProduct(product);
		return "redirect:/displayproducts";
	}
	
	@RequestMapping(value= {"displayproducts"})
	public String displayProducts(ModelMap map)
	{
		List<Product> products=pd.displayProducts();
		map.addAttribute("products",products);
		return "displayproducts";
	}
}
