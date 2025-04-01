class Room{
    private String type;

    public Room(String type){
        this.type = type;
    }

    public void showRoom(){
        System.out.println("Room type: " + this.type);
    }
}

class House{
    private Room[] rooms;

    public House(){
        this.rooms = new Room[3];
        this.rooms[0] = new Room("Bedroom");
        this.rooms[1] = new Room("Kitchen");
        this.rooms[2] = new Room("Bathroom"); 
    }

    public void showRooms(){
        for (Room room : rooms){
            room.showRoom();
        }
    }
}
class main{
    public static void main(String[] args){
        House house = new House();
        house.showRooms();
    }
}