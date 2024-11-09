package com.example.demo.book_my_show;

import java.util.ArrayList;
import java.util.List;

public class BookMyShowApp {
    List<Cinema> cinemas;
    Catalog catalog;

    public BookMyShowApp() {
        cinemas = new ArrayList<>();
        catalog = new Catalog();
    }

    public static void fun() {
        BookMyShowApp bookMyShowApp = new BookMyShowApp();
        bookMyShowApp.initialise();

        // features
        bookMyShowApp.searchMovieByTitle("AVENGER");
        // todo createBooking(), displayAvailableSeats()
    }

    void createBooking(){}


    // features
    void searchMovieByTitle(String title) {
        List<Movie> movies=catalog.searchByTitle(title);
        System.out.println(movies);
    }

    void initialise() {
        createMovies();
        createCinema();
    }

    void createMovies() {
        Movie avenger = new Movie();
        avenger.setMovieId(1);
        avenger.setTitle("AVENGER");
//        avenger.setDuration(120);

        //create movie 2
        Movie bahubali = new Movie();
        bahubali.setMovieId(1);
        bahubali.setTitle("BAHUBALI");
//        bahubali.setDuration(120);
        catalog.addMovie(avenger);
        catalog.addMovie(bahubali);
    }


    List<Hall> createHall() {
        List<Hall> screens = new ArrayList<>();
        Hall screen = new Hall();
        screen.setHallId(1);
        screen.setShows(createShow());
        screens.add(screen);
        return screens;
    }

    List<Show> createShow() {
        List<Show> screens = new ArrayList<>();
        Show screen = new Show();
        screen.setShowId(1);
        screen.setSeats(createSeats());
        screens.add(screen);
        return screens;
    }

    List<Seat> createSeats() {
        List<Seat> seats = new ArrayList<>();
        Seat seat = new Seat();
        seat.setSeatId(1);
        seat.setAvailable(true);
        seats.add(seat);
        Seat seat1 = new Seat();
        seat1.setSeatId(2);
        seat1.setAvailable(true);
        seats.add(seat1);
        return seats;
    }

    void createCinema() {
        Cinema inoxThreatre = new Cinema();
        inoxThreatre.setCinemaId(1);
        inoxThreatre.setHalls(createHall());
        inoxThreatre.setCity(City.Bangalore);
//
//        List<Show> inoxShows = new ArrayList<>();
//        Show inoxMorningShow = createShow(1, inoxThreatre.getScreenList().get(0), avengerMovie, 8);
//       Show inoxEveningShow = createShow(2, inoxThreatre.getScreenList().get(0), bahubaliMovie, 16);
//        inoxShows.add(inoxMorningShow);
//        inoxShows.add(inoxEveningShow);

        Cinema pvrThreatre = new Cinema();
        pvrThreatre.setCinemaId(1);
        pvrThreatre.setHalls(createHall());
        pvrThreatre.setCity(City.Delhi);

        cinemas.add(inoxThreatre);
        cinemas.add(pvrThreatre);

//        List<com.example.demo.book_my_show.Show> pvrShows = new ArrayList<>();
//        com.example.demo.book_my_show.Show pvrMorningShow = createShow(3, inoxThreatre.getScreenList().get(0), avengerMovie, 8);
//        Show pvrEveningShow = createShow(4, inoxThreatre.getScreenList().get(0), bahubaliMovie, 16);
//        pvrShows.add(pvrMorningShow);
//        pvrShows.add(pvrEveningShow);
    }
}
