/*
 * This file is generated by jOOQ.
 */
package com.frank.testData.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


/**
 * 巡检排班_巡检机_映射表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPatrolSystemMappingScheduleDevice implements Serializable {

    private static final long serialVersionUID = -559811947;

    private Long    id;
    private Long    updateBy;
    private Long    updateTime;
    private Long    scheduleId;
    private Long    deviceId;
    private Integer sort;

    public TPatrolSystemMappingScheduleDevice() {}

    public TPatrolSystemMappingScheduleDevice(TPatrolSystemMappingScheduleDevice value) {
        this.id = value.id;
        this.updateBy = value.updateBy;
        this.updateTime = value.updateTime;
        this.scheduleId = value.scheduleId;
        this.deviceId = value.deviceId;
        this.sort = value.sort;
    }

    public TPatrolSystemMappingScheduleDevice(
        Long    id,
        Long    updateBy,
        Long    updateTime,
        Long    scheduleId,
        Long    deviceId,
        Integer sort
    ) {
        this.id = id;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.scheduleId = scheduleId;
        this.deviceId = deviceId;
        this.sort = sort;
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

    public Long getScheduleId() {
        return this.scheduleId;
    }

    public void setScheduleId(Long scheduleId) {
        this.scheduleId = scheduleId;
    }

    public Long getDeviceId() {
        return this.deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getSort() {
        return this.sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TPatrolSystemMappingScheduleDevice (");

        sb.append(id);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(scheduleId);
        sb.append(", ").append(deviceId);
        sb.append(", ").append(sort);

        sb.append(")");
        return sb.toString();
    }
}
