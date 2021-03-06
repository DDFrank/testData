/*
 * This file is generated by jOOQ.
 */
package com.frank.testData.generated.tables.pojos;


import java.io.Serializable;

import javax.annotation.Generated;


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
public class TPatrolSystemDevice implements Serializable {

    private static final long serialVersionUID = 752865287;

    private Long    id;
    private Long    updateBy;
    private Long    updateTime;
    private String  snCode;
    private String  deviceLocation;
    private Long    orgId;
    private Boolean status;
    private String  bluetoothName;
    private String  deviceName;
    private String  productModel;

    public TPatrolSystemDevice() {}

    public TPatrolSystemDevice(TPatrolSystemDevice value) {
        this.id = value.id;
        this.updateBy = value.updateBy;
        this.updateTime = value.updateTime;
        this.snCode = value.snCode;
        this.deviceLocation = value.deviceLocation;
        this.orgId = value.orgId;
        this.status = value.status;
        this.bluetoothName = value.bluetoothName;
        this.deviceName = value.deviceName;
        this.productModel = value.productModel;
    }

    public TPatrolSystemDevice(
        Long    id,
        Long    updateBy,
        Long    updateTime,
        String  snCode,
        String  deviceLocation,
        Long    orgId,
        Boolean status,
        String  bluetoothName,
        String  deviceName,
        String  productModel
    ) {
        this.id = id;
        this.updateBy = updateBy;
        this.updateTime = updateTime;
        this.snCode = snCode;
        this.deviceLocation = deviceLocation;
        this.orgId = orgId;
        this.status = status;
        this.bluetoothName = bluetoothName;
        this.deviceName = deviceName;
        this.productModel = productModel;
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

    public String getSnCode() {
        return this.snCode;
    }

    public void setSnCode(String snCode) {
        this.snCode = snCode;
    }

    public String getDeviceLocation() {
        return this.deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation) {
        this.deviceLocation = deviceLocation;
    }

    public Long getOrgId() {
        return this.orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Boolean getStatus() {
        return this.status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getBluetoothName() {
        return this.bluetoothName;
    }

    public void setBluetoothName(String bluetoothName) {
        this.bluetoothName = bluetoothName;
    }

    public String getDeviceName() {
        return this.deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getProductModel() {
        return this.productModel;
    }

    public void setProductModel(String productModel) {
        this.productModel = productModel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TPatrolSystemDevice (");

        sb.append(id);
        sb.append(", ").append(updateBy);
        sb.append(", ").append(updateTime);
        sb.append(", ").append(snCode);
        sb.append(", ").append(deviceLocation);
        sb.append(", ").append(orgId);
        sb.append(", ").append(status);
        sb.append(", ").append(bluetoothName);
        sb.append(", ").append(deviceName);
        sb.append(", ").append(productModel);

        sb.append(")");
        return sb.toString();
    }
}
