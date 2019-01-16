class Person{
    public static String myName ;   // name of the person
    public static int myAge;        // person's age
    public static String myGender;  // "M" for male, "F" for female
  
    // constructor
    public Person(String name, int age, String gender){
      myName = name;
      myAge = age;
      myGender = gender;
    }
    
    // that's source code 
    public String getName() {
      return myName;
    }
  
    
      public int getAge(){
      return myAge;
    }
  
    public String getGender(){
      return myGender;
    }
  
    public void setName(String name){
      myName = name;
    }
  
    public void setAge(int age) {
      myAge = age;
    }
  
    public void setGender(String gender){
      myGender = gender;
    }
  
    public String toString(){
       return this.myName + ", age: " + this.myAge + ", gender: " + 
              this.myGender;
    }
  }
