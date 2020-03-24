package com.epam.design_pattern;

/**
 * Hello world!
 *
 */

public class User{
	 private final String firstname;
	 private final String lastname;
	 private final int age;
	 private final String phone;
	 private final String address;
	 
       User(UserBuilder builder){
    	   this.firstname = builder.firstname;
           this.lastname = builder.lastname;
           this.age = builder.age;
           this.phone = builder.phone;
           this.address = builder.address;
       }
       String Getfirstname() {
    	   return this.firstname;
       }
       String Getlastname() {
    	   return this.lastname;
       }
       
	  int Getage() {
		  return this.age;
	  }
	  String Getphone() {
		  return this.phone;
	  }
	  String Getadress() {
		  return this.address;
	  }
	public String toString() {
		return "User is :"+this.firstname + ","+ this.lastname +"," + this.age +","+this.phone;
	}

 public static class UserBuilder {
	 private final String firstname;
	 private final String lastname;
	 private  int age;
	 private  String phone;
	 private  String address;
	 
	 public UserBuilder(String firstname, String lastname) {
         this.firstname = firstname;
         this.lastname = lastname;
     }
     public UserBuilder age(int age) {
         this.age = age;
         return this;
     }
     public UserBuilder phone(String phone) {
         this.phone = phone;
         return this;
     }
     public UserBuilder address(String address) {
         this.address = address;
         return this;
     }
     
     public User build() {
         User user =  new User(this);
        return user;
     }
	 
 }
 
 public static void main(String args[]) {
	      User user1= new User.UserBuilder("Priyanka","sriramakavacham")
	    		  .age(20)
	    		  .phone("985432178")
	    		  .address("fake adress")
	    		  .build();
	      
	      System.out.println(user1);
	      
	      User user2 = new User.UserBuilder("Jack", "Reacher")
	      .age(40)
	      .phone("5655")
	      //no address
	      .build();
	   
	      System.out.println(user2);
	   
	      User user3 = new User.UserBuilder("Super", "Man")
	      //No age
	      //No phone
	      //no address
	      .build();
	   
	      System.out.println(user3);		  
	    		  
 }
 
 }

