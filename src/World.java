public class World {

    Object[][] map;
    public static String NORTH = "0";
    public static String NORTHEAST = "1";
    public static String SOUTHEAST = "3";
    public static String SOUTH = "4";
    public static String SOUTHWEST = "5";
    public static String WEST = "6";
    public static String NORTHWEST = "7";

    public World(int widthMap, int heightMap ) {
        int x = widthMap;
        if(widthMap < 4){
            x = 4;
        } else if (widthMap > 10){
            x = 10;
        }

        int y = heightMap;
        if(heightMap < 4){
            y = 4;
        } else if(heightMap > 10){
            y = 10;
        }

        this.map = new Object[x][y];
        for (int i=0;i<x;i++){
            for(int j=0; j<y; j++){
                map[i][j] = null;
            }
        }
    }

    public int getWidth(){
        return map.length;
    }

    public int getHeight(){
        return map[0].length;
    }

    //TO DO LATER
    public Object getOccupant(){
        return null;
    }

    //TO DO LATER
    public boolean isLocationValid(){
        return true;
    }

    //TO DO LATER
    public boolean isLocationOccupiad(){
        return true;
    }

    //TO DO LATER
    public boolean setOccupant(){
        return true;
    }

    //TO DO LATER
    public Object getAdjacentLocation(){
        return null;
    }

    //TO DO LATER
    public void drawTeamMap(Boat[] boats, int view){
        System.out.println("map");
    }




}
