package com.iuh.entity;

public class PC extends Computer{
    private String ram;
    private String hdd;
    private String cpu;

    public PC(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }


    @Override
    public String getRAM() {
        return "RAM FROM PC " + this.ram;
    }

    @Override
    public String getHDD() {
        return "HDD FROM PC " + this.hdd;
    }

    @Override
    public String getCPU() {
        return "CPU FROM PC " + this.cpu;
    }


}
