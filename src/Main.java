public class Main {
    public static void main(String[] args) {
        //Game model = retriveGameFromDatabase();

        GameView view = new GameView();
        Game model=view.readGameDetails();
        GameController controller = new GameController(model, view);

        controller.updateView();

        controller.setGameName("MyNewGame");

        controller.updateView();
    }
    private static Game retriveGameFromDatabase(){
        Game game = new Game();

        game.setName("MyGame");
        game.setId("1981374");
        game.setCategory("RPG");
        return game;
    }
}