package com.china.HealthHut.service.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.china.HealthHut.mapper.RecipeMainMapper;
import com.china.HealthHut.pojo.RecipeMain;
import com.china.HealthHut.service.RecipeMainService;

@Service
public class RecipeMainServiceImpl implements RecipeMainService {

	@Autowired
	private RecipeMainMapper recipeMainMapper;

	// 分页查询
	@Override
	public List<RecipeMain> findRecipeMainList(int page, int limit) {
		List<RecipeMain> recipeMains = this.recipeMainMapper.findRecipeMainList(new RowBounds(page, limit));
		return recipeMains;
	}

	// 根据id查找
	@Override
	public RecipeMain findRecipeMainById(int id) {
		RecipeMain recipeMain = this.recipeMainMapper.findRecipeMainById(id);
		return recipeMain;
	}

	// 根据id删除
	@Override
	public int deleteRecipeMain(int id) {
		return this.recipeMainMapper.deleteRecipeMain(id);
	}

	// 新增
	@Override
	public int createRecipeMain(RecipeMain recipeMain) {
		return this.recipeMainMapper.createRecipeMain(recipeMain);
	}

	// 更新
	@Override
	public int updateRecipeMain(RecipeMain recipeMain) {
		return this.recipeMainMapper.updateRecipeMain(recipeMain);
	}

	// 获得数据页数
	@Override
	public int findRecipeMainAll() {
		List<RecipeMain> recipeMains = this.recipeMainMapper.findRecipeMainAll();
		int yeshu = recipeMains.size() / 9;
		if (recipeMains.size() % 9 > 0) {
			yeshu++;
		}
		return yeshu;
	}

	@Override
	public int updateUsers(RecipeMain recipeMain) {
		return this.recipeMainMapper.updateRecipeMain(recipeMain);
	}

}
