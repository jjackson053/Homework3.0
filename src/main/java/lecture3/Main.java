package lecture3;

public class Main {
    public static void main(String[] args) {
        Artist rapper = new Artist();
        rapper.setSongs(new String[]{"headlines", "fancy", "100"});
        rapper.setName("drake");
        rapper.setAlbums(2);
        System.out.println(rapper.songArray());
    }
}
