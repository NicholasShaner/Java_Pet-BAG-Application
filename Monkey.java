package projectTwo;

//Monkey.java

/********************
* IT-145 7-2 Project Two
* Pet.java
* 
* Nicholas Shaner
* SNHU
* IT-145-X3343 Found in App Development 23EW3
* Dr. Vivian Lyon
* February 25, 2024
* 
* ******************/

/*
 * declare class and extend to RescueAnimal as instructed.
 * all attributes from RescueAnimal will be inherited by Monkey class
 */
public class Monkey extends RescueAnimal {
	

 
   /*
    * Instance variable specific to monkey class only
    */
   private String species;
   private String tailLength;
   private String height;
   private String bodyLength;
   

 
   /*
    *  Monkey class Constructor, removed "breed" as replaced by species
    */
   public Monkey(String name, String species, String gender, String age,
      String weight, String height, String tailLength, String bodylength,
	  String acquisitionDate, String acquisitionCountry,String trainingStatus,
	  boolean reserved, String inServiceCountry) {

       this.setName(name);
       this.setSpecies(species);
       this.setGender(gender);
       this.setAge(age);
       this.setWeight(weight);
       this.setHeight(height);
       this.setTailLength(tailLength);
       this.setBodyLength(bodyLength);
       this.setAcquisitionDate(acquisitionDate);
       this.setAcquisitionLocation(acquisitionCountry);
       this.setTrainingStatus(trainingStatus);
       this.setReserved(reserved);
       this.setInServiceCountry(inServiceCountry);

    }

	  /*
	   *  Mutator Methods for monkeyList
	   */
	  public void setSpecies(String monkeySpecies) {
	      this.species = monkeySpecies;
	  }
	  public void setTailLength(String tailLength) {
		  this.tailLength = tailLength;
	  }
	  public void setHeight(String height) {
		  this.height = height;
	  }
	  public void setBodyLength(String bodyLength) {
		  this.bodyLength = bodyLength;
	  }
	  
	  
	  /*
	  *  Accessor Methods for monkeyList
	  */
	  public String getSpecies() {
	      return species;
	  }
	  public String getTailLength() {
		  return tailLength;
	  }
	  public String getHeight() {
		  return height;
	  }
	  public String getBodyLength() {
		  return bodyLength;
	  }
	  
	    /*
	     * override toString method for printing monkey element
	     */
	    @Override
	    public String toString() {
	    	return ("Name: " + getName() + ", Species: " + getSpecies() + ", Gender: " + getGender() + ", Age: " + getAge() + ", Weight: " + 
	    getWeight() + ", Height: " + getHeight() + ", Tail Length: " + getTailLength() + ", Body Length: " + getBodyLength() + ", Date Aquired: " + getAcquisitionDate() + ", Country Aquired From: " + getAcquisitionLocation() + 
	    ", Training Status: " + getTrainingStatus() + ", Reserved? " + getReserved() + ", In Service Location: " + getInServiceLocation());
	    }



	}
