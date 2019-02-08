package com.qa.business.service;

public interface RecipeService {

	// C
	String addrecipe(String recipe);

	// R
	String getAllRecipes();

	String getARecipe(Long id);

	// U
	String updateRecipe(String recipeName, Long id);

	// D
	String deleteRecipe(Long id);

	int cycleRecipe(String recipeName);
}
