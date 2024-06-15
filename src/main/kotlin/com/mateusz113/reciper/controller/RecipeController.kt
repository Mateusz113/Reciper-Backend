package com.mateusz113.reciper.controller

import com.mateusz113.reciper.dto.RecipeDTO
import com.mateusz113.reciper.entity.Recipe
import com.mateusz113.reciper.service.RecipeService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("api/v1/recipes")
class RecipeController @Autowired constructor(
    private val recipeService: RecipeService
) {
    @PostMapping
    fun createRecipe(
        @RequestBody recipeDTO: RecipeDTO,
        @RequestParam("photos") photos: List<MultipartFile>
    ): ResponseEntity<String>? {
        // TODO: Write a code to add photos and recipe to DB
        return null
    }


    @GetMapping("id")
    fun getRecipeFromId(
        @RequestParam id: Long
    ): ResponseEntity<Recipe>? {
        // TODO: Code to get recipe from a database using ID
        return null
    }

    @PutMapping
    fun updateRecipe(
        @RequestBody recipe: Recipe
    ): ResponseEntity<String>? {
        // TODO: Code to update the recipe with the new information provided
        return null
    }

    @DeleteMapping
    fun deleteRecipe(
        @RequestParam id: Long
    ): ResponseEntity<String>? {
        // TODO: Code to delete recipe with given ID
        return null
    }
}