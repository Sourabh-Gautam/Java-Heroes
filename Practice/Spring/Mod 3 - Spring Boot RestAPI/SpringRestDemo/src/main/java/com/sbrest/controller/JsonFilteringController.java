package com.sbrest.controller;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.sbrest.model.DynamicFilterBean;
import com.sbrest.model.StaticFilterBean;

@RestController
public class JsonFilteringController {

	@GetMapping("/static-filter")
	public StaticFilterBean staticFilterBean() {
		return new StaticFilterBean("Value1", "Value2", "Value3");
	}
	
	@GetMapping("/static-filter-2")
	public StaticFilterBean staticFilterBean2() {
		return new StaticFilterBean("Value1", "Value2", "Value3");
	}
	
	@GetMapping("/dynamic-filter")
	public MappingJacksonValue dynamicFilterBean() {
		DynamicFilterBean dynamicFilterBean = new DynamicFilterBean("Value1", "Value2", "Value3");
		return getMappingJacksonValue(dynamicFilterBean, new String[] {"field3"});
	}
	
	@GetMapping("/dynamic-filter-2")
	public MappingJacksonValue dynamicFilterBean2() {
		DynamicFilterBean dynamicFilterBean = new DynamicFilterBean("Value1", "Value2", "Value3");
		return getMappingJacksonValue(dynamicFilterBean, new String[] {"field1", "field2"});
	}
	
	public MappingJacksonValue getMappingJacksonValue(DynamicFilterBean dynamicFilterBean, String... fields) {
		
		MappingJacksonValue jacksonValue = new MappingJacksonValue(dynamicFilterBean);
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept(fields);
		FilterProvider filterProvider = new SimpleFilterProvider().addFilter("DynamicFilterBean", filter );
		jacksonValue.setFilters(filterProvider);
		
		return jacksonValue;
	}
	
}
