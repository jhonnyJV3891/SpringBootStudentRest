package com.ejahuira.rest.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejahuira.rest.api.model.Tuition;
import com.ejahuira.rest.api.repository.TuitionRepository;

@Service
public class TuitionServiceImpl implements ITuitionService{
	
	@Autowired
	private TuitionRepository tuitionRepository;

	@Override
	public Tuition save(Tuition tuition) {
		return tuitionRepository.save(tuition);
	}


}
