package ca.team3.laps.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.team3.laps.model.Staff;
import ca.team3.laps.repository.StaffRepo;

@Service
public class AdminStaffServiceImpl implements AdminStaffService {

    @Autowired
    StaffRepo staffRepo;

    @Override
    public List<Staff> findAllStaff() {
        return staffRepo.findAll();
    }

    @Override
    public Staff findStaffById(long id) {
        return staffRepo.findByStfId(id);
    }

    @Override
    public void createStaff(Staff staff) {
        createAccount(staff);
        staffRepo.save(staff);
    }

    @Override
    public void modifyStaff(Staff staff) {
        Staff staffRec = staffRepo.findByStfId(staff.getStfId());
        staffRec.setRoleId(staff.getRoleId());
        staffRepo.save(staffRec);
    }

    @Override
    public void deleteStaff(Staff staff) {
        Staff staffRec = staffRepo.findByStfId(staff.getStfId());
        staffRec.setStatus(false);
        staffRepo.save(staffRec);
    }

    @Override
    public void updateAnLeaveEntitlement(Staff staff) {
        Staff staffRec = staffRepo.findByStfId(staff.getStfId());
        staffRec.setAnuLeave(staff.getAnuLeave());
        staffRepo.save(staffRec);
    }

    //Utils
    private void createAccount(Staff staff) {
        staff.setUsername(generateUsername(staff));
        staff.setPassword(generatePassword());
        staff.setStatus(true);
    }

    private String generateUsername(Staff staff) {
        String firstName = staff.getFirstname();
        String lastName = staff.getLastname();
        if (firstName == null || firstName.isEmpty()) {
            return lastName;
        } else if (lastName == null || lastName.isEmpty()) {
            return firstName;
        } else {
            return firstName + "." + lastName;
        }
    }

    private String generatePassword() {
        Random rnd = new Random();
        char[] password = new char[8];
        for (int i = 0; i < password.length; i++) {
            password[i] = (char) (rnd.nextInt(90) + 33);
        }
        return String.copyValueOf(password);
    }
}
