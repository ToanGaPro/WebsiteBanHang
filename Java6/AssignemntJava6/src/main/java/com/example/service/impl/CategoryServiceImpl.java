package com.example.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CategoryDAO;
import com.example.entity.Categories;
import com.example.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	CategoryDAO cateDao;
	@Override
	public List<Categories> findAll() {
		return cateDao.findAll();
	}
	
}
