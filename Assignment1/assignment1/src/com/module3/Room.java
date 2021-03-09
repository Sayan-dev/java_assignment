package com.module3;

public class Room {
    String roomType;
    int roomNo, roomArea, acMachine;

    public void setData(int roomArea, String roomType, int roomNo, int acMachine) {
        this.roomArea = roomArea;
        this.acMachine = acMachine;
        this.roomNo = roomNo;
    }

    public void getData() {
        System.out
                .print(Integer.toString(roomArea) + ' ' + Integer.toString(roomNo) + ' ' + Integer.toString(acMachine));

    }
}
