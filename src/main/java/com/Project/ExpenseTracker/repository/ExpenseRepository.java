package com.Project.ExpenseTracker.repository;

import com.Project.ExpenseTracker.entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {
}
