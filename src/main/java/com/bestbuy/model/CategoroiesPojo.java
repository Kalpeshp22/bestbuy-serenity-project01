package com.bestbuy.model;

/**
 * Created by Jay
 */
public class CategoroiesPojo {


    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static CategoriesPojo getCategoriesPojo(String name, String id) {
        CategoriesPojo categoriesPojo = new CategoriesPojo();
        categoriesPojo.setName(name);
        categoriesPojo.setId(id);
        return categoriesPojo;
    }

}
//
//    private String firstName;
//    private String lastName;
//    private String email;
//    private String programme;
//    private List<String> courses;
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getProgramme() {
//        return programme;
//    }
//
//    public void setProgramme(String programme) {
//        this.programme = programme;
//    }
//
//    public List<String> getCourses() {
//        return courses;
//    }
//
//    public void setCourses(List<String> courses) {
//        this.courses = courses;
//    }
//
//    public static CategoroiesPojo getStudentPojo(String firstName, String lastName, String email,
//                                                 String programme, List<String> courses){
//        CategoroiesPojo studentPojo = new CategoroiesPojo();
//        studentPojo.setFirstName(firstName);
//        studentPojo.setLastName(lastName);
//        studentPojo.setEmail(email);
//        studentPojo.setProgramme(programme);
//        studentPojo.setCourses(courses);
//        return studentPojo;
//    }
//}
