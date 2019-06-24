package com.china.HealthHut.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.china.HealthHut.pojo.RecipeMain;

public interface RecipeMainMapper {
	// 查询所有
	List<RecipeMain> findRecipeMainAll();
	// 更新
	int updateRecipeMain(RecipeMain recipeMain);
	// 新增
	int createRecipeMain(RecipeMain recipeMain);
	// 根据id删除
	int deleteRecipeMain(int id);
	// 分页查询
	List<RecipeMain> findRecipeMainList(RowBounds rowBounds);
	// 通过id查询
	RecipeMain findRecipeMainById(int id);
	

}
