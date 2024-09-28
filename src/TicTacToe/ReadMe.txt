/* Have a general flow of your application ready before you start the actual coding
 * Flow is noting but the structure of your code so that you can work on top of that
 *
 * Step 1 - Create your models:
 * Models are the entities that are supposed to be in your DB tables.
 * This step is generally about converting the class diagram to actual classes.
 *
 * /* -------------------------------------------------------------------------------------------------------------- */
 *
 * Step 2 - Get your controller and client classes ready. Setup a basic interaction with the client:
 * Client class is needed here because there is no REST API or input provided.
 * In this case, our interaction will be through the Command Line Interface (CLI).
 *
 * To set up the controller, you need to know all the things for which the client might come to you.
 * For getting this, you need to know the whole procedure of the game.
 *
 * /* -------------------------------------------------------------------------------------------------------------- */
 *
 * Flow of the game:
 * 1. Start the game: creation of the game, setting the attributes, taking input from the client
 *
 * while(gameState = IN_PROGRESS) {
 *      2. Display the board
 *      3. Make the move: takes the i/p, makes the move, checks for winner, update the gameState if winner is found
 * }
 *
 * 4. check the state
 *      if(gameState == SUCCESS) {
 *              5. getWinner()
 *              6. display the winner
 * }
 *      else if(gameState == DRAW) {
 *              7. declare the draw
 * }
 *
 * /* -------------------------------------------------------------------------------------------------------------- */
 *
 * Step 3 - Make sure the constructors are written for every class. If left blank, we'll get NPE
 *
 * Step 4 - Implement the functionalities one by one.
 *
   /* if someone else also wants to play the game, they cannot play with the same controller.
    * they have to create a new GameController object.
    *
    * When we go to a restaurant, for every new client, we will not create / generate a new waiter.
    *
    * So, it is not good to have multiple game controllers for each and every game.
    * GameController do not have any state, attributes.
    * It just takes care of calling the correct functions at the right time.
    * So, we need not create a new game controller for every game.
    *
    * The issue happened because, the game object is included in the GameController.
    */

   /* -------------------------------------------------------------------------------------------------------------- */
 * Undo():
 * Possibility 1: If the winner is found, we should not be asking if the players want to undo.
 * Possibility 2: If we are asking for undo even after a winner is found, we should reverse the state as well.
 *
 * /* -------------------------------------------------------------------------------------------------------------- */
 * Implement the project from scratch by yourself.
 * Try to add new features
 * Convert this to a SpringBoot project
 * Add frontend as well to showcase it in your projects.
 */