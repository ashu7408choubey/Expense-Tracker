package com.Project.ExpenseTracker.services.income;

import com.Project.ExpenseTracker.dto.IncomeDTO;
import com.Project.ExpenseTracker.entity.Income;

public interface IncomeService {

    Income postIncome(IncomeDTO incomeDTO);
}
