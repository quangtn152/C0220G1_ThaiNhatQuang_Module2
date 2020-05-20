package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String showProduct(Model model) {
        model.addAttribute("list", productService.findAll());
        return "show";
    }

    @GetMapping("/create")
    public String createProduct() {
        return "create";
    }

    @PostMapping("/created")
    public String showCreateProduct(@RequestParam String id, String name, String price, String photo,
                                    Model model) {
        productService.create(Integer.parseInt(id), new Product(Integer.parseInt(id), name, Integer.parseInt(price), photo));
        model.addAttribute("success", "Them san pham thanh cong");
        model.addAttribute("list", productService.findAll());
        return "show";
    }

    @GetMapping("/edit/{id}")
    public String editProduct(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "edit";
    }

    @PostMapping("/edit")
    public String showEditProduct(@RequestParam String id, String name, String price, String photo,
                                  Model model) {
        productService.update(Integer.parseInt(id), new Product(Integer.parseInt(id), name, Integer.parseInt(price), photo));
        model.addAttribute("list", productService.findAll());
        model.addAttribute("success", "Sua san pham thanh cong");
        return "show";
    }

    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String showDeleteProduct(@RequestParam String id, Model model) {
        productService.remove(Integer.parseInt(id));
        model.addAttribute("list", productService.findAll());
        model.addAttribute("success", "Xoa san pham thanh cong");
        return "show";
    }

    @GetMapping("/view/{id}")
    public String viewProduct(@PathVariable int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        return "view";
    }


    @GetMapping("/find")
    public String findProduct() {
        return "find";
    }

    @PostMapping("/finded")
    public String showfindProduct(@RequestParam String name, Model model) {
        model.addAttribute("product", productService.findByName(name));
        return "view";
    }
}
