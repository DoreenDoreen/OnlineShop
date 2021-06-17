package onlineShop.controller;


import onlineShop.entity.Product;
import onlineShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
    public ModelAndView getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return new ModelAndView("productList", "products", products);
    }

    @RequestMapping(value = "/getProductById/{productId}", method = RequestMethod.GET)
    public ModelAndView getProductById(@PathVariable(value = "productId") int productId) {
        Product product = productService.getProductById(productId);
        return new ModelAndView("productPage", "product", product);
    }

    @RequestMapping(value = "/admin/product/addProduct", method = RequestMethod.POST)
    public String addProduct(@ModelAttribute Product product) {

    }

    public String deleteProduct() {

    }

    public ModelAndView getEditForm() {

    }

    public String editProduct() {

    }

}
