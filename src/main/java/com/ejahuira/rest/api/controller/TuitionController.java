package com.ejahuira.rest.api.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejahuira.rest.api.dto.TuitionDto;
import com.ejahuira.rest.api.model.Tuition;
import com.ejahuira.rest.api.service.ITuitionService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/tuition")
@RequiredArgsConstructor
public class TuitionController {
	
	private ITuitionService tuitionService;
	
	@Qualifier("tuitionMapper")
	private ModelMapper mapper;
	
	@PostMapping("/save")
	public ResponseEntity<TuitionDto> create(@Valid @RequestBody TuitionDto dto) throws Exception{
		Tuition obj = tuitionService.save(convertToEntity(dto));		
		return new ResponseEntity<>(convertToDto(obj), HttpStatus.CREATED); 
	}
	
	private TuitionDto convertToDto(Tuition obj) {
        return mapper.map(obj, TuitionDto.class);
    }

    private Tuition convertToEntity(TuitionDto dto){
        return mapper.map(dto, Tuition.class);
    }
    
}
