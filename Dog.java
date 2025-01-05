package projectTwo;

//Dog.java

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
 * declared Dog class and extension of RescueAnimal class to
 * inherit methods and objects
 */
public class Dog extends RescueAnimal {

    
	/*
	 * Instance variable breed, specific to Dog class
	 */
    private String breed;

    /*
     * Constructor
     */
    public Dog(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry) {
        this.setName(name);
        this.setBreed(breed);
        this.setGender(gender);
        this.setAge(age);
        this.setWeight(weight);
        this.setAcquisitionDate(acquisitionDate);
        this.setAcquisitionLocation(acquisitionCountry);
        this.setTrainingStatus(trainingStatus);
        this.setReserved(reserved);
        this.setInServiceCountry(inServiceCountry);

    }

    /*
     * Mutator Method for Dog class
     */
    public void setBreed(String dogBreed) {
        this.breed = dogBreed;
    }
    /*
     * Accessor Method for Dog class
     */
    public String getBreed() {
        return breed;
    }
    
    /*
     * override toString method for printing dog element
     */
    @Override
    public String toString() {
    	return ("Name: " + getName() + ", Breed: " + getBreed() + ", Gender: " + getGender() + ", Age: " + getAge() + ", Weight: " + 
    getWeight() + ", Date Aquired: " + getAcquisitionDate() + ", Country Aquired From: " + getAcquisitionLocation() + 
    ", Training Status: " + getTrainingStatus() + ", Reserved? " + getReserved() + ", In Service: " + getInServiceLocation());
    }



}
