/*
 * This file is generated by jOOQ.
 */
package com.frank.testData.generated.tables.records;


import com.frank.testData.generated.tables.TPatrolSystemUser;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 巡检机_用户
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPatrolSystemUserRecord extends UpdatableRecordImpl<TPatrolSystemUserRecord> implements Record11<Long, Long, Long, Boolean, Long, String, String, String, Long, String, Boolean> {

    private static final long serialVersionUID = -1740198120;

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_user.id</code>. 非业务主键
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_user.id</code>. 非业务主键
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_user.update_by</code>. 更新者
     */
    public void setUpdateBy(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_user.update_by</code>. 更新者
     */
    public Long getUpdateBy() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_user.update_time</code>. 更新时间
     */
    public void setUpdateTime(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_user.update_time</code>. 更新时间
     */
    public Long getUpdateTime() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_user.admin</code>. 是否是管理员 0 : 普通用户 1 : 管理员
     */
    public void setAdmin(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_user.admin</code>. 是否是管理员 0 : 普通用户 1 : 管理员
     */
    public Boolean getAdmin() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_user.org_id</code>. 组织Id
     */
    public void setOrgId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_user.org_id</code>. 组织Id
     */
    public Long getOrgId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_user.org_name</code>. 组织名
     */
    public void setOrgName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_user.org_name</code>. 组织名
     */
    public String getOrgName() {
        return (String) get(5);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_user.user_avatar</code>. 用户头像
     */
    public void setUserAvatar(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_user.user_avatar</code>. 用户头像
     */
    public String getUserAvatar() {
        return (String) get(6);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_user.user_empno</code>. 工号
     */
    public void setUserEmpno(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_user.user_empno</code>. 工号
     */
    public String getUserEmpno() {
        return (String) get(7);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_user.user_id</code>. 得力e+系统的用户主键(可能重复)
     */
    public void setUserId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_user.user_id</code>. 得力e+系统的用户主键(可能重复)
     */
    public Long getUserId() {
        return (Long) get(8);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_user.user_name</code>. 用户姓名
     */
    public void setUserName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_user.user_name</code>. 用户姓名
     */
    public String getUserName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_user.status</code>. 用户状态 0 : 失效 1: 有效
     */
    public void setStatus(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_user.status</code>. 用户状态 0 : 失效 1: 有效
     */
    public Boolean getStatus() {
        return (Boolean) get(10);
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
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, Long, Boolean, Long, String, String, String, Long, String, Boolean> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Long, Long, Long, Boolean, Long, String, String, String, Long, String, Boolean> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TPatrolSystemUser.T_PATROL_SYSTEM_USER.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TPatrolSystemUser.T_PATROL_SYSTEM_USER.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return TPatrolSystemUser.T_PATROL_SYSTEM_USER.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return TPatrolSystemUser.T_PATROL_SYSTEM_USER.ADMIN;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field5() {
        return TPatrolSystemUser.T_PATROL_SYSTEM_USER.ORG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return TPatrolSystemUser.T_PATROL_SYSTEM_USER.ORG_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return TPatrolSystemUser.T_PATROL_SYSTEM_USER.USER_AVATAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TPatrolSystemUser.T_PATROL_SYSTEM_USER.USER_EMPNO;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field9() {
        return TPatrolSystemUser.T_PATROL_SYSTEM_USER.USER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TPatrolSystemUser.T_PATROL_SYSTEM_USER.USER_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return TPatrolSystemUser.T_PATROL_SYSTEM_USER.STATUS;
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
    public Boolean component4() {
        return getAdmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component5() {
        return getOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component6() {
        return getOrgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getUserAvatar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getUserEmpno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component9() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getStatus();
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
    public Boolean value4() {
        return getAdmin();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value5() {
        return getOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getOrgName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getUserAvatar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getUserEmpno();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value9() {
        return getUserId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getUserName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemUserRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemUserRecord value2(Long value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemUserRecord value3(Long value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemUserRecord value4(Boolean value) {
        setAdmin(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemUserRecord value5(Long value) {
        setOrgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemUserRecord value6(String value) {
        setOrgName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemUserRecord value7(String value) {
        setUserAvatar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemUserRecord value8(String value) {
        setUserEmpno(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemUserRecord value9(Long value) {
        setUserId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemUserRecord value10(String value) {
        setUserName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemUserRecord value11(Boolean value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemUserRecord values(Long value1, Long value2, Long value3, Boolean value4, Long value5, String value6, String value7, String value8, Long value9, String value10, Boolean value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TPatrolSystemUserRecord
     */
    public TPatrolSystemUserRecord() {
        super(TPatrolSystemUser.T_PATROL_SYSTEM_USER);
    }

    /**
     * Create a detached, initialised TPatrolSystemUserRecord
     */
    public TPatrolSystemUserRecord(Long id, Long updateBy, Long updateTime, Boolean admin, Long orgId, String orgName, String userAvatar, String userEmpno, Long userId, String userName, Boolean status) {
        super(TPatrolSystemUser.T_PATROL_SYSTEM_USER);

        set(0, id);
        set(1, updateBy);
        set(2, updateTime);
        set(3, admin);
        set(4, orgId);
        set(5, orgName);
        set(6, userAvatar);
        set(7, userEmpno);
        set(8, userId);
        set(9, userName);
        set(10, status);
    }
}