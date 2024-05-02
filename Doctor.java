package com.entity;

public class Doctor {
    private int id;
    private String doctorName;
    private String specialization;
    private String username;
    private String password;

    // Constructors
    public Doctor() {
    }

    public Doctor(String doctorName, String specialization, String username, String password) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.username = username;
        this.password = password;
    }

    public Doctor(int id, String doctorName, String specialization, String username, String password) {
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // toString method for debugging/logging purposes
    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", doctorName='" + doctorName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

