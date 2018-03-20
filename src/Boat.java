

public abstract class Boat {
    private int team;
    private Coordinates location;
    private int direction;
    private int health;
    private int strength;
    private int vision;

    //TO DO check coordinates in coordinates class if they are valid
    public Boat(int team, Coordinates location, int direction, int health, int strength, int vision){
        this.team = team;
        this.location = location; //CHECK COORDINATES IT ITS VALID
        this.direction = direction;
        this.health = health;
        this.strength = strength;
        this.vision = vision;

    }

    public int getTeam() {
        return team;
    }

    public Coordinates getLocation() {
        return location;
    }

    public int getDirection() {
        return direction;
    }

    public int getHealth() {
        return health;
    }

    public int getStrength() {
        return strength;
    }

    public int getVision() {
        return vision;
    }

    public abstract String getID();

    public abstract String act(int[] userChoices, World world);

    public abstract String getActions();

    //TO DO
    public String move(World world){
        return "null";
    }

    //TO DO
    public String turn(int number){
        return "turn";
    }

    public String takeHit(int number){
        return "takeHit";
    }

    public void setLocation(Coordinates coordinates){

    }

    public String toString(){
        return "toString";
    }
}
