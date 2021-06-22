package onlineShop.controller;

import onlineShop.dao.CartItemDao;
import onlineShop.entity.Cart;
import onlineShop.entity.CartItem;
import onlineShop.service.CartItemService;
import onlineShop.service.CustomerService;
import onlineShop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

@Controller
public class CartItemController {

    @Autowired
    private CartService cartService;

    @Autowired
    private CartItemService cartItemService;

    @Autowired
    private CustomerService customerService;

    @Autowired
    public ProductService productService;

    


}
