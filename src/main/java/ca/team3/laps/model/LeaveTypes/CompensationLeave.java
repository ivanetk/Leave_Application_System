package ca.team3.laps.model.LeaveTypes;

import javax.persistence.Entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class CompensationLeave extends Leave {
    private double overtimeRatio;
}