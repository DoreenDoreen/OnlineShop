package onlineShop.controller;

import onlineShop.entity.Cart;
import onlineShop.entity.Customer;
import onlineShop.service.CartService;
import onlineShop.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private CartService cartService;

    @RequestMapping(value = "/cart/getCardById", method = RequestMethod.GET)
    public ModelAndView getCardId() {
        ModelAndView modelAndView = new ModelAndView("cart");
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        String currentPrincipleName = authentication.getName();
        Customer customer = customerService.getCustomer(currentPrincipleName);

        modelAndView.addObject("cardId", customer.getCart().getId());
        return modelAndView;
    }

    @RequestMapping(value = "/cart/getCart/{cartId}", method = RequestMethod.GET)
    @ResponseBody
    public Cart getCartItems(@PathVariable(value = "cartId") int cartId) {
        return cartService.getCartById(cartId);
    }


}
