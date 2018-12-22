/*
 * This file is generated by jOOQ.
 */
package com.frank.testData.generated.tables;


import com.frank.testData.generated.Indexes;
import com.frank.testData.generated.Keys;
import com.frank.testData.generated.TPatrolsystem;
import com.frank.testData.generated.tables.records.TPatrolSystemCheckContentRecord;

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
 * 检查内容表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPatrolSystemCheckContent extends TableImpl<TPatrolSystemCheckContentRecord> {

    private static final long serialVersionUID = 1529955957;

    /**
     * The reference instance of <code>t_patrolsystem.t_patrol_system_check_content</code>
     */
    public static final TPatrolSystemCheckContent T_PATROL_SYSTEM_CHECK_CONTENT = new TPatrolSystemCheckContent();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TPatrolSystemCheckContentRecord> getRecordType() {
        return TPatrolSystemCheckContentRecord.class;
    }

    /**
     * The column <code>t_patrolsystem.t_patrol_system_check_content.id</code>.
     */
    public final TableField<TPatrolSystemCheckContentRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_check_content.update_by</code>.
     */
    public final TableField<TPatrolSystemCheckContentRecord, Long> UPDATE_BY = createField("update_by", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_check_content.update_time</code>.
     */
    public final TableField<TPatrolSystemCheckContentRecord, Long> UPDATE_TIME = createField("update_time", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_check_content.type</code>. 检查类型 目前 1 单选 2 多选 3 填空 4 图片 
     */
    public final TableField<TPatrolSystemCheckContentRecord, Integer> TYPE = createField("type", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "检查类型 目前 1 单选 2 多选 3 填空 4 图片 ");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_check_content.description</code>. 检查内容的标题 (单选，多选，填空有)
     */
    public final TableField<TPatrolSystemCheckContentRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR(255), this, "检查内容的标题 (单选，多选，填空有)");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_check_content.content</code>. 检查的内容(单选，多选的选项，逗号隔开)
     */
    public final TableField<TPatrolSystemCheckContentRecord, String> CONTENT = createField("content", org.jooq.impl.SQLDataType.VARCHAR(255), this, "检查的内容(单选，多选的选项，逗号隔开)");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_check_content.required</code>. 是否必填 0 否 1 是
     */
    public final TableField<TPatrolSystemCheckContentRecord, Boolean> REQUIRED = createField("required", org.jooq.impl.SQLDataType.BIT, this, "是否必填 0 否 1 是");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_check_content.device_id</code>. 巡检机id
     */
    public final TableField<TPatrolSystemCheckContentRecord, Long> DEVICE_ID = createField("device_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "巡检机id");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_check_content.schedule_id</code>. 巡检排班的主键
     */
    public final TableField<TPatrolSystemCheckContentRecord, Long> SCHEDULE_ID = createField("schedule_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "巡检排班的主键");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_check_content.sort</code>. 排序字段
     */
    public final TableField<TPatrolSystemCheckContentRecord, Integer> SORT = createField("sort", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "排序字段");

    /**
     * The column <code>t_patrolsystem.t_patrol_system_check_content.status</code>.
     */
    public final TableField<TPatrolSystemCheckContentRecord, Byte> STATUS = createField("status", org.jooq.impl.SQLDataType.TINYINT.defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.TINYINT)), this, "");

    /**
     * Create a <code>t_patrolsystem.t_patrol_system_check_content</code> table reference
     */
    public TPatrolSystemCheckContent() {
        this(DSL.name("t_patrol_system_check_content"), null);
    }

    /**
     * Create an aliased <code>t_patrolsystem.t_patrol_system_check_content</code> table reference
     */
    public TPatrolSystemCheckContent(String alias) {
        this(DSL.name(alias), T_PATROL_SYSTEM_CHECK_CONTENT);
    }

    /**
     * Create an aliased <code>t_patrolsystem.t_patrol_system_check_content</code> table reference
     */
    public TPatrolSystemCheckContent(Name alias) {
        this(alias, T_PATROL_SYSTEM_CHECK_CONTENT);
    }

    private TPatrolSystemCheckContent(Name alias, Table<TPatrolSystemCheckContentRecord> aliased) {
        this(alias, aliased, null);
    }

    private TPatrolSystemCheckContent(Name alias, Table<TPatrolSystemCheckContentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("检查内容表"));
    }

    public <O extends Record> TPatrolSystemCheckContent(Table<O> child, ForeignKey<O, TPatrolSystemCheckContentRecord> key) {
        super(child, key, T_PATROL_SYSTEM_CHECK_CONTENT);
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
        return Arrays.<Index>asList(Indexes.T_PATROL_SYSTEM_CHECK_CONTENT_FK_DEVICE_CHECK, Indexes.T_PATROL_SYSTEM_CHECK_CONTENT_FK_DEVICE_SCHEDULE, Indexes.T_PATROL_SYSTEM_CHECK_CONTENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<TPatrolSystemCheckContentRecord> getPrimaryKey() {
        return Keys.KEY_T_PATROL_SYSTEM_CHECK_CONTENT_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<TPatrolSystemCheckContentRecord>> getKeys() {
        return Arrays.<UniqueKey<TPatrolSystemCheckContentRecord>>asList(Keys.KEY_T_PATROL_SYSTEM_CHECK_CONTENT_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemCheckContent as(String alias) {
        return new TPatrolSystemCheckContent(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemCheckContent as(Name alias) {
        return new TPatrolSystemCheckContent(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public TPatrolSystemCheckContent rename(String name) {
        return new TPatrolSystemCheckContent(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TPatrolSystemCheckContent rename(Name name) {
        return new TPatrolSystemCheckContent(name, null);
    }
}