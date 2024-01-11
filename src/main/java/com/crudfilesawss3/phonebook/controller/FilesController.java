package com.crudfilesawss3.phonebook.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author sergio mendonca
 *
 */

@RestController
@RequestMapping("/v1/phonebook")
public class FilesController {

	private static Logger LOG = LoggerFactory.getLogger(FilesController.class);

	/**
	 * 
	 */


	@GetMapping("/demoLogging")
	public String demoLogging(@RequestParam(required = true, name = "name") final String name) {

		LOG.trace("Ola " + name + " este un logging trace");
		LOG.debug("Ola " + name + " este un logging debug");
		LOG.info("Ola " + name + " este un logging info");
		LOG.warn("Ola " + name + " este un logging warn");
		LOG.error("Ola " + name + " este un logging error");
		
		return " logging con spring boot.";
	}

	/**
	 * 
	 * @param
	 * @return
	 */
	@PostMapping
	public Object save() {
		LOG.info("Started service");
		//return this.something.save();
		return null;
	}

	/**
	 * 
	 * @param id
	 * @param phonebook
	 * @return
	 */
	@PatchMapping("/{id}")
	public Object update(@PathVariable(name = "id") final Long id,
			@RequestBody(required = true) final Object phonebook) {
		LOG.info("Started service");
		//return this.something.save(phonebook);
		return null;
	}


	/**
	 * 
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public Object getById(@PathVariable(name = "id") final Long id) {
		LOG.info("Started service");
		//return this.something.findById(id).get();
		return null;
	}

	/**
	 * 
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable(name = "id") final Long id) {
		LOG.info("Started service");
		//this.phonebookRepository.deleteById(id);

	}
}
