/*
 * This file is generated by jOOQ.
 */
package com.frank.testData.generated.tables.records;


import com.frank.testData.generated.tables.TPatrolSystemMappingScheduleDevice;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


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
public class TPatrolSystemMappingScheduleDeviceRecord extends UpdatableRecordImpl<TPatrolSystemMappingScheduleDeviceRecord> implements Record6<Long, Long, Long, Long, Long, Integer> {

    private static final long serialVersionUID = -420908357;

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_mapping_schedule_device.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_mapping_schedule_device.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_mapping_schedule_device.update_by</code>.
     */
    public void setUpdateBy(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_mapping_schedule_device.update_by</code>.
     */
    public Long getUpdateBy() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_mapping_schedule_device.update_time</code>.
     */
    public void setUpdateTime(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_mapping_schedule_device.update_time</code>.
     */
    public Long getUpdateTime() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_mapping_schedule_device.schedule_id</code>. 巡检排班id
     */
    public void setScheduleId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_mapping_schedule_device.schedule_id</code>. 巡检排班id
     */
    public Long getScheduleId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_mapping_schedule_device.device_id</code>. 巡检机id
     */
    public void setDeviceId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_mapping_schedule_device.device_id</code>. 巡检机id
     */
    public Long getDeviceId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_mapping_schedule_device.sort</code>.
     */
    public void setSort(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_mapping_schedule_device.sort</code>.
     */
    public Integer getSort() {
        return (Integer) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, Long, Long, Long, Integer> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row6<Long, Long, Long, Long, Long, Integer> valuesRow() {
        return (Row6) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TPatrolSystemMappingScheduleDevice.T_PATROL_SYSTEM_MAPPING_SCHEDULE_DEVICE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TPatrolSystemMappingScheduleDevice.T_PATROL_SYSTEM_MAPPING_SCHEDULE_DEVICE.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return TPatrolSystemMappingScheduleDevice.T_PATROL_SYSTEM_MAPPING_SCHEDULE_DEVICE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return TPatrolSystemMappingScheduleDevice.T_PATROL_SYSTEM_MAPPING_SCHEDULE_DEVICE.SCHEDULE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return TPatrolSystemMappingScheduleDevice.T_PATROL_SYSTEM_MAPPING_SCHEDULE_DEVICE.DEVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return TPatrolSystemMappingScheduleDevice.T_PATROL_SYSTEM_MAPPING_SCHEDULE_DEVICE.SORT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component2() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component3() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component4() {
        return getScheduleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getDeviceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getUpdateBy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getUpdateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value4() {
        return getScheduleId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getDeviceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getSort();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemMappingScheduleDeviceRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemMappingScheduleDeviceRecord value2(Long value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemMappingScheduleDeviceRecord value3(Long value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemMappingScheduleDeviceRecord value4(Long value) {
        setScheduleId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemMappingScheduleDeviceRecord value5(Long value) {
        setDeviceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemMappingScheduleDeviceRecord value6(Integer value) {
        setSort(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemMappingScheduleDeviceRecord values(Long value1, Long value2, Long value3, Long value4, Long value5, Integer value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TPatrolSystemMappingScheduleDeviceRecord
     */
    public TPatrolSystemMappingScheduleDeviceRecord() {
        super(TPatrolSystemMappingScheduleDevice.T_PATROL_SYSTEM_MAPPING_SCHEDULE_DEVICE);
    }

    /**
     * Create a detached, initialised TPatrolSystemMappingScheduleDeviceRecord
     */
    public TPatrolSystemMappingScheduleDeviceRecord(Long id, Long updateBy, Long updateTime, Long scheduleId, Long deviceId, Integer sort) {
        super(TPatrolSystemMappingScheduleDevice.T_PATROL_SYSTEM_MAPPING_SCHEDULE_DEVICE);

        set(0, id);
        set(1, updateBy);
        set(2, updateTime);
        set(3, scheduleId);
        set(4, deviceId);
        set(5, sort);
    }
}
