/*
 * This file is generated by jOOQ.
 */
package com.frank.testData.generated.tables;


import com.frank.testData.generated.Indexes;
import com.frank.testData.generated.Keys;
import com.frank.testData.generated.TPatrolsystem;
import com.frank.testData.generated.tables.records.TPatrolSystemScheduleRecordRecord;

import java.time.LocalDate;
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
 * 巡检记录
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPatrolSystemScheduleRecord extends TableImpl<TPatrolSystemScheduleRecordRecord> {

    private static final long serialVersionUID = -1189161117;

    /**
     * The reference instance of <code>t_patrolsystem.t_patrol_system_schedule_record</code>
     */
    public static final TPatrolSystemScheduleRecord T_PATROL_SYSTEM_SCHEDULE_RECORD = new TPatrolSystemScheduleRecord();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TPatrolSystemScheduleRecordRecord> getRecordType() {
        return TPatrolSystemScheduleRecordRecord.class;
    }

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_record.id</code>.
     */
    public final TableField<TPatrolSystemScheduleRecordRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_record.update_by</code>.
     */
    public final TableField<TPatrolSystemScheduleRecordRecord, Long> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_record.update_time</code>.
     */
    public final TableField<TPatrolSystemScheduleRecordRecord, Long> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_record.date</code>. 记录完成的时间
     */
    public final TableField<TPatrolSystemScheduleRecordRecord, LocalDate> DATE = createField("date", org.jooq.impl.SQLDataType.LOCALDATE.nullable(false), this, "记录完成的时间");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_record.start_time</code>. 实际开始的时间
     */
    public final TableField<TPatrolSystemScheduleRecordRecord, LocalTime> START_TIME = createField("start_time", org.jooq.impl.SQLDataType.LOCALTIME, this, "实际开始的时间");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_record.end_time</code>. 实际结束的时间
     */
    public final TableField<TPatrolSystemScheduleRecordRecord, LocalTime> END_TIME = createField("end_time", org.jooq.impl.SQLDataType.LOCALTIME, this, "实际结束的时间");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_record.complete_flag</code>. 完成情况 0 未完成 1 已完成 3 执行中
     */
    public final TableField<TPatrolSystemScheduleRecordRecord, Integer> COMPLETE_FLAG = createField("complete_flag", org.jooq.impl.SQLDataType.INTEGER, this, "完成情况 0 未完成 1 已完成 3 执行中");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_record.shift_id</code>. 巡检排班周期的外键
     */
    public final TableField<TPatrolSystemScheduleRecordRecord, Long> SHIFT_ID = createField("shift_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "巡检排班周期的外键");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_record.user_id</code>. 用户的主键，可以为null
     */
    public final TableField<TPatrolSystemScheduleRecordRecord, Long> USER_ID = createField("user_id", org.jooq.impl.SQLDataType.BIGINT, this, "用户的主键，可以为null");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_schedule_record.schedule_id</code>. 巡检排班的主键
     */
    public final TableField<TPatrolSystemScheduleRecordRecord, Long> SCHEDULE_ID = createField("schedule_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "巡检排班的主键");

    /**
     * Create a <code>t_patrolsystem.t_patrol_system_schedule_record</code> table reference
     */
    public TPatrolSystemScheduleRecord() {
        this(DSL.name("t_patrol_system_schedule_record"), null);
    }

    /**
     * Create an aliased <code>t_patrolsystem.t_patrol_system_schedule_record</code> table reference
     */
    public TPatrolSystemScheduleRecord(String alias) {
        this(DSL.name(alias), T_PATROL_SYSTEM_SCHEDULE_RECORD);
    }

    /**
     * Create an aliased <code>t_patrolsystem.t_patrol_system_schedule_record</code> table reference
     */
    public TPatrolSystemScheduleRecord(Name alias) {
        this(alias, T_PATROL_SYSTEM_SCHEDULE_RECORD);
    }

    private TPatrolSystemScheduleRecord(Name alias, Table<TPatrolSystemScheduleRecordRecord> aliased) {
        this(alias, aliased, null);
    }

    private TPatrolSystemScheduleRecord(Name alias, Table<TPatrolSystemScheduleRecordRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("巡检记录"));
    }

    public <O extends Record> TPatrolSystemScheduleRecord(Table<O> child, ForeignKey<O, TPatrolSystemScheduleRecordRecord> key) {
        super(child, key, T_PATROL_SYSTEM_SCHEDULE_RECORD);
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
        return Arrays.<Index>asList(Indexes.T_PATROL_SYSTEM_SCHEDULE_RECORD_FK_SCHEDUAL_USER, Indexes.T_PATROL_SYSTEM_SCHEDULE_RECORD_FK_SCHEDULE_RECORD_SCHEDULE, Indexes.T_PATROL_SYSTEM_SCHEDULE_RECORD_FK_SEHEDUAL_RECORD_SHIFT, Indexes.T_PATROL_SYSTEM_SCHEDULE_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TPatrolSystemScheduleRecordRecord> getPrimaryKey() {
        return Keys.KEY_T_PATROL_SYSTEM_SCHEDULE_RECORD_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TPatrolSystemScheduleRecordRecord>> getKeys() {
        return Arrays.<UniqueKey<TPatrolSystemScheduleRecordRecord>>asList(Keys.KEY_T_PATROL_SYSTEM_SCHEDULE_RECORD_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemScheduleRecord as(String alias) {
        return new TPatrolSystemScheduleRecord(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemScheduleRecord as(Name alias) {
        return new TPatrolSystemScheduleRecord(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TPatrolSystemScheduleRecord rename(String name) {
        return new TPatrolSystemScheduleRecord(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TPatrolSystemScheduleRecord rename(Name name) {
        return new TPatrolSystemScheduleRecord(name, null);
    }
}
