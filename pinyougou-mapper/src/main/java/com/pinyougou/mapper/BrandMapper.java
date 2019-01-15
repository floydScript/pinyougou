package com.pinyougou.mapper;

import com.pinyougou.pojo.Brand;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 品牌数据访问接口
 *
 * @author lee.siu.wah
 * @version 1.0
 * <p>File Created at 2017-12-28<p>
 */
public interface BrandMapper {

    @Select("Select * from tb_brand order by id asc")
    List<Brand> findAll();

}
