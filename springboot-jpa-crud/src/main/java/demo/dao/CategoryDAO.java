package demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.pojo.Category;

public interface CategoryDAO extends JpaRepository<Category, Integer> {

    Category findById(Integer id);
}
