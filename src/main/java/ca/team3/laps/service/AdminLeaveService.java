package ca.team3.laps.service;

import java.util.List;

import ca.team3.laps.exception.AdminException;
import ca.team3.laps.model.LeaveTypes.AnnualLeave;
import ca.team3.laps.model.LeaveTypes.CompensationLeave;
import ca.team3.laps.model.LeaveTypes.Leave;
import ca.team3.laps.model.LeaveTypes.MedicalLeave;

public interface AdminLeaveService {

    AnnualLeave createAnnualLeaveEntitlement(AnnualLeave annualLeave) throws AdminException;

    AnnualLeave modifyAnnualLeaveEntitlement(AnnualLeave annualLeave) throws AdminException;

    void deleteAnnualLeaveEntitlement(AnnualLeave annualLeave) throws AdminException;

    MedicalLeave createMedicalLeaveEntitlement(MedicalLeave medicalLeave) throws AdminException;

    MedicalLeave modifyMedicalLeaveEntitlement(MedicalLeave medicalLeave) throws AdminException;

    MedicalLeave getMedicalLeaveEntitlement();

    CompensationLeave createCompensationLeave(CompensationLeave compensationLeave) throws AdminException;

    CompensationLeave modifyCompensationLeave(CompensationLeave compensationLeave) throws AdminException;

    CompensationLeave getCompLeaveEntitlement();

    List<AnnualLeave> getAnnualLeaveEntitlements();

    List<Leave> getAllLeaveEntitlements();

}
