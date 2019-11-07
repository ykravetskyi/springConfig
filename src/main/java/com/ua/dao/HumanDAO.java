package com.ua.dao;

import com.ua.entity.Human;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HumanDAO extends JpaRepository<Human, Integer> {
}
