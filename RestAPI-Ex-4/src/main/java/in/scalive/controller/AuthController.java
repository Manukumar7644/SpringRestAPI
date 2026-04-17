package in.scalive.controller;

import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import in.scalive.model.ErrorResponse;
import in.scalive.model.Student;

@RestController
@RequestMapping(value="/api")
public class AuthController {

	@PostMapping("/login")
	public String login() {
		return "login successfull";
	}
	@PostMapping("/logout")
	public String logout() {
		return "logout successfull";
	}
}
