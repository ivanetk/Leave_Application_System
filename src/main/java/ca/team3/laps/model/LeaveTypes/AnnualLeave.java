package ca.team3.laps.model.LeaveTypes;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class AnnualLeave extends Leave {
    @Id
    private String jobTitle;
}
