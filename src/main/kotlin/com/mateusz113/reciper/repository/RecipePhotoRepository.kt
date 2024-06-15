package com.mateusz113.reciper.repository

import com.mateusz113.reciper.entity.RecipePhoto
import org.springframework.data.jpa.repository.JpaRepository

interface RecipePhotoRepository : JpaRepository<RecipePhoto, Long>