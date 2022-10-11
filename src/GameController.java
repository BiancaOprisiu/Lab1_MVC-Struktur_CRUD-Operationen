public class GameController {
    private Game model;
    private GameView view;

    public GameController(Game model, GameView view){
        this.model = model;
        this.view = view;
    }

    public void setGameName(String name){
        model.setName(name);
    }
    public String getGameName(){
        return model.getName();
    }

    public void setGameId(String id){
        model.setId(id);
    }

    public String getGameId(){
        return model.getId();
    }

    public void setGameCategory(String category){
        model.setCategory(category);
    }

    public String getGameCategory(){
        return model.getCategory();
    }
    public void updateView(){
        view.printGameDetails(model.getName(), model.getId(), model.getCategory());
    }
}
