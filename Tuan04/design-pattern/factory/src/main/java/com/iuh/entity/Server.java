package com.iuh.entity;

public class Server extends Computer{
    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }


    @Override
    public String getRAM() {
        return "RAM FROM Server " + this.ram;
    }

    @Override
    public String getHDD() {
        return "HDD FROM Server " + this.hdd;
    }

    @Override
    public String getCPU() {
        return "CPU FROM Server " + this.cpu;
    }
}
