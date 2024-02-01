# Space Shooting Game

## Overview
This is a simple Space Shooting Game developed in Java using the Eclipse IDE. The game features a player-controlled spaceship that can move in different directions using the arrow keys (Up, Down, Left, Right) and ASDW keys. The objective is to shoot down incoming enemy spaceships while avoiding collisions.

## Setup
1. **Clone the Repository:**
   ```
   git clone https://github.com/gokulaarimuthu/Space-Shooting-Game.git
   cd space-shooting-game
   ```

2. **Import Project in Eclipse:**
   - Open Eclipse IDE
   - File -> Import -> General -> Existing Projects into Workspace
   - Select the cloned project directory as the root directory
   - Click Finish

3. **Run the Game:**
   - Find the `Main.java` file in the project
   - Right-click on `Main.java` -> Run As -> Java Application

4. **Controls:**
   - Arrow Keys: Move spaceship (Up, Down, Left, Right)
   - A and D Keys: Move spaceship Left and Right
   - W and S Keys: Move spaceship Up and Down
   - Spacebar: Fire bullets to destroy enemy spaceships

## Code Structure
The code is organized into several classes to maintain a clean and modular structure. Here are the main classes:

- **GameWindow.java:** Contains the main game loop and initializes the game window.
- **Player.java:** Represents the player-controlled spaceship, handles movement, and shooting.
- **Enemy.java:** Represents the enemy spaceship, includes methods for movement and spawning.
- **Bullet.java:** Represents the bullets fired by the player to destroy enemy spaceships.

Feel free to explore the code and make modifications or enhancements.

## Contributing
If you'd like to contribute to the development of this game, please follow these steps:

1. Fork the repository.
2. Create a new branch for your feature: `git checkout -b feature-name`
3. Implement your feature and test thoroughly.
4. Commit your changes: `git commit -m "Implement feature-name"`
5. Push to your fork: `git push origin feature-name`
6. Create a pull request to the main repository.

## License
This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments
Special thanks to the open-source community for providing valuable resources and inspiration for game development in Java.
