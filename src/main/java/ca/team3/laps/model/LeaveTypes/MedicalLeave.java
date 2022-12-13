package ca.team3.laps.model.LeaveTypes;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonCreator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class MedicalLeave extends LeaveType {
    @JsonCreator
    public MedicalLeave(long id, float granularity, float leaveDays) {
        super(granularity, leaveDays, "medical");
    }
}
