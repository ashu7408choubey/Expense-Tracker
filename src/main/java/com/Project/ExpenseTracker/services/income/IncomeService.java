package com.Project.ExpenseTracker.services.income;

import com.Project.ExpenseTracker.dto.IncomeDTO;
import com.Project.ExpenseTracker.entity.Income;

import java.util.List;

public interface IncomeService {

    Income postIncome(IncomeDTO incomeDTO);

    List<IncomeDTO> getAllIncome();

    Income updateIncome(Long id, IncomeDTO incomeDTO);

    IncomeDTO getIncomeById(Long id);

    void deleteIncome(Long id);
}
