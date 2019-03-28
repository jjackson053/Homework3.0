package lecture3;

public class Artist {
    private String[] songs;
    private int albums;
    private String name;

    public String[] getSongs(){
        return this.songs;
    }
    public int getAlbums(){
        return albums;
    }
    public String getName(){
        return name;
    }
    public void setSongs(String[] songs){
        this.songs =songs;
    }
    public void setAlbums(int albums){
        this.albums = albums;
    }
    public void setName(String name){
        this.name = name;
    }


    public String songArray(){
        for(String i: songs){
            return songs[Integer.parseInt(i)];
        }

        return name;}

    public Artist(){
    }

    public Artist(String songs[], int albums, String name){
        this.name =name;
        this.albums = albums;
        this.songs = songs;
    }







}
