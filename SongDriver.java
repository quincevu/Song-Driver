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
public class SongDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many songs for this playlist? ");
        int count; count = input.nextInt();
        PlayList Playlist= new PlayList(count);
        System.out.print(Playlist);
    }
    
}
