package com.company;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
	// write your code here
        Album album = new Album("Strom", "Deep Purple");
        album.addSong("Strombringer", 4.6);
        album.addSong("Tum se hi", 4.22);
        album.addSong("Jeen Jeena", 2.55);
        album.addSong("skjdvnksdjfnvc", 4.6);
        album.addSong("Tdcsdcsdci", 4.22);
        album.addSong("kamdckdckndsJeena", 2.55);

        albums.add(album);

        album = new Album("Rock", "AC/DC");
        album.addSong("Sadda haq", 5.55);
        album.addSong("Tum ho", 4.22);
        album.addSong("sdcsdc", 2.55);
        album.addSong("dkjfvkdfmvkdfmvkdmfv", 4.6);
        album.addSong("psldcksdocmsdimc", 4.22);
        album.addSong("jqwjsqjwsqwsqw", 2.55);

        albums.add(album);


        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Tum se hi",playList);
        albums.get(0).addToPlayList("Jeen Jeena",playList);
        albums.get(0).addToPlayList("Jee",playList);

        albums.get(0).addToPlayList(5,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(4,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(15,playList);

        play(playList);



    }



    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        ListIterator<Song> listIterator = playList.listIterator();
        boolean quit = false;
        boolean forwared = true;
        if(playList.size() == 0){
            System.out.println("No Songs in the playlist");
            return;
        }else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }


        while (!quit){
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("PLaylist is complete");
                    quit = true;
                    break;

                case 1:
                    if(!forwared){
                        if (listIterator.hasNext()){
                            listIterator.next();
                        }
                        forwared = true;
                    }

                    if(listIterator.hasNext()){
                        System.out.println("Now playing" + listIterator.next().toString());
                    }else {
                        System.out.println("We have reached the end of the play list");
                        forwared = false;
                                            }
                    break;

                case 2:
                    if(forwared){
                        if (listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forwared = false;
                    }

                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing" + listIterator.previous().toString());
                    }else {
                        System.out.println("We are at the start of the play list");
                        forwared = true;

                        break;
                    }
                case 3:
                    if (forwared){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous().toString());
                            forwared = false;
                        }else {
                            System.out.println("We are at the start of list");
                        }
                    }else {
                        if(listIterator.hasNext()){
                            System.out.println("Now playing " + listIterator.next().toString());
                            forwared = true;
                        }else {
                            System.out.println("We are at the end of list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playList.size() > 0){
                        listIterator.remove();
                        if (listIterator.hasNext()){
                            System.out.println("Now playing" + listIterator.next());
                        }
                        else if(listIterator.hasPrevious()){
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;

            }
        }
    }

    public static void printMenu(){
        System.out.println("Available actions \n press");
        System.out.println("0 - to quit \n " +
                "1: to play next song \n" +
                "2: to play previous song \n" +
                "3: to replay the current song \n" +
                "4: list the songs in the playlist \n" +
                "5: Print available actions\n" +
                "6: delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("===========================");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("===========================");

    }
}
