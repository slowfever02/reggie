package com.hth.controller;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hth.common.R;
import com.hth.entity.Category;
import com.hth.service.CategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * 菜品及套餐分类(Category)表控制层
 *
 * @author makejava
 * @since 2023-11-20 23:02:23
 */
@RestController
@RequestMapping("/category")
@Slf4j
public class CategoryController  {
    /**
     * 服务对象
     */
    @Autowired
    private CategoryService categoryService;

    /**
     * 新增菜品
     * @param category
     * @return
     */
    @PostMapping()
    public R<String> save(@RequestBody Category category){
        log.info("category:{}",category);
        categoryService.save(category);
        return R.success("添加菜品成功！");
    }

    /**
     * 分页查询
     * @param page
     * @param pageSize
     * @return
     */
    @GetMapping("/page")
    public R<Page> page(int page, int pageSize){
        log.info("page= {},pageSize= {}",page,pageSize);
        //分页构造器
        Page pageInfo = new Page(page,pageSize);
        //条件查询
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        //添加条件排序，根据sort升序排序
        queryWrapper.orderByAsc(Category::getSort);
        //分页查询
        categoryService.page(pageInfo,queryWrapper);
        return R.success(pageInfo);
    }

    /**
     * 根据id删除菜品分类
     * @param ids
     * @return
     */
    @DeleteMapping()
    public R<String> delete(Long ids){
        log.info("删除分类：id为 {}",ids);
        //categoryService.removeById(ids);
        categoryService.remove(ids);
        return R.success("删除菜品分类成功！");
    }


    /**
     * 根据id修改菜品分类信息
     * @param category
     * @return
     */
    @PutMapping()
    public R<String> update(@RequestBody Category category){
        log.info("修改分类信息: {}",category);
        categoryService.updateById(category);
        return R.success("修改成功！");
    }

    /**
     * 根据条件查询分类数据
     * @param category
     * @return
     */
    @GetMapping("/list")
    public R<List<Category>> list(Category category){
        //条件构造器
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper();
        //查询type
        queryWrapper.eq(category.getType()!=null,Category::getType,category.getType());
        //添加排序
        queryWrapper.orderByAsc(Category::getSort).orderByDesc(Category::getUpdateTime);

        List<Category> list = categoryService.list(queryWrapper);
        return R.success(list);
    }
}

