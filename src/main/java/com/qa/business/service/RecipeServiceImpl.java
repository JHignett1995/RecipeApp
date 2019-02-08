package com.qa.business.service;

import javax.inject.Inject;

import com.qa.persistence.repository.RecipeRepository;

public class RecipeServiceImpl implements RecipeService {
	@Inject
	private RecipeRepository repo;

	@Override
	public String addrecipe(String recipe) {
		if(recipe.contains("mushrooms")) {
			return "Can't add horrible mushrooms in here, come back when you have the right mushrooms";
		}
		return repo.createRecipe(recipe);
	}

	@Override
	public String getAllRecipes() {
		return repo.getAllRecipes();
	}

	@Override
	public String getARecipe(Long id) {
		return repo.getARecipe(id);
	}

	@Override
	public String updateRecipe(String recipeName, Long id) {
		return repo.updateRecipe(recipeName, id);
	}

	@Override
	public String deleteRecipe(Long id) {
		return repo.deleteRecipe(id);
	}

	@Override
	public int cycleRecipe(String recipeName) {
		return repo.cycleRecipes(recipeName);
	}

}
