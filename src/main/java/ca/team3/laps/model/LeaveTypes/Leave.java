package ca.team3.laps.model.LeaveTypes;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@NoArgsConstructor
public abstract class Leave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private float granularity;
    private float leaveDays;
    protected String type;
    
    public Leave(float granularity, float leaveDays, String type) {
        this.granularity = granularity;
        this.leaveDays = leaveDays;
        this.type = type;
    }
}
