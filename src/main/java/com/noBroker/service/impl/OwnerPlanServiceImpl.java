package com.noBroker.service.impl;

import com.noBroker.entity.OwnerPlan;
import com.noBroker.payload.OwnerPlanDto;
import com.noBroker.repository.OwnerPlanRepository;
import com.noBroker.service.OwnerPlanService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;


@Service
public class OwnerPlanServiceImpl implements OwnerPlanService {
    String HELLO = "Hello";
    private ModelMapper modelMapper;
    private OwnerPlanRepository ownerPlanRepository;

    public OwnerPlanServiceImpl(ModelMapper modelMapper,OwnerPlanRepository ownerPlanRepository) {
        this.modelMapper = modelMapper;
        this.ownerPlanRepository=ownerPlanRepository;
    }

    @Override
    public OwnerPlanDto createOwnerPlans(OwnerPlanDto ownerPlanDto) {
        OwnerPlan ownerPlan = mapToEntity(ownerPlanDto);
        OwnerPlan savedOwner = ownerPlanRepository.save(ownerPlan);
        OwnerPlanDto resDto = mapToDto(savedOwner);
        return resDto;
    }

     OwnerPlan mapToEntity(OwnerPlanDto ownerPlanDto) {
        OwnerPlan ownerPlan = modelMapper.map(ownerPlanDto, OwnerPlan.class);
        return ownerPlan;

    }

    OwnerPlanDto mapToDto(OwnerPlan ownerPlan){
        OwnerPlanDto dto = modelMapper.map(ownerPlan, OwnerPlanDto.class);
        return dto;
    }

}
