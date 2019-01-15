package com.pinyougou.sellergoods.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.pinyougou.mapper.BrandMapper;
import com.pinyougou.pojo.Brand;
import com.pinyougou.sellergoods.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//需要制定接口名，产生服务名，不然会用代理类的名称
@Service(interfaceName = "com.pinyougou.sellergoods.service.BrandService")
@Transactional
public class BrandServiceImpl implements BrandService{

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> findAll() {

        return brandMapper.findAll();
    }
}
