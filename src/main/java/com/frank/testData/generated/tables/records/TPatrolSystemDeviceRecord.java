/*
 * This file is generated by jOOQ.
 */
package com.frank.testData.generated.tables.records;


import com.frank.testData.generated.tables.TPatrolSystemDevice;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * 巡检机设备
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TPatrolSystemDeviceRecord extends UpdatableRecordImpl<TPatrolSystemDeviceRecord> implements Record10<Long, Long, Long, String, String, Long, Boolean, String, String, String> {

    private static final long serialVersionUID = 2140139073;

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_device.id</code>.
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_device.id</code>.
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_device.update_by</code>.
     */
    public void setUpdateBy(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_device.update_by</code>.
     */
    public Long getUpdateBy() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_device.update_time</code>.
     */
    public void setUpdateTime(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_device.update_time</code>.
     */
    public Long getUpdateTime() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_device.sn_code</code>. 设备的sn码
     */
    public void setSnCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_device.sn_code</code>. 设备的sn码
     */
    public String getSnCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_device.device_location</code>. 设备的安装地点
     */
    public void setDeviceLocation(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_device.device_location</code>. 设备的安装地点
     */
    public String getDeviceLocation() {
        return (String) get(4);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_device.org_id</code>. 设备所属的组织Id
     */
    public void setOrgId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_device.org_id</code>. 设备所属的组织Id
     */
    public Long getOrgId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_device.status</code>. 设备的状态 0 未激活 1 已激活
     */
    public void setStatus(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_device.status</code>. 设备的状态 0 未激活 1 已激活
     */
    public Boolean getStatus() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_device.bluetooth_name</code>.
     */
    public void setBluetoothName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_device.bluetooth_name</code>.
     */
    public String getBluetoothName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_device.device_name</code>.
     */
    public void setDeviceName(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_device.device_name</code>.
     */
    public String getDeviceName() {
        return (String) get(8);
    }

    /**
     * Setter for <code>t_patrolsystem.t_patrol_system_device.product_model</code>.
     */
    public void setProductModel(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>t_patrolsystem.t_patrol_system_device.product_model</code>.
     */
    public String getProductModel() {
        return (String) get(9);
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
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, Long, String, String, Long, Boolean, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Long, Long, Long, String, String, Long, Boolean, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return TPatrolSystemDevice.T_PATROL_SYSTEM_DEVICE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return TPatrolSystemDevice.T_PATROL_SYSTEM_DEVICE.UPDATE_BY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return TPatrolSystemDevice.T_PATROL_SYSTEM_DEVICE.UPDATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return TPatrolSystemDevice.T_PATROL_SYSTEM_DEVICE.SN_CODE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return TPatrolSystemDevice.T_PATROL_SYSTEM_DEVICE.DEVICE_LOCATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field6() {
        return TPatrolSystemDevice.T_PATROL_SYSTEM_DEVICE.ORG_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field7() {
        return TPatrolSystemDevice.T_PATROL_SYSTEM_DEVICE.STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return TPatrolSystemDevice.T_PATROL_SYSTEM_DEVICE.BLUETOOTH_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return TPatrolSystemDevice.T_PATROL_SYSTEM_DEVICE.DEVICE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return TPatrolSystemDevice.T_PATROL_SYSTEM_DEVICE.PRODUCT_MODEL;
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
    public String component4() {
        return getSnCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getDeviceLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component6() {
        return getOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getBluetoothName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getDeviceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getProductModel();
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
    public String value4() {
        return getSnCode();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getDeviceLocation();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value6() {
        return getOrgId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value7() {
        return getStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getBluetoothName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getDeviceName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getProductModel();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemDeviceRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemDeviceRecord value2(Long value) {
        setUpdateBy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemDeviceRecord value3(Long value) {
        setUpdateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemDeviceRecord value4(String value) {
        setSnCode(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemDeviceRecord value5(String value) {
        setDeviceLocation(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemDeviceRecord value6(Long value) {
        setOrgId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemDeviceRecord value7(Boolean value) {
        setStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemDeviceRecord value8(String value) {
        setBluetoothName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemDeviceRecord value9(String value) {
        setDeviceName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemDeviceRecord value10(String value) {
        setProductModel(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TPatrolSystemDeviceRecord values(Long value1, Long value2, Long value3, String value4, String value5, Long value6, Boolean value7, String value8, String value9, String value10) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TPatrolSystemDeviceRecord
     */
    public TPatrolSystemDeviceRecord() {
        super(TPatrolSystemDevice.T_PATROL_SYSTEM_DEVICE);
    }

    /**
     * Create a detached, initialised TPatrolSystemDeviceRecord
     */
    public TPatrolSystemDeviceRecord(Long id, Long updateBy, Long updateTime, String snCode, String deviceLocation, Long orgId, Boolean status, String bluetoothName, String deviceName, String productModel) {
        super(TPatrolSystemDevice.T_PATROL_SYSTEM_DEVICE);

        set(0, id);
        set(1, updateBy);
        set(2, updateTime);
        set(3, snCode);
        set(4, deviceLocation);
        set(5, orgId);
        set(6, status);
        set(7, bluetoothName);
        set(8, deviceName);
        set(9, productModel);
    }
}