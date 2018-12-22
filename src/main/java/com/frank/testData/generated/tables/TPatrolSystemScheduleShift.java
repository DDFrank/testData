/*
 * This file is generated by jOOQ.
 */
package com.frank.testData.generated.tables;


import com.frank.testData.generated.Indexes;
import com.frank.testData.generated.Keys;
import com.frank.testData.generated.TPatrolsystem;
import com.frank.testData.generated.tables.records.TPatrolSystemScheduleShiftRecord;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


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
public class TPatrolSystemScheduleShift extends TableImpl<TPatrolSystemScheduleShiftRecord> {

    private static final long serialVersionUID = 383078022;

    /**
     * The reference instance of <code>t_patrolsystem.t_patrol_system_schedule_shift</code>
     */
    public static final TPatrolSystemScheduleShift T_PATROL_SYSTEM_SCHEDULE_SHIFT = new TPatrolSystemScheduleShift();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TPatrolSystemScheduleShiftRecord> getRecordType() {
        return TPatrolSystemScheduleShiftRecord.class;
    }

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_shift.id</code>.
     */
    public final TableField<TPatrolSystemScheduleShiftRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_shift.update_by</code>.
     */
    public final TableField<TPatrolSystemScheduleShiftRecord, Long> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_shift.update_time</code>.
     */
    public final TableField<TPatrolSystemScheduleShiftRecord, Long> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_shift.start_time</code>. 时间段开始时间
     */
    public final TableField<TPatrolSystemScheduleShiftRecord, LocalTime> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.LOCALTIME, this, "时间段开始时间");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_shift.end_time</code>. 时间段结束时间
     */
    public final TableField<TPatrolSystemScheduleShiftRecord, LocalTime> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.LOCALTIME, this, "时间段结束时间");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_shift.schedule_id</code>.
     */
    public final TableField<TPatrolSystemScheduleShiftRecord, Long> SCHEDULE_ID = createField("schedule_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>t_patrolsystem.t_patrol_system_schedule_shift</code> table reference
     */
    public TPatrolSystemScheduleShift() {
        this(DSL.name("t_patrol_system_schedule_shift"), null);
    }

    /**
     * Create an aliased <code>t_patrolsystem.t_patrol_system_schedule_shift</code> table reference
     */
    public TPatrolSystemScheduleShift(String alias) {
        this(DSL.name(alias), T_PATROL_SYSTEM_SCHEDULE_SHIFT);
    }

    /**
     * Create an aliased <code>t_patrolsystem.t_patrol_system_schedule_shift</code> table reference
     */
    public TPatrolSystemScheduleShift(Name alias) {
        this(alias, T_PATROL_SYSTEM_SCHEDULE_SHIFT);
    }

    private TPatrolSystemScheduleShift(Name alias, Table<TPatrolSystemScheduleShiftRecord> aliased) {
        this(alias, aliased, null);
    }

    private TPatrolSystemScheduleShift(Name alias, Table<TPatrolSystemScheduleShiftRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("巡检排班周期表 巡检排班的具体的任务"));
    }

    public <O extends Record> TPatrolSystemScheduleShift(Table<O> child, ForeignKey<O, TPatrolSystemScheduleShiftRecord> key) {
        super(child, key, T_PATROL_SYSTEM_SCHEDULE_SHIFT);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return TPatrolsystem.T_PATROLSYSTEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.T_PATROL_SYSTEM_SCHEDULE_SHIFT_FK_SCHEDULE_SHIFT_SCHEDULE, Indexes.T_PATROL_SYSTEM_SCHEDULE_SHIFT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TPatrolSystemScheduleShiftRecord> getPrimaryKey() {
        return Keys.KEY_T_PATROL_SYSTEM_SCHEDULE_SHIFT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TPatrolSystemScheduleShiftRecord>> getKeys() {
        return Arrays.<UniqueKey<TPatrolSystemScheduleShiftRecord>>asList(Keys.KEY_T_PATROL_SYSTEM_SCHEDULE_SHIFT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemScheduleShift as(String alias) {
        return new TPatrolSystemScheduleShift(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemScheduleShift as(Name alias) {
        return new TPatrolSystemScheduleShift(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TPatrolSystemScheduleShift rename(String name) {
        return new TPatrolSystemScheduleShift(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TPatrolSystemScheduleShift rename(Name name) {
        return new TPatrolSystemScheduleShift(name, null);
    }
}