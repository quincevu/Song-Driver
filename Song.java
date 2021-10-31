/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songdriver;
import java.text.*;
import java.util.Scanner;

/**
 *
 * @author Quang Vu
 */
public class Song {
    Scanner input = new Scanner(System.in);
    private String title;
    private String artist;
    private String album;
    private int tracknum;
    private int year;
    public Song(String title,String artist,String album, int tracknum, int year){
        this.title=title;
        this.artist=artist;
        this.album=album;
        this.tracknum=tracknum;
        this.year=year;
    }
    public String toString(){
        String description;
        description = String.format("%-20s", title)
        + String.format("%-20s", artist) + String.format("%-20s", album)
        + String.format("%-5s", tracknum) + String.format("%-20s", year) + "\n";
        
        return description;
    }
}
