package com.qa.rest;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import com.qa.business.service.RecipeService;

@Path("/recipe")
public class RecipeEndPoint {
	@Inject
	private RecipeService service;

	@Path("/getAllRecipes")
	@GET
	@Produces({ "application/json" })
	public String getAllRecipes() {
		return service.getAllRecipes();
	}

	@Path("/cycleRecipes")
	@GET
	@Produces({ "application/json" })
	public int cycleRecipes(@PathParam("recipeName") String recipeName) {
		return service.cycleRecipe(recipeName);
	}

	@Path("/getARecipe/{id}")
	@GET
	@Produces({ "application/json" })
	public String getARecipe(@PathParam("id") Long id) {
		return service.getARecipe(id);
	}

	@Path("/createRecipe")
	@POST
	@Produces({ "application/json" })
	public String addRecipe(String recipeName) {
		return service.addrecipe(recipeName);
	}

	public void setService(RecipeService service) {
		this.service = service;
	}

}
