package com.ecommercebackend.javaspring.service;

import com.ecommercebackend.javaspring.dto.ProductResponseDto;
import com.ecommercebackend.javaspring.entity.Category;
import com.ecommercebackend.javaspring.entity.Order;
import com.ecommercebackend.javaspring.entity.Product;
import com.ecommercebackend.javaspring.entity.Store;
import com.ecommercebackend.javaspring.repository.ProductRepository;
import com.ecommercebackend.javaspring.util.ProductDtoConvertion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{


    private CategoryService categoryService;
    private StoreService storeService;


    private ProductRepository productRepository;


    @Autowired
    public ProductServiceImpl(CategoryService categoryService, StoreService storeService, ProductRepository productRepository) {
        this.categoryService = categoryService;
        this.storeService = storeService;

        this.productRepository = productRepository;
    }

    @Override
    public List<ProductResponseDto> getProductList() {
        List<Product> productList = productRepository.findAll();
        return ProductDtoConvertion.convertProductList(productList);
    }

    @Override
    public ProductResponseDto getProductByID(Long id) {
        Optional<Product> optional = productRepository.findById(id);
        if (optional.isPresent()){
            return ProductDtoConvertion.convertProduct(optional.get());
        }
        //TODO id eslesmeme durumu icin Exception firlat
        throw new RuntimeException("eslesen bir product yok");
    }

    @Override
    public ProductResponseDto addProduct(Product product , Long category_id , Long store_id ) {
        //1 Category id ile ilgili Category bul.
        Category category = categoryService.getCategory(category_id);
        Store store = storeService.getStoreInfos(store_id);
        //TODO order service ile order id cekilecek .
        //2. categorynin product listesini yeni product i ekle.
        category.addProduct(product);
        store.addProduct(product);
//        //3 . Product a category i ekle
        product.setCategory(category);
        product.setStore(store);
//
//        //4. product i save et.
         productRepository.save(product);
        return ProductDtoConvertion.convertProduct(product);
    }

    @Override
    public ProductResponseDto deleteProduct(Long id) {
        Optional<Product> optional = productRepository.findById(id);
        if (optional.isPresent()){
            productRepository.delete(optional.get());
            return ProductDtoConvertion.convertProduct(optional.get());
        }
        return null;
        //TODO eslesen bir id bulunmazsa Exception firlat.
    }

    //    @Override
//    public ProductResponseDto save(Long categoryID, Product product) {
//        //1 Category id ile ilgili Category bul.
//       Category category = categoryService.getCategoriesByID(categoryID);
//       //2. categorynin product listesini yeni product i ekle.
//        category.addProduct(product);
//        //3 . Product a category i ekle
//        product.setCategory(category);
//        //4. product i save et.
//        Product savedProduct = productRepository.save(product);
////        return new ProductResponseDto()
//        return null;
//    }
}
