package sample;

/**
 * Created by GREEN on 13.11.2016.
 */
public class MapFacade implements Facade {
    private GameMap map;
    MapFacade(){
        map = new GameMap();
    }
    MapFacade(int[][] labyrinth, Coords[] trapBonus) {
        map = new GameMap();
        map.setLabyrinth(labyrinth);
        map.setTrapBonus(trapBonus);
    }
    public void setMap(int[][] labyrinth, Coords[] trapBonus) {
        map.setLabyrinth(labyrinth);
        map.setTrapBonus(trapBonus);
    }
    public GameMap getMap() {
        return map;
    }
}
