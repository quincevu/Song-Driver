/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package songdriver;
import java.util.Scanner;

/**
 *
 * @author Quang Vu
 */
public class PlayList{
    int dem = 3;int count=0;int num;
    Song PlayList[] = new Song[dem];
    Scanner input=new Scanner(System.in);
    public PlayList(int num){
        this.num=num;
        for(int i=0;i<num;i++){
            addSong();
        }
    }
    private void addSong(){
        if(count==dem){
            increaseSize();
        }
        int count1=count+1;
        System.out.println("Enter metadata for song "+count1+" :");
        System.out.print("Song Title: ");
        String title;title=input.nextLine();
        if(count>0)
            title=input.nextLine();
        System.out.print("Artist: ");
        String artist;artist=input.nextLine();
        System.out.print("Album: ");
        String album;album=input.nextLine();
        System.out.print("Track number: ");
        int tracknum;tracknum=input.nextInt();
        System.out.print("Year released: ");
        int year;year=input.nextInt();
        PlayList[count]= new Song(title,artist,album,tracknum,year);

        count++;
    }
    
    public String toString(){
        String k= "\nMy playlist\n";
        for(int i=0;i<count;i++){
            k=k+PlayList[i];
        }
        
        return k;
    }
    
    
    private void increaseSize(){
        dem=dem*2;
    }
}
