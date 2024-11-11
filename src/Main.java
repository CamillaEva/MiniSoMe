public class Main {

    public static void main(String[] args) {

        SocialNetwork socialNetwork = new SocialNetwork();

        User cami = new User("cami");
        User kasp = new User("Kasper");
        User lærk = new User("lærke");


        socialNetwork.addUser(cami);
        socialNetwork.addUser(kasp);
        socialNetwork.addUser(lærk);

        kasp.addFriend(cami);
        kasp.addFriend(lærk);

        cami.createPost("i'm going home");
        lærk.createPost("host host, i'm sick");

        cami.getOpslagsliste().get(0).like();
        lærk.getOpslagsliste().get(0).like();

        System.out.println("kaspers friends' posts:\n");
        socialNetwork.showFriendsPosts(kasp);



    }


}
