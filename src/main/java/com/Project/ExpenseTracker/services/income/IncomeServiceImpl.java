package com.Project.ExpenseTracker.services.income;

import com.Project.ExpenseTracker.dto.IncomeDTO;
import com.Project.ExpenseTracker.entity.Income;
import com.Project.ExpenseTracker.repository.IncomeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IncomeServiceImpl implements IncomeService{

    private final IncomeRepository incomeRepository;

    public Income postIncome(IncomeDTO incomeDTO){
        return saveOrUpdateIncome(new Income(), incomeDTO);
    }

    private Income saveOrUpdateIncome(Income income, IncomeDTO incomeDTO){
        income.setTitle(incomeDTO.getTitle());
        income.setDate(incomeDTO.getDate());
        income.setCategory(incomeDTO.getCategory());
        income.setDescription(incomeDTO.getDescription());

        return incomeRepository.save(income);
    }
}
