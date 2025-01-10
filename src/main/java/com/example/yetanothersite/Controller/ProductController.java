package com.example.yetanothersite.Controller;


import com.example.yetanothersite.Model.Product;
import com.example.yetanothersite.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public String GetAllProducts(Model model){
        model.addAttribute("product", new Product());
        return "create_product";
    }

    @GetMapping("/products/edit/{id}")
    public String editProductFrom(@PathVariable Long id, Model model){
        Product product = productService.GetProductById(id);
        model.addAttribute("product", product);
        return "edit_product";
    }

    @PostMapping("/products/{id}")
    public String updateProduct(@PathVariable Long id, @ModelAttribute("product") Product product){
        product.setId(id);
        productService.SaveProduct(product);
        return "redirect:/products";
    }

    @GetMapping("/products/delete/{id}")
    public String deleteProduct(@PathVariable Long id){
        productService.DeleteProduct(id);
        return "redirect:/products";
    }
}
