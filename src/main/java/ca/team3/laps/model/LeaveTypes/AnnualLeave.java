package ca.team3.laps.model.LeaveTypes;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonCreator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class AnnualLeave extends Leave {
    @Column (nullable = false)
    private String jobTitle;

    @JsonCreator
    public AnnualLeave(float granularity, float leaveDays, String jobTitle) {
        super(granularity, leaveDays, "annual");
        this.jobTitle = jobTitle;
    };
}
