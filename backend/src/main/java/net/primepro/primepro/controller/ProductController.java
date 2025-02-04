package net.primepro.primepro.controller;

import net.primepro.primepro.dto.ProductDto;
import net.primepro.primepro.entity.Product;
import net.primepro.primepro.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody ProductDto productDto) {
        Product newProduct = productService.addProduct(productDto);
        return ResponseEntity.ok(newProduct);
    }
}
