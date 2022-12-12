package ca.team3.laps.model.LeaveTypes;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class AnnualLeave extends Leave {
    private String jobTitle;
}
