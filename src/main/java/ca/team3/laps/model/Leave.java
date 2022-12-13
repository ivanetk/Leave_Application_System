package ca.team3.laps.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name="Leave_Application")
public class Leave {
    @Id
    @Column(name="leave_id",nullable=false)
    private String id;

    @Column(name="leaveType",nullable = false)
    private String type;

    private float startDate;

    private float endDate;

    private int period;

    private String status;

    @Column(name="rejectReason",nullable = true)
    private String reason;

    @Column(name="workDissemination")
    private String work;

    @ManyToOne
    @JoinColumn(name="staff_id")
    private Staff staff;

    public Leave(String type,float startDate,float endDate,int period,
        String status,String reason, String work){ 

        this.id = UUID.randomUUID().toString().substring(0,8);
        this.type=type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.period = period;
        this.status = status;
        this.reason = reason;
        this.work = work;
    }
}
