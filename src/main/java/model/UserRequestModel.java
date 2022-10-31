package model;

public class UserRequestModel {
    private String name;
    private String surname;
    private String job;
    private int socialCredits;
    private String favoriteGame;
    private String favoriteSong;

    public UserRequestModel(String name, String surname, String job, int socialCredits, String favoriteGame, String favoriteSong) {
        this.name = name;
        this.surname = surname;
        this.job = job;
        this.socialCredits = socialCredits;
        this.favoriteGame = favoriteGame;
        this.favoriteSong = favoriteSong;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJob() {
        return job;
    }
    public void setJob(String job) {
        this.job = job;
    }

    public int getSocialCredits() {
        return socialCredits;
    }
    public void setSocialCredits(int socialCredits) {
        this.socialCredits = socialCredits;
    }

    public String getFavoriteGame() {
        return favoriteGame;
    }
    public void setFavoriteGame(String favoriteGame) {
        this.favoriteGame = favoriteGame;
    }

    public String getFavoriteSong() {
        return favoriteSong;
    }
    public void setFavoriteSong(String favoriteSong) {
        this.favoriteSong = favoriteSong;
    }
}
