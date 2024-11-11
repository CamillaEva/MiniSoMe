import java.util.ArrayList;

public class SocialNetwork {
    public ArrayList<User> brugere;


    public SocialNetwork() {
        this.brugere = new ArrayList<>();
    }


    public void addUser(User user) {
       if (!brugere.contains(user)){
           brugere.add(user);
       }
    }


    public void showFriendsPosts(User user) {
        for (User friend : user.getVenneliste()) {
            for (Post post : friend.getOpslagsliste()) {
                post.getPost();
            }
        }
    }


}
