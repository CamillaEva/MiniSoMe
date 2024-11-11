public class Post {

    private String content;
    private User author;
    private int likes;


    public Post(String content, User author) {
        this.content = content;
        this.author = author;
        this.likes = 0;
    }


    public void like() {
        likes++;
    }


    public void getPost() {
        System.out.println("auhtor: " + author.getBrugernavn());
        System.out.println("content: " + content);
        System.out.println("likes: " + likes);
        System.out.println();
    }


}
