package com.china.HealthHut.service;

import java.util.List;

import com.china.HealthHut.pojo.RecipeMain;

public interface RecipeMainService {

	List<RecipeMain> findRecipeMainList(int page, int limit);

	RecipeMain findRecipeMainById(int id);

	int findRecipeMainAll();

	int updateRecipeMain(RecipeMain recipeMain);

	int createRecipeMain(RecipeMain recipeMain);

	int deleteRecipeMain(int id);

	int updateUsers(RecipeMain recipeMain);

}
