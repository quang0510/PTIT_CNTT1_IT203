package Session_7;

public class Bài6 {
    static class User{
        final int id;
        String username;
        String password;

        public User(int id, String username, String password) {
            this.id = id;
            this.username = username;
            this.password = password;
        }
    }

    static class UserManager{
        static User[] users = new User[10];

        static public void addUser(User user){
            users[user.id] = user;
        }

        static public void searchUser(int id){
            for (User user : users) {
                if(user != null){
                    if (user.id == id) {
                        System.out.println("User : ");
                        System.out.println("id : " + user.id);
                        System.out.println("username : " + user.username);
                        System.out.println("password : " + user.password);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        User user1 = new User(1,"nguyen van a","12345678");
        User user2 = new User(2,"nguyen van b","12345678");
        User user3 = new User(3,"nguyen van c","12345678");
        User user4 = new User(4,"nguyen van d","12345678");

        UserManager.addUser(user1);
        UserManager.addUser(user2);
        UserManager.addUser(user3);
        UserManager.addUser(user4);

        UserManager.searchUser(2);
    }

}
