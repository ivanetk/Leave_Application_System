package ca.team3.laps.model.LeaveTypes;

import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonCreator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CompensationLeave extends LeaveType {

    private float overtimeRatio;

    @JsonCreator
    public CompensationLeave(long id, float granularity, float overtimeRatio) {
        super(granularity, 0, "compensation");
        this.overtimeRatio = overtimeRatio;
    }
}