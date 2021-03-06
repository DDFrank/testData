/*
 * This file is generated by jOOQ.
 */
package com.frank.testData.generated.tables.pojos;


import java.io.Serializable;
import java.time.LocalTime;

import javax.annotation.Generated;


/**
 * 巡检排班周期表 巡检排班的具体的任务
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPatrolSystemScheduleShift implements Serializable {

    private static final long serialVersionUID = 154570336;

    private Long      id;
    private Long      updateBy;
    private Long      updateTime;
    private LocalTime startTime;
    private LocalTime endTime;
    private Long      scheduleId;

    public TPatrolSystemScheduleShift() {}

    public TPatrolSystemScheduleShift(TPatrolSystemScheduleShift value) {
        this.id = value.id;
        this.updateBy = value.updateBy;
        this.updateTime = value.updateTime;
        this.startTime = value.startTime;
        this.endTime = value.endTime;
        this.scheduleId = value.scheduleId;
    }

    public TPatrolSystemScheduleShift(
        Long      id,
        Long      updateBy,
        Long      updateTime,
        LocalTime startTime,
        LocalTime endTime,
        Long      scheduleId
    ) {
        this.id = id;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.startTime = startTime;
        this.endTime = endTime;
        this.scheduleId = scheduleId;
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

    public LocalTime getStartTime() {
        return this.startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return this.endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public Long getScheduleId() {
        return this.scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TPatrolSystemScheduleShift (");

        sb.append(id);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(startTime);
        sb.append(", ").append(endTime);
        sb.append(", ").append(scheduleId);

        sb.append(")");
        return sb.toString();
    }
}
