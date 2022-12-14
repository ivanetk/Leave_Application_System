package ca.team3.laps.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import ca.team3.laps.model.LeaveTypes.LeaveType;

import javax.persistence.JoinColumn;


@Entity
public class Staff {


    @Id
    @Column(name="staff_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long stfId;

    @Column(name = "managerid")
    private String managerId;

    public long getStfId() {
        return stfId;
    }

    public void setStfId(long stfId) {
        this.stfId = stfId;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnuLeave() {
        return anuLeave;
    }

    public void setAnuLeave(int anuLeave) {
        this.anuLeave = anuLeave;
    }

    public int getMediLeave() {
        return mediLeave;
    }

    public void setMediLeave(int mediLeave) {
        this.mediLeave = mediLeave;
    }

    public int getCompLeave() {
        return compLeave;
    }

    public void setCompLeave(int compLeave) {
        this.compLeave = compLeave;
    }

    public List<LeaveType> getLTSet() {
        return LTSet;
    }

    public void setLTSet(List<LeaveType> lTSet) {
        LTSet = lTSet;
    }

    private String username;

    private String password;

    @Column(name = "role_id", nullable = false)
    private int roleId;

    @Column(name="job_title", nullable = false)
    private String title;

    private String firstname;

    private String lastname;

    private boolean status;

    private String email;

    @Column(name="annual_leave_entitlement", nullable = false)
	private int anuLeave;

	@Column(name="medi_requested_entitlement", nullable = false)
    private int mediLeave;

	@Column(name="comp_requested_entitlement", nullable = false)
    private int compLeave;

    @OneToMany(mappedBy = "leave")
	private List<Leave> staffLeave;

    @ManyToMany(targetEntity = LeaveType.class,cascade = {CascadeType.ALL, CascadeType.PERSIST}, fetch=FetchType.EAGER)
    @JoinTable(name = "StaffAndLeaveType", joinColumns = {
        @JoinColumn(name="staff_id", referencedColumnName = "staff_id")},
        inverseJoinColumns = { @JoinColumn(name="LTid", referencedColumnName = "id")}
        )
        private List<LeaveType> LTSet;


    public Staff(){}
    
    public Staff(long stfId, String managerId, String username, String password, int roleId, String title,
            String firstname, String lastname, boolean status, String email, int anuLeave, int mediLeave,
            int compLeave) {
        this.stfId = stfId;
        this.managerId = managerId;
        this.username = username;
        this.password = password;
        this.roleId = roleId;
        this.title = title;
        this.firstname = firstname;
        this.lastname = lastname;
        this.status = status;
        this.email = email;
        this.anuLeave = anuLeave;
        this.mediLeave = mediLeave;
        this.compLeave = compLeave;
    }
    

}
