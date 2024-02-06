package com.gea.green.controller;

import com.gea.green.model.Admin;
import com.gea.green.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    private final AdminService adminService;

    @Autowired
    public AuthController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginAdmin(@RequestBody Admin admin) {
        // Implement your authentication logic here
        // For simplicity, let's assume admin authentication is successful if the username and password match
        boolean isAuthenticated = adminService.authenticateAdmin(admin.getUsername(), admin.getPassword());

        if (isAuthenticated) {
            return ResponseEntity.ok("Admin login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
        }
    }
}
