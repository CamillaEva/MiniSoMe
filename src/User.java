import java.util.ArrayList;

public class User {

    private String brugernavn;
    private ArrayList<User> venneliste;
    private ArrayList<Post> opslagsliste;



    public User(String brugernavn) {
        this.brugernavn = brugernavn;
        this.venneliste = new ArrayList<>();
        this.opslagsliste = new ArrayList<>();
    }


    public void addFriend(User user) {
        if (!venneliste.contains(user)){
            venneliste.add(user);
        }
    }


    public void createPost(String content) {
        opslagsliste.add(new Post(content, this));
    }


    public ArrayList<User> getVenneliste() {
        return venneliste;
    }

    public ArrayList<Post> getOpslagsliste() {
        return opslagsliste;
    }

    public String getBrugernavn() {
        return brugernavn;
    }

}
