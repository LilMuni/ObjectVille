public class GuessGame { // Lesson: Objectville -- Java Object-Oriented Program 
    Player p1; 
    Player p2;           // create three Player objects and assign them to the three Player instance variables
    Player p3;
    private boolean p1isRight;

    public void startGame() { 
        p1 = new Player(); 
        p2 = new Player();  // three player instance variables 
        p3 = new Player(); 

        int guessp1 = 0; 
        int guessp2 = 0;        // declare the three guessses the Players make
        int guessp3 = 0; 

        boolean plisRight = false; 
        boolean p2isRight = false;      // declare the three variables to hold a true or false based on the player's answer 
        boolean p3isRight = false; 

        final int targetNumber = (int) (Math.random() * 10);      // make a 'target' number that players have to guess (Math.random())
        System.out.println("I'm thinking of a number between 0 and 9..."); 

        while(true) {       // start loop
            System.out.println("Number to guess is " + targetNumber);
        

        p1.guess(); 
        p2.guess();     // call each player's guess method
        p3.guess(); 

        guessp1 = p1.number; 
        System.out.println("Player one guessed " + guessp1); 

        guessp2 = p2.number;                                    
        System.out.println("Player two guessed " + guessp2);  // get each player's guess(the result of their guess() method running)
                                                              // by accessing the number variable of each player
        guessp3 = p3.number; 
        System.out.println("Player three guessed " + guessp3); 
        
        if(guessp1 == targetNumber) { 
            p1isRight = true; 
        }
       
        if(guessp2 == targetNumber) {         // check each player's guess to see if it matches the target number 
            p2isRight = true;                 // if a player is right, then set that player's variable to be true
        }

        if(guessp3 == targetNumber) { 
            p3isRight = true; 
        }

        if (p1isRight || p2isRight || p3isRight) {  // if player on OR player two OR player three is right... (|| operator means or)
            System.out.println("We have a winner!");
            System.out.println("Player one got it right? " + p1isRight);
            System.out.println("Player two got it right? " + p2isRight);
            System.out.println("Player three got it right? " + p3isRight);
            System.out.println("Game Over");
            break; 
        } else {    // otherwise, stay in loop and ask the players to try again
            System.out.println("Players will have to try again!");
            }
        }
    }
}
 