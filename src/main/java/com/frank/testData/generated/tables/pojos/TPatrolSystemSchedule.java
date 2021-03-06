/*
 * This file is generated by jOOQ.
 */
package com.frank.testData.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalDate;

import javax.annotation.Generated;


/**
 * 巡检排班
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPatrolSystemSchedule implements Serializable {

    private static final long serialVersionUID = 351452141;

    private Long      id;
    private Long      updateBy;
    private Long      updateTime;
    private String    name;
    private LocalDate startDate;
    private LocalDate endDate;
    private String    comment;
    private String    allLocation;
    private String    allShiftDays;
    private String    allShiftTimes;
    private Byte      status;
    private String    allSchedulePerson;
    private Boolean   ifInOrder;
    private Boolean   ifRepeatable;
    private String    shift;
    private Long      orgId;
    private Boolean   ifAnyTime;

    public TPatrolSystemSchedule() {}

    public TPatrolSystemSchedule(TPatrolSystemSchedule value) {
        this.id = value.id;
        this.updateBy = value.updateBy;
        this.updateTime = value.updateTime;
        this.name = value.name;
        this.startDate = value.startDate;
        this.endDate = value.endDate;
        this.comment = value.comment;
        this.allLocation = value.allLocation;
        this.allShiftDays = value.allShiftDays;
        this.allShiftTimes = value.allShiftTimes;
        this.status = value.status;
        this.allSchedulePerson = value.allSchedulePerson;
        this.ifInOrder = value.ifInOrder;
        this.ifRepeatable = value.ifRepeatable;
        this.shift = value.shift;
        this.orgId = value.orgId;
        this.ifAnyTime = value.ifAnyTime;
    }

    public TPatrolSystemSchedule(
        Long      id,
        Long      updateBy,
        Long      updateTime,
        String    name,
        LocalDate startDate,
        LocalDate endDate,
        String    comment,
        String    allLocation,
        String    allShiftDays,
        String    allShiftTimes,
        Byte      status,
        String    allSchedulePerson,
        Boolean   ifInOrder,
        Boolean   ifRepeatable,
        String    shift,
        Long      orgId,
        Boolean   ifAnyTime
    ) {
        this.id = id;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.comment = comment;
        this.allLocation = allLocation;
        this.allShiftDays = allShiftDays;
        this.allShiftTimes = allShiftTimes;
        this.status = status;
        this.allSchedulePerson = allSchedulePerson;
        this.ifInOrder = ifInOrder;
        this.ifRepeatable = ifRepeatable;
        this.shift = shift;
        this.orgId = orgId;
        this.ifAnyTime = ifAnyTime;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUpdateBy() {
        return this.updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Long getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getComment() {
        return this.comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getAllLocation() {
        return this.allLocation;
    }

    public void setAllLocation(String allLocation) {
        this.allLocation = allLocation;
    }

    public String getAllShiftDays() {
        return this.allShiftDays;
    }

    public void setAllShiftDays(String allShiftDays) {
        this.allShiftDays = allShiftDays;
    }

    public String getAllShiftTimes() {
        return this.allShiftTimes;
    }

    public void setAllShiftTimes(String allShiftTimes) {
        this.allShiftTimes = allShiftTimes;
    }

    public Byte getStatus() {
        return this.status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getAllSchedulePerson() {
        return this.allSchedulePerson;
    }

    public void setAllSchedulePerson(String allSchedulePerson) {
        this.allSchedulePerson = allSchedulePerson;
    }

    public Boolean getIfInOrder() {
        return this.ifInOrder;
    }

    public void setIfInOrder(Boolean ifInOrder) {
        this.ifInOrder = ifInOrder;
    }

    public Boolean getIfRepeatable() {
        return this.ifRepeatable;
    }

    public void setIfRepeatable(Boolean ifRepeatable) {
        this.ifRepeatable = ifRepeatable;
    }

    public String getShift() {
        return this.shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    public Long getOrgId() {
        return this.orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Boolean getIfAnyTime() {
        return this.ifAnyTime;
    }

    public void setIfAnyTime(Boolean ifAnyTime) {
        this.ifAnyTime = ifAnyTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TPatrolSystemSchedule (");

        sb.append(id);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(name);
        sb.append(", ").append(startDate);
        sb.append(", ").append(endDate);
        sb.append(", ").append(comment);
        sb.append(", ").append(allLocation);
        sb.append(", ").append(allShiftDays);
        sb.append(", ").append(allShiftTimes);
        sb.append(", ").append(status);
        sb.append(", ").append(allSchedulePerson);
        sb.append(", ").append(ifInOrder);
        sb.append(", ").append(ifRepeatable);
        sb.append(", ").append(shift);
        sb.append(", ").append(orgId);
        sb.append(", ").append(ifAnyTime);

        sb.append(")");
        return sb.toString();
    }
}
