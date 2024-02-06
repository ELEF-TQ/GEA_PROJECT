package com.gea.green.service;

import com.gea.green.model.Admin;
import com.gea.green.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public boolean authenticateAdmin(String username, String password) {
        // Fetch admin by username from the database
        Admin admin = adminRepository.findByUsername(username);

        // Check if admin exists and if the provided password matches
        return admin != null && admin.getPassword().equals(password);
    }
}
