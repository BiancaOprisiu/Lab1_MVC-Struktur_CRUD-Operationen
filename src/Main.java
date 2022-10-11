public class Main {
    public static void main(String[] args) {
        Game model2 = GameFromDatabase();
        GameView view = new GameView();

        Game model= GameView.readGameDetails();

        GameController controller = new GameController(model, view);

        controller.updateView();

        controller.setGameName("MyNewGame");

        controller.updateView();
    }
    private static Game GameFromDatabase(){
        Game game = new Game();

        game.setName("MyGame");
        game.setId("1981374");
        game.setCategory("RPG");
        return game;
    }
}