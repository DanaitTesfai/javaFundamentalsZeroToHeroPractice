package org.example.java_fundamentals._07_OOP._03_arrayLists._04_gymMember;

public class GymMember {
    private int id;
    private String name;
    private String memberShipType;

    public GymMember(int id, String name, String memberShipType) {
        this.id = id;
        this.name = name;
        this.memberShipType = memberShipType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberShipType() {
        return memberShipType;
    }

    public void setMemberShipType(String memberShipType) {
        this.memberShipType = memberShipType;
    }

    public String toString() {
        return "Name: " + name + ", Id: " + id + ", Membership type: " + memberShipType;
    }
}
