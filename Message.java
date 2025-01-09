// Class representing a user
class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(String message, ChatRoom chatRoom) {
        System.out.println(name + " sends message: " + message);
        chatRoom.broadcastMessage(this, message); // Message passing to ChatRoom
    }
}

// Class representing a chat room
class ChatRoom {
    public void broadcastMessage(User sender, String message) {
        // Message passing: Handling the message from the user
        System.out.println("ChatRoom broadcasting: [" + sender.getName() + "] " + message);
    }
}

public class Message {
    public static void main(String[] args) {
        // Create a ChatRoom object
        ChatRoom chatRoom = new ChatRoom();

        // Create User objects
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Message passing between objects
        user1.sendMessage("Hello, everyone!", chatRoom);
        user2.sendMessage("Hi, Alice!", chatRoom);
    }
}
