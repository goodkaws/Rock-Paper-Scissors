 
// Name: Jonathan Laster
// Date: 9/30/13 
// Description: This program that allows the user to play the game Rock, Paper, Scissors against the computer. 

import java.util.Scanner;

public class rps {
	@SuppressWarnings("resource")
	public static void main (String[] args){
		int wins = 0;          //The amount of times the user wins
        int loses = 0;         //The amount of times the user losses
        int ties = 0;          //The amount of times the user ties with the computer
        int games = 0;         //Number of games played
        String compChoice = "";    //Computers Strategy Choice
        String userChoice = "";   //Users Strategy Choice 
        String rematch = "yes";   //Rematch set to yes automatically so do statement can run
		
		System.out.println("Welcome to Rock, Paper, Scissors!"); 
        System.out.println("Get ready to try your luck against the computer!\n"); 
        
        //The entire program is wrapped in a do while loop. It will execute as long as rematch == yes.
        
        do {
	 	    //The computers choices!
        	int randomNum = (int) Math.ceil((Math.random() * 3));
        	
        	//I'm using a switch statement to quickly decipher the choices
        	switch(randomNum) {  
	            case 1: 
	                compChoice = "rock"; 
	                break; 
	            case 2: 
	                compChoice = "paper"; 
	                break; 
	            case 3: 
	                compChoice = "scissors"; 
	                break; 
	        }     
        	
	        //Let's get the users first choice with error checking
	        do {
	        	Scanner firstChoice = new Scanner(System.in);
	        	
	        	System.out.println("Which weapon would you like? Rock, Paper, or Scissors?");
	        	userChoice = firstChoice.nextLine().toLowerCase(); 

	        	if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
		        	do {
		        		System.out.println("Whoops! You have to enter in Rock, Paper, or Scissors. Which weapon would you like?");
			        	userChoice = firstChoice.nextLine().toLowerCase(); 
		        	} while(!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors"));
	        	};
	        	
	        	System.out.println();
	        } while(!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors"));

	        //Begin code for battle outcomes
	        if (compChoice.equals("rock")) {
	        	switch(userChoice) {
	        		case "rock":
	        			System.out.println("Your Weapon: " + userChoice +"\nComputer's Weapon: " + compChoice + "\nWoah! Too much Rock! It's a tie!\n");
	        			ties++;
	        			games++;
	        			break;

	        		case "paper":
	        			System.out.println("Your Weapon: " + userChoice +"\nComputer's Weapon: " + compChoice + "\nGot em! You win! Paper wraps up Rock!\n");
	        			wins++;
	        			games++;
	        			break;

	        		case "scissors":
	        			System.out.println("Your Weapon: " + userChoice +"\nComputer's Weapon: " + compChoice + "\nBummerrrrr. You lose :( Scissors is smashed by Rock!\n");
	        			loses++;
	        			games++;
	        			break;
	        	}
	        }

	        if (compChoice.equals("paper")) {
	        	switch(userChoice) {
	        		case "rock":
	        			System.out.println("Your Weapon: " + userChoice +"\nComputer's Weapon: " + compChoice + "\nBummerrrrr. You lose :( Paper wraps up Rock.\n");
	        			loses++;
	        			games++;
	        			break;

	        		case "paper":
	        			System.out.println("Your Weapon: " + userChoice +"\nComputer's Weapon: " + compChoice + "\nWoah! Too much Paper! It's a tie!\n");
	        			ties++;
	        			games++;
	        			break;

	        		case "scissors":
	        			System.out.println("Your Weapon: " + userChoice +"\nComputer's Weapon: " + compChoice + "\nGot em! You win! Scissors cut up Paper!\n");
	        			wins++;
	        			games++;
	        			break;
	        	}
	        }

	        if (compChoice.equals("scissors")) {
	        	switch(userChoice) {
	        		case "rock":
	        			System.out.println("Your Weapon: " + userChoice +"\nComputer's Weapon: " + compChoice + "\nGot em! You win! Rock smashes up Scissors!\n");
	        			wins++;
	        			games++;
	        			break;

	        		case "paper":
	        			System.out.println("Your Weapon: " + userChoice +"\nComputer's Weapon: " + compChoice + "\nBummerrrrr. You lose :( Scissors cuts up paper!\n");
	        			loses++;
	        			games++;
	        			break;

	        		case "scissors":
	        			System.out.println("Your Weapon: " + userChoice +"\nComputer's Weapon: " + compChoice + "\nWoah! Too many sharp objects around here! It's a tie!\n");
	        			ties++;
	        			games++;
	        			break;
	        	}
	        }
	        
	       //Ask the user whether or not they would like a rematch with error catch
	        do {
	        	Scanner rematchChoice = new Scanner(System.in);
	        	
	        	System.out.println("Would you like a rematch? Please enter yes or no.");
	        	rematch = rematchChoice.nextLine().toLowerCase();	
	        	
	        	if(!rematch.equals("yes") && !rematch.equals("no")) {
	        		do {
	        			System.out.println("Whoops! You have to enter in yes or no! Would you like a rematch?");
	    	        	rematch = rematchChoice.nextLine().toLowerCase();
	        		} while(!rematch.equals("yes") && !rematch.equals("no"));
	        	}
	        	
	        	System.out.println();
	        } while(!rematch.equals("yes") && !rematch.equals("no"));
	        
	        
	        
        } while(rematch.equals("yes"));
        
      //Print out game statistics! 
	    System.out.println("Thanks for playing! Check out some of your statistics from the recent game(s):\n\nWins: " + wins + "\nTies: " + ties + "\nLoses: " + loses + "\nGames Played: " + games); 
	}
}
