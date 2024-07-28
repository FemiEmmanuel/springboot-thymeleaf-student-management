package com.oluwafemi.studentapp.service;

import org.springframework.stereotype.Service;

import com.oluwafemi.studentapp.model.Admin;
import com.oluwafemi.studentapp.repository.AdminRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final AdminRepository adminRepository;

    public Admin createAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public Admin getAdminById(Long id) {
        return adminRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Admin not found"));
    }

    public Admin updateAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }
}
