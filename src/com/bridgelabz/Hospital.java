package com.bridgelabz;

import java.util.List;

public class Hospital {

    Patient p1 = new Patient();
    Hospital h1 = new Hospital();

    private String hospitalName;
    private List<Patient> patients;

    public Hospital() {

    }
    public Hospital(String hospitalName, List<Patient> patients) {
        this.hospitalName = hospitalName;
        this.patients = patients;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }



    public void addHospital()
    {

        h1.setHospitalName("AIMS Hospital");
        h1.setPatients((List<Patient>) p1);
        h1.getHospitalName();
        h1.getPatients();
        System.out.println(h1);
        addPatient();

    }
    public void addPatient() {


        p1.setName("Yash");
        p1.setAge("23");
        p1.setCity("Dhule");
        p1.setState("mh");
        p1.setPhoneNumber("9637549995");
        p1.setDepartment("ONCOLOGY");
        p1.getName();
        p1.getAge();
        p1.getCity();
        p1.getState();
        p1.getPhoneNumber();
        p1.getDepartment();

       System.out.println(p1);




    }



//    Create multiple Hospitals -> Create Patients with
//    details(name, age, phoneNumber,city,state, department) ->
//    Create an Enum for Department(Values-> ONCOLOGY, NEUROLOGY , CARDIOLOGY , GYNOCOLOGY)->
//    Add multiple Patients in each Hospital -> Also Maintain a MAP of Hospitals through a Map(key->HospitalName , value->
//    Hospital-Object)  ->  Create 3 classes - Hospital , Patient and HospitalMain






}
