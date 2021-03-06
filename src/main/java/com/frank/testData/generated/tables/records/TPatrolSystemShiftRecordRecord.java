/*
 * This file is generated by jOOQ.
 */
package com.frank.testData.generated.tables.records;


import com.frank.testData.generated.tables.TPatrolSystemShiftRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 巡检地点记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPatrolSystemShiftRecordRecord extends UpdatableRecordImpl<TPatrolSystemShiftRecordRecord> implements Record7<Long, Long, Long, Long, Integer, Long, Long> {

    private static final long serialVersionUID = -1798315932;

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_shift_record.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_shift_record.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_shift_record.update_by</code>.
     */
    public void setUpdateBy(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_shift_record.update_by</code>.
     */
    public Long getUpdateBy() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_shift_record.update_time</code>.
     */
    public void setUpdateTime(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_shift_record.update_time</code>.
     */
    public Long getUpdateTime() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_shift_record.check_time</code>. 巡检时间
     */
    public void setCheckTime(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_shift_record.check_time</code>. 巡检时间
     */
    public Long getCheckTime() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_shift_record.status</code>. 0 未开始 1 已完成 2 执行中 3 失败 4 异常
     */
    public void setStatus(Integer value) {
        set(4, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_shift_record.status</code>. 0 未开始 1 已完成 2 执行中 3 失败 4 异常
     */
    public Integer getStatus() {
        return (Integer) get(4);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_shift_record.schedule_record_id</code>. 巡检记录主键
     */
    public void setScheduleRecordId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_shift_record.schedule_record_id</code>. 巡检记录主键
     */
    public Long getScheduleRecordId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_shift_record.device_id</code>. 巡检机主键
     */
    public void setDeviceId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_shift_record.device_id</code>. 巡检机主键
     */
    public Long getDeviceId() {
        return (Long) get(6);
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
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, Long, Integer, Long, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<Long, Long, Long, Long, Integer, Long, Long> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TPatrolSystemShiftRecord.T_PATROL_SYSTEM_SHIFT_RECORD.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TPatrolSystemShiftRecord.T_PATROL_SYSTEM_SHIFT_RECORD.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return TPatrolSystemShiftRecord.T_PATROL_SYSTEM_SHIFT_RECORD.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field4() {
        return TPatrolSystemShiftRecord.T_PATROL_SYSTEM_SHIFT_RECORD.CHECK_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field5() {
        return TPatrolSystemShiftRecord.T_PATROL_SYSTEM_SHIFT_RECORD.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return TPatrolSystemShiftRecord.T_PATROL_SYSTEM_SHIFT_RECORD.SCHEDULE_RECORD_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field7() {
        return TPatrolSystemShiftRecord.T_PATROL_SYSTEM_SHIFT_RECORD.DEVICE_ID;
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
        return getCheckTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getScheduleRecordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component7() {
        return getDeviceId();
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
        return getCheckTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value5() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getScheduleRecordId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value7() {
        return getDeviceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemShiftRecordRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemShiftRecordRecord value2(Long value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemShiftRecordRecord value3(Long value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemShiftRecordRecord value4(Long value) {
        setCheckTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemShiftRecordRecord value5(Integer value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemShiftRecordRecord value6(Long value) {
        setScheduleRecordId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemShiftRecordRecord value7(Long value) {
        setDeviceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemShiftRecordRecord values(Long value1, Long value2, Long value3, Long value4, Integer value5, Long value6, Long value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TPatrolSystemShiftRecordRecord
     */
    public TPatrolSystemShiftRecordRecord() {
        super(TPatrolSystemShiftRecord.T_PATROL_SYSTEM_SHIFT_RECORD);
    }

    /**
     * Create a detached, initialised TPatrolSystemShiftRecordRecord
     */
    public TPatrolSystemShiftRecordRecord(Long id, Long updateBy, Long updateTime, Long checkTime, Integer status, Long scheduleRecordId, Long deviceId) {
        super(TPatrolSystemShiftRecord.T_PATROL_SYSTEM_SHIFT_RECORD);

        set(0, id);
        set(1, updateBy);
        set(2, updateTime);
        set(3, checkTime);
        set(4, status);
        set(5, scheduleRecordId);
        set(6, deviceId);
    }
}
