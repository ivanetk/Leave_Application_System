package ca.team3.laps.model.LeaveTypes;

import javax.persistence.Entity;

import org.springframework.context.annotation.EnableLoadTimeWeaving;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class MedicalLeave extends Leave {
    private int granularity;
}
