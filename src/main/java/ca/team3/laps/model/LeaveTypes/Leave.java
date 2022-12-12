package ca.team3.laps.model.LeaveTypes;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Leave {
    protected int granularity;
    protected int leaveDays;
}
