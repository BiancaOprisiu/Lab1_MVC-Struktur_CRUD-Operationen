import java.util.Scanner;
public class GameView {

    public static Game readGameDetails(){
        Scanner in = new Scanner(System.in);
        Game game = new Game();

        game.setName("MyGame");
        game.setId("1981374");
        game.setCategory("RPG");

        System.out.println("Game Name: ");
        String GameName = in.nextLine();
        System.out.println("Game ID: ");
        String GameId = in.nextLine();
        System.out.println("Game Category: ");
        String GameCategory = in.nextLine();


        game.setName(GameName);
        game.setId(GameId);
        game.setCategory(GameCategory);
        return game;
    }
    public void printGameDetails(String GameName, String GameId, String GameCategory){
        System.out.println("Game Details: ");
        System.out.println("Name: " + GameName);
        System.out.println("Game ID: " + GameId);
        System.out.println("Game Category: " + GameCategory);
        System.out.println(" ");
    }
}
