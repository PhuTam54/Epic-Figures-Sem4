package com.example.ecommercebe.mapper;

import com.example.ecommercebe.entities.Category;
import com.example.ecommercebe.dto.CategoryDTO;

import java.util.List;
import java.util.stream.Collectors;

public class CategoryMapper {
    public static CategoryDTO toDTO(Category category) {

        List<CategoryDTO> childrenNames = category.getChildren().stream()
                .map(CategoryMapper::toDTO)
                .collect(Collectors.toList());
        Integer parentId = (category.getParent() != null) ? category.getParent().getId() : null;
        return new CategoryDTO(category.getId(), category.getName(), parentId, childrenNames);
    }
}
