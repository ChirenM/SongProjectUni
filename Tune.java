import java.util.Scanner;
import java.util.Iterator;

import java.util.ArrayList;

public class Tune {

    private ArrayList<Song>songs = new ArrayList<Song>();
    public Tune ()

    {
        songs.add(new Song("Travis Scott", "Sicko Mode", 2000000000));
        songs.add(new Song("Vybz Kartel", "Fever", 85000000));
        songs.add(new Song("WizKid", "Essence", 4470000));
        songs.add(new Song("Lil Baby", "Freestyle", 58570000));
        songs.add(new Song("D-block Europe", "Overseas", 162000000));
        songs.add(new Song("Travis Scott", "Trance", 2000000));
        songs.add(new Song("Central Cee", "Loading", 50000000));
        songs.add(new Song("Drake", "Passionfruit", 900000000));
        songs.add(new Song("The Weeknd", "Popular", 367400000));
        songs.add(new Song("Burna Boy", "City Boys", 68500000));
        }

public void addSong()

    {
        Scanner Scanner = new Scanner (System.in);

        System.out.println("What is the name of the artist you want to add?");

        String artist = Scanner.nextLine();

        System.out.println("What is the name of the song you wish to add?");

        String title = Scanner.nextLine();

        System.out.println("How many plays does this song have?");

        int playCount = Scanner.nextInt();

        Song newSongs = new Song (artist, title, playCount);

        songs.add(newSongs);
        System.out.println("Your chosen song has been added");

        }

public void removeSong()
    {
    Scanner scanner = new Scanner (System.in);

    System.out.println("What is the name of the artist you want to remove?");

    String removeArtist = scanner.nextLine();

    System.out.println("What is the title of the song you would like to remove?");

    String removeTitle = scanner.nextLine();

    Iterator<Song> iterator = songs.iterator();

    while (iterator.hasNext()) {
        Song currentSong = iterator.next();
        if (currentSong.getartist().equals(removeArtist) | currentSong.gettitle().equals(removeTitle)) 
        {
    iterator.remove();
    System.out.println("Your chosen song has been removed.");

    break;
        }


            }
     }



public void printSong()
    {
    System.out.println("Here is the list of all your songs");
    for(Song printSong : songs)

        {
        System.out.println(" artist: " + printSong.getartist() + " title: " + printSong.gettitle() + " streams: " + printSong.getstreams());
        }
    }

public void GivenPlays()
    {
    Scanner scanner = new Scanner(System.in);

    System.out.println("What is the minimum number of streams you want to enter?");
    int streams = scanner.nextInt();
    System.out.println("These are all the songs that have a larger number of streams: ");

    for(Song givenPlays : songs)
        {
        if(givenPlays.getstreams() > streams)

            {
            System.out.println(" Artist " + givenPlays.getartist() + " Title " + givenPlays.gettitle() + " Streams " + givenPlays.getstreams());
            }
        }
    }
        }   


