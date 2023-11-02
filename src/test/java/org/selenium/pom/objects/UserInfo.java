package org.selenium.pom.objects;

public class UserInfo {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;
    private String comment;
    private String institution;
    private String dietaryRequirementDetails;
    private String medicalConditionDetails;
    private String guardianTitle;
    private String guardianFirstName;
    private String guardianLastName;
    private String guardianPhone;
    private String guardianEmail;
    private String age;

    public UserInfo(){}

    public UserInfo(String institution){
        this.institution = institution;
    }

    public UserInfo(String guardianTitle,String guardianFirstName, String guardianLastName){
        this.guardianTitle = guardianTitle;
        this.guardianFirstName = guardianFirstName;
        this.guardianLastName = guardianLastName;
    }

    public UserInfo(String guardianPhone,String guardianEmail){
        this.guardianPhone =guardianPhone;
        this.guardianEmail = guardianEmail;
    }

    public UserInfo(String firstName, String lastName, String phone, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
    }

    public UserInfo(String firstName, String lastName, String phone, String email, String comment){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.comment = comment;
    }

    public String getInstitution() {
        return institution;
    }

    public void setInstitution(String institution) {
        this.institution = institution;
    }

    public String getDietaryRequirementDetails() {
        return dietaryRequirementDetails;
    }

    public void setDietaryRequirementDetails(String dietaryRequirementDetails) {
        this.dietaryRequirementDetails = dietaryRequirementDetails;
    }

    public String getMedicalConditionDetails() {
        return medicalConditionDetails;
    }

    public void setMedicalConditionDetails(String medicalConditionDetails) {
        this.medicalConditionDetails = medicalConditionDetails;
    }

    public String getGuardianTitle() {
        return guardianTitle;
    }

    public void setGuardianTitle(String guardianTitle) {
        this.guardianTitle = guardianTitle;
    }

    public String getGuardianFirstName() {
        return guardianFirstName;
    }

    public void setGuardianFirstName(String guardianFirstName) {
        this.guardianFirstName = guardianFirstName;
    }

    public String getGuardianLastName() {
        return guardianLastName;
    }

    public void setGuardianLastName(String guardianLastName) {
        this.guardianLastName = guardianLastName;
    }

    public String getGuardianPhone() {
        return guardianPhone;
    }

    public void setGuardianPhone(String guardianPhone) {
        this.guardianPhone = guardianPhone;
    }

    public String getGuardianEmail() {
        return guardianEmail;
    }

    public void setGuardianEmail(String guardianEmail) {
        this.guardianEmail = guardianEmail;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserInfo setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserInfo setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public UserInfo setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserInfo setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public UserInfo setComment(String comment) {
        this.comment = comment;
        return this;
    }
}
