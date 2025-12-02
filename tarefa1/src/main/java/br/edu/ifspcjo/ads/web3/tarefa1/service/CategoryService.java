package br.edu.ifspcjo.ads.web3.tarefa1.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.edu.ifspcjo.ads.web3.tarefa1.domain.model.Category;
import br.edu.ifspcjo.ads.web3.tarefa1.repository.CategoryRepository;

@Service
public class CategoryService {
    
    @Autowired
    private CategoryRepository categoryRepository;

    public Category update(Long id, Category category) {
       
        Category categorySaved = categoryRepository.findById(id)
                .orElseThrow(() -> new EmptyResultDataAccessException(1));

        
        BeanUtils.copyProperties(category, categorySaved, "id");

        return categoryRepository.save(categorySaved);
    }
}
