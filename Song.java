public class Song {
    private String artist;
private String title;
private int streams;

public Song (String artist, String title, int streams)
{
    this.artist = artist;
this.title = title;
this.streams = streams;}
public String getartist() {return artist;}
public String gettitle() {return title;}
public int getstreams() {return streams;}

public void setartist(String artist) {this.artist=artist;}
public void settitle(String title) {this.title=title;}
public void setstreams(int streams) {this.streams=streams;}
}
