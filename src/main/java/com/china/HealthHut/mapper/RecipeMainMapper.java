package com.china.HealthHut.mapper;

import java.util.List;

import org.apache.ibatis.session.RowBounds;

import com.china.HealthHut.pojo.RecipeMain;

public interface RecipeMainMapper {

	List<RecipeMain> findRecipeMainAll();

	int updateRecipeMain(RecipeMain recipeMain);

	int createRecipeMain(RecipeMain recipeMain);

	int deleteRecipeMain(int id);

	List<RecipeMain> findRecipeMainList(RowBounds rowBounds);

	RecipeMain findRecipeMainById(int id);

//	List<RecipeMain> findRecipeMainList(RowBounds rowBounds);
//
//	// 查询所有
//	List<RecipeMain> findRecipeMainAll();
//
//	// 通过id查询
//	RecipeMain findRecipeMainById(int id);
//
//	// 新增
//	int createRecipeMain(RecipeMain recipeMain);
//
//	// 根据id删除
//	int deleteRecipeMain(int id);
//
//	// 更新
//	int updateRecipeMain(RecipeMain recipeMain);

}
