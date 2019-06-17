package cn.itcast.service;

import cn.itcat.damain.Product;

import java.util.List;

public interface ProductService {

    List<Product> findAll() throws Exception;
}
