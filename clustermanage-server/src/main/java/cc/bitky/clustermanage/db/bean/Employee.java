package cc.bitky.clustermanage.db.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Employee {

    @Id
    String id;

    //个人信息
    String name;
    String department;
    long cardNumber;

    //设备位置
    int groupId;
    int deviceId;

    String routineTablesObjectId;


    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getRoutineTablesObjectId() {
        return routineTablesObjectId;
    }

    public void setRoutineTablesObjectId(String routineTablesObjectId) {
        this.routineTablesObjectId = routineTablesObjectId;
    }
}
