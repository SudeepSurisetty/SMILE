/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;

/**
 *
 * @author Sudeep
 */
public class Person {

    //Attributes
    private ImageIcon imageIcon=null; // will use this if we can load image from CSV also
    private String firstName;
    private String lastName;
    private String category;
    private Calendar calendar;

    private String Identity;
    private int UID;
    private Date dob;
    private int personAge;
    private int age;
    private String gender;
    private String emailID;
    private String mblNo;
    private int smiles;
    private String intro;
    private String imageURL;
    private int index;

    // Company category
    private String companyName;
    private int companyID;
    private int joinedYear;
    private String companyEmailID;

    //NGO category
    private String NGOName;
    private int NGOID;

    //University category
    private String UnivName;
    private int UnivID;

    private Address address;

    // To show total volunteers registered for system admin analytics
    private int totalVolunteers;
    private static int count = 1;

    //Constructor
    public Person() {
        totalVolunteers = count;
        count++;
        personAge = age;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public int getAge() {
        return age;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTotalVolunteers() {
        return totalVolunteers;
    }

    public void setTotalVolunteers(int totalVolunteers) {
        this.totalVolunteers = totalVolunteers;
    }

    public static int getCount() {
        return count;
    }

    public int getSmiles() {
        return smiles;
    }

    public void setSmiles(int smiles) {
        this.smiles = smiles;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    //Getters and Setters
    public ImageIcon getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCategory() {
        return category;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmailID() {
        return emailID;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public String getMblNo() {
        return mblNo;
    }

    public void setMblNo(String mblNo) {
        this.mblNo = mblNo;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getCompanyID() {
        return companyID;
    }

    public void setCompanyID(int companyID) {
        this.companyID = companyID;
    }

    public int getJoinedYear() {
        return joinedYear;
    }

    public void setJoinedYear(int joinedYear) {
        this.joinedYear = joinedYear;
    }

    public String getCompanyEmailID() {
        return companyEmailID;
    }

    public void setCompanyEmailID(String companyEmailID) {
        this.companyEmailID = companyEmailID;
    }

    public String getNGOName() {
        return NGOName;
    }

    public void setNGOName(String NGOName) {
        this.NGOName = NGOName;
    }

    public int getNGOID() {
        return NGOID;
    }

    public void setNGOID(int NGOID) {
        this.NGOID = NGOID;
    }

    public String getUnivName() {
        return UnivName;
    }

    public void setUnivName(String UnivName) {
        this.UnivName = UnivName;
    }

    public int getUnivID() {
        return UnivID;
    }

    public void setUnivID(int UnivID) {
        this.UnivID = UnivID;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getIdentity() {
        return Identity;
    }

    public void setIdentity(String Identity) {
        this.Identity = Identity;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    
    
    public int getAge(Date dob) {
        //DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        LocalDate localDate = LocalDate.now();
        //System.out.println(dtf.format(localDate));
        
        age = localDate.getYear() - dob.getYear();
        
        return age;
        
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }
    
    
    
    @Override
    public String toString() {
        return (this.firstName + " " + this.lastName);
    }
}
