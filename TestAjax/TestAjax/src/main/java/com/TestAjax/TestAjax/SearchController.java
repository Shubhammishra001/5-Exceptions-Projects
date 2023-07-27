package com.TestAjax.TestAjax;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class SearchController {
	 UserService userService;

	    @Autowired
	    
	    public void setUserService(UserService userService) {
	        this.userService = userService;
	    }
//	    @RequestMapping("/") 
//	    public String hello() {
//	        return "ajax";
//	    }
	

	    @PostMapping("/api/search")
	    public ResponseEntity<?> getSearchResultViaAjax(
	            @Validated @RequestBody SearchCriteria search, Errors errors) {

	        AjaxResponseBody result = new AjaxResponseBody();

	        //If error, just return a 400 bad request, along with the error message
	        if (errors.hasErrors()) {

	            result.setMsg(errors.getAllErrors()
	                        .stream().map(x -> x.getDefaultMessage())
	                        .collect(Collectors.joining(",")));

	            return ResponseEntity.badRequest().body(result);

	        }

	        List<User> users = userService.findByUserNameOrEmail(search.getUsername());
	        if (users.isEmpty()) {
	            result.setMsg("no user found!");
	        } else {
	            result.setMsg("success");
	        }
	        result.setResult(users);

	        return ResponseEntity.ok(result);

	    }
}
