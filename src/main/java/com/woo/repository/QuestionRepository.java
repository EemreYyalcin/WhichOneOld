package com.woo.repository;

import java.util.ArrayList;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.woo.domain.Category;
import com.woo.domain.Item;
import com.woo.domain.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

	Question findById(long id);

	Question findByItemAAndItemB(Item itemA, Item itemB);

	ArrayList<Question> findByCategoryAndLevel(Category category, int level);

	ArrayList<Question> findByCategoryAndLevel(Category category, int level, Pageable pageable);

	int countByCategory(Category category);

	int countByCategoryAndLevel(Category category, int level);

}
