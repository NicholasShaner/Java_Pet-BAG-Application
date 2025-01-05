package projectTwo;

//Driver.java

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
 * import statements for required methods
 * from java.util package
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * declare Driver class extends RescueAnimal class to inherit methods and objects
 */
public class Driver extends RescueAnimal {
	
   /*
    * declare and create ArrayList for Dog class and Monkey class 
    */
   private static ArrayList<Dog> dogList = new ArrayList<Dog>();
   private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
   
   /*
	* ArrayList created of approved money species,
	* to be used for input validation during intake
	*/
   public static List<Object> monkeyKind = new ArrayList<Object> (List.of("Guenon", "Macaque",
		   "Marmoset", "Squirrel Monkey", "Tamarin"));
   /*
    * Create Public scnr Object for user input
    */
   public static Scanner scnr = new Scanner(System.in);
   static String menuOpt;
   
   /*
    * main method
    */
   public static void main(String[] args) {
	  
      initializeDogList();
      initializeMonkeyList();
      
      /*
       * Do-While loop to display menu as well as process 
       * user menu selection while input is not "q" or "Q"
       * Also handles input validation with default Case
       */
      do {
    	 displayMenu();
	     menuOpt = scnr.nextLine();
         switch (menuOpt) {
            case "1":
        	   intakeNewDog();
	           break;
            case "2":
        	   intakeNewMonkey();
        	   break;
            case "3":
        	   reserveAnimal();
        	   break;
            case "4":
        	   printAnimals("4");
        	   break;
            case "5":
        	   printAnimals("5");
        	   break;
            case "6":
        	   printAnimals("6");
        	   break;
            case "q":
        	   System.out.println("Thank you, goodbye!");
        	   System.exit(0);
            case "Q":
         	   System.out.println("Thank you, goodbye!");
         	   System.exit(0);
            default:
		       System.out.println("Try another selection.");		    
         }
      }  while (!menuOpt.equals("q"));
   }
      
         
   /*
    * This method prints the menu options for user
    */
   public static void displayMenu() {
      System.out.println("\n\n");
      System.out.println("\t\t\t\tRescue Animal System Menu");
      System.out.println("[1] Intake a new dog");
      System.out.println("[2] Intake a new monkey");
      System.out.println("[3] Reserve an animal");
      System.out.println("[4] Print a list of all dogs");
      System.out.println("[5] Print a list of all monkeys");
      System.out.println("[6] Print a list of all animals that are not reserved");
      System.out.println("[q] Quit application");
      System.out.println();
      System.out.println("Enter a menu selection");
    }


    /* 
     * Method to Add dogs to a list for testing
     */
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false, "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", false, "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }


    /*
     * Method to Add monkeys to a list for testing
     */
    public static void initializeMonkeyList() {
    	Monkey monkey1 = new Monkey("SilverBack", "Tamarin", "male", "1", "22", "25.6", "25.6", "25.6", "05-12-2019", "United States", "intake", false, "United States");
        Monkey monkey2 = new Monkey("Bingo", "Squirrel Monkey", "male", "1", "25.6", "25.6", "25.6", "25.6", "05-12-2019", "United States", "in service", false, "United States");
        
        monkeyList.add(monkey1);
        monkeyList.add(monkey2);
    }


    /* 
     * Method to intake a new dog.
    * The input validation to check that the dog is not already in the list
    * is done for you
    */
    public static void intakeNewDog() {
        System.out.println("What is the dog's name?");
        String name = scnr.nextLine();
        for(Dog dog: dogList) {
            if(dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; //returns to menu
            }
            else {
                System.out.println("What is the dog's breed?");
                String breed = scnr.nextLine();
                
                System.out.println("What is the dog's gender?");
                String gender = scnr.nextLine();
                
                System.out.println("What is the dog's age?");
                String age = scnr.nextLine();
                
                System.out.println("What is the dog's weight?");
                String weight = scnr.nextLine();
                
                System.out.println("When was this dog acquired?");
                String acquisitionDate = scnr.nextLine();
                
                System.out.println("Which country was this dog acquired?");
                String acquisitionCountry = scnr.nextLine();
                
                System.out.println("What is the dog's training status?");
                String trainingStatus = scnr.nextLine();
                
                System.out.println("Is this dog reserved?");
                boolean reserved = scnr.nextBoolean();
                
                System.out.println("Which country is the dog in service?");
                String inServiceCountry = scnr.nextLine();
                
                /*
                 *  set new dog to ArrayList dogList
                 */
                Dog newDog = new Dog(name, breed, gender, age, weight, acquisitionDate, acquisitionCountry, 
                trainingStatus, reserved, inServiceCountry);
                dogList.add(newDog);
                System.out.println("Your entry has been added to the dog list.");
            }
        }
    }

        /*
         *  Completed intakeNewMonkey method. instantiate appropriated attributes,
         *  and created loops to perform necessary input validation for name, 
         *  and species 
         */
        public static void intakeNewMonkey() {
        	System.out.println("What is the monkey's name?");
            String name = scnr.nextLine();
            for(Monkey monkey: monkeyList) {
               if(monkey.getName().equalsIgnoreCase(name)) {
                   System.out.println("\n\nThis monkey is already in our system\n\n");
                   continue; //returns to menu
               }
               else {
               	System.out.println("welcome, " + name + "!");
                	
               }
            }
            System.out.println("What is your monkey's species: ");
            System.out.println("Currently we are only accepting " + monkeyKind);
      	    String species = scnr.nextLine();
      	    if (monkeyKind.contains(species)) {
      	    	System.out.println("Great! We are accepting that species of monkey");
      	    }
      	    else {
      	    	System.out.println("I'm sorry, we are currently only accepting certain"
      	    			+ "species of monkeys.");
      	    	System.exit(0);
      	    }
      	    
            System.out.println("What is your monkey's gender: ");
            String gender = scnr.nextLine();
        	  
    	    System.out.println("What is your monkey's age: ");
    	    String age = scnr.nextLine();
    	  
    	    System.out.println("What is your monkey's weight: ");
    	    String weight = scnr.nextLine();
    	  
    	    System.out.println("What is your monkey's height: ");
    	    String height = scnr.nextLine();
    	    
    	    System.out.println("What is your monkey's tail length: ");
    	    String tailLength = scnr.nextLine();
    	    
    	    System.out.println("What is your monkey's body length: ");
    	    String bodyLength = scnr.nextLine();
    	    
    	    System.out.println("What date did you aquire your monkey: ");
    	    String acquisitionDate = scnr.nextLine();
    	    
    	    System.out.println("What country did you aquire your monkey from: ");
    	    String acquisitionCountry = scnr.nextLine();
    	    
    	    String trainingStatus = "intake";
    	    Boolean reserved = false;
    	    String inServiceCountry = "null";
    	    
    	    /*
    	     *  sets new monkey to ArrayList monkeyList
    	     */
    	    Monkey newMonkey = new Monkey(name, species, gender, age, weight, height, tailLength,
    	           bodyLength, acquisitionDate, acquisitionCountry, trainingStatus,
    	 		   reserved, inServiceCountry);
    	    monkeyList.add(newMonkey);
    	    System.out.println("Complete");
    	    
         } 
            
        

        /*
         * Method to reserve an animal. Validates user input for type of animal
         * desired for reservation, then verifies if select animal type/name 
         * is available.
         * User confirmation of reservation or display of no select animal type 
         * available for reservation
         */
        public static void reserveAnimal() {
           System.out.println("Enter animal type: ");
           String animalType = scnr.nextLine();
           
           if (animalType.equalsIgnoreCase("Monkey")) {
              System.out.println(" Enter your select country; ");
              String mCountry = scnr.nextLine();
              
              for(Monkey monkey: monkeyList) {
                 if(monkey.getAcquisitionLocation().equalsIgnoreCase(mCountry)) {
                    monkey.setReserved(true);
                    monkey.setInServiceCountry(mCountry);
                    System.out.println("This monkey is now reserved.");
                    return;
                  }
                 
                 else {
                	 System.out.println("I am sorry, there are currently no "
                			 + "monkeys available for reservation");
                	 return;
                 }
              }
                System.out.println("The monkey entered is not in the list");
            }
           
            else if (animalType.equalsIgnoreCase("Dog")) {
               System.out.println("Enter your select country: ");
               String dCountry = scnr.nextLine();
               
               for(Dog dog: dogList){
                  if(dog.getAcquisitionLocation().equalsIgnoreCase(dCountry)){
                     dog.setReserved(true);
                     dog.setInServiceCountry(dCountry);
                     System.out.println("This dog is now reserved.");
                     return;
                  }
                  else {
                	  System.out.println("I am sorry, there are currently no "
                			  + "dogs available to be reserved");
                	  return;
                  }

               }
                System.out.println("The dog entered is not in the list");
                }  
            else {
               System.out.println("Type not found");
            }
            

        }

        /* 
         * Method to print animal ArrayList, selected based off menu option
         * "4" to print list of dogs.
         * "5" to print list of monkeys
         * "6" to print list of animals available for reservation
         */
        public static void printAnimals(String menuOpt) {
        	
        	if ("4".equals(menuOpt)) {
        		for (Dog dog: dogList) {
        			System.out.println(dog.toString());
        		}
        	}
        		
        	else if (menuOpt.equals("5")) {
        		for (Monkey monkey: monkeyList) {
        			System.out.println(monkey.toString());
        		}
        	}
        	
        	else if (menuOpt.equals("6")) {
        		for (int d = 0; d < dogList.size(); d++) {
					if (dogList.get(d).getTrainingStatus().equals("in service") &&
        					dogList.get(d).getReserved() == false) {
        				System.out.println(dogList.get(d));
        			}

        		}
        		for (int m = 0; m < monkeyList.size(); m++) {
					if (monkeyList.get(m).getTrainingStatus().equals("in service") &&
        					monkeyList.get(m).getReserved() == false) {
        				System.out.println(monkeyList.get(m));
        			}
        		}
        	}

        }
}
