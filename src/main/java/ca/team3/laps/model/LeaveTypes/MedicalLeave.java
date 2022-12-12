package ca.team3.laps.model.LeaveTypes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class MedicalLeave extends Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
