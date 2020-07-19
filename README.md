# ItsCoronaTime Project

This project was worked on by me and two other group members: Nikhil Shan and Luis Ramos.
The files that I focused on were ItsCoronaTime.java and Person.java.
The rest of the files in this reposity were done by my other group members.
In this project I created, designed, and implmented all the graphics in the game. I was also responsible for implementing all the sound and music.
The main file that runs the program is ItsCoronaTime.java. In that file I was resposible for creating the player movement, the hit dection, allowing the player to pick up all the entities, the scoreboard, lives, and hazmat timer display, and the hazmat suit powerup.
My other group members were responsible for creating the virus, the AI for the virus, and the placement of the toilet paper and hazmat suit. 
The game was initially designed to be played at a rate of 10FPS. This was done by having the entities move at 10 pixels every 0.1 seconds. I have updated the code to make the game play at a much smoother 50FPS. This was done by having the entities move 2 pixels every 0.02 seconds, but because the game was initially designed to be played with a movement of 10 pixels, the 2 pixel movement causes some clipping into the walls.
