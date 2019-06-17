package cn.itcast.service.impl;

import cn.itcast.dao.ProductDao;
import cn.itcast.service.ProductService;
import cn.itcat.damain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao dao;

    @Override
    public List<Product> findAll() throws Exception {
        return dao.findAll();
    }
}
