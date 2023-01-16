package com.sbrest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sbrest.model.Name;
import com.sbrest.model.PersonV1;
import com.sbrest.model.PersonV2;

@RestController
public class VersioningController {

	// URI Versioning - Twitter
	
	@GetMapping("/v1/person")
	public PersonV1 getPersonV1() {
		return new PersonV1("Sumit Gond");
	}
	
	@GetMapping("/v2/person")
	public PersonV2 getPersonV2() {
		return new PersonV2(new Name("Sumit", "Gond"));
	}
	
	// Request Parameter Versioning - Amazon
	
	@GetMapping(value = "/person", params = "version=1")
	public PersonV1 getPersonV1RequestParam() {
		return new PersonV1("Sumit Gond");
	}
	
	@GetMapping(value = "/person", params = "version=2")
	public PersonV2 getPersonV2RequestParam() {
		return new PersonV2(new Name("Sumit", "Gond"));
	}
	
	// Header Versioning - Microsoft
	
	@GetMapping(value = "/person", headers = "X-API-VERSION=1")
	public PersonV1 getPersonV1Header() {
		return new PersonV1("Sumit Gond");
	}
	
	@GetMapping(value = "/person", headers = "X-API-VERSION=2")
	public PersonV2 getPersonV2Header() {
		return new PersonV2(new Name("Sumit", "Gond"));
	}
	
	// Media Type Versioning - GitHub
	
	@GetMapping(value = "/person", produces = "application/v1+xml")
	public PersonV1 getPersonV1MediaType() {
		return new PersonV1("Sumit Gond");
	}
	
	@GetMapping(value = "/person", produces = "application/v2+json")
	public PersonV2 getPersonV2MediaType() {
		return new PersonV2(new Name("Sumit", "Gond"));
	}
	
}
