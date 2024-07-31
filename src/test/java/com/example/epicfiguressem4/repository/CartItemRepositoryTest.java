//package com.example.epicfiguressem4.repository;
//
//import com.example.epicfiguressem4.EpicFiguresSem4Application;
//import com.example.epicfiguressem4.config.H2JpaConfig;
//import com.example.epicfiguressem4.entities.CartItem;
//import com.example.epicfiguressem4.entities.Product;
//import com.example.epicfiguressem4.entities.ShoppingCart;
//import com.example.epicfiguressem4.entities.User;
//import com.example.epicfiguressem4.repositories.CartItemRepository;
//import com.example.epicfiguressem4.repositories.ProductRepository;
//import com.example.epicfiguressem4.repositories.ShoppingCartRepository;
//import com.example.epicfiguressem4.repositories.UserRepository;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.math.BigDecimal;
//import java.util.HashSet;
//import java.util.Set;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {EpicFiguresSem4Application.class, H2JpaConfig.class})
//@ActiveProfiles("test")
//class CartItemRepositoryTest {
//    @Autowired
//    ProductRepository productRepository;
//    @Autowired
//    UserRepository userRepository;
//    @Autowired
//    CartItemRepository cartItemRepository;
//    @Autowired
//    ShoppingCartRepository shoppingCartRepository;
//    @Test
//    void save(){
//        Product product = new Product();
//        product.setId(1L);
//        product.setPrice(new BigDecimal(300000));
//        product.setDetail("Detail");
//        product.setName("Product 1");
//        productRepository.save(product);
//        User user = new User();
//        user.setId(1);
//        user.setUsername("Test User");
//        userRepository.save(user);
//        ShoppingCart shoppingCart = new ShoppingCart();
//        shoppingCart.setUser(user);
//        Set<CartItem> cartItems = new HashSet<>();
//        CartItem cartItem = new CartItem();
//        cartItem.setProduct(product);
//        cartItem.setShoppingCart(shoppingCart);
//        cartItem.setQuantity(3);
//        cartItem.setTotal(new BigDecimal(3).multiply(product.getPrice()));
//        cartItems.add(cartItem);
////        CartItem a = cartItemRepository.save(cartItem);
//        shoppingCart.setCartItems(cartItems);
//        BigDecimal total = new BigDecimal(0);
//        for (CartItem cartItem1:
//             cartItems) {
//            total = total.add(cartItem1.getTotal());
//        }
//        shoppingCart.setTotal(total);
//        System.out.println((long) shoppingCartRepository.save(shoppingCart).getCartItems().size());
//        System.out.println(cartItemRepository.save(cartItem));
//    }
//}