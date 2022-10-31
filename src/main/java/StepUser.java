import model.UserRequestModel;

public class StepUser {

    ApiUser apiUser = new ApiUser();

    public void createUser(String name, String surname, String job, int socialCredits, String favoriteGame, String favoriteSong) {
        UserRequestModel model = new UserRequestModel(name, surname, job, socialCredits, favoriteGame, favoriteSong);
        apiUser.createUser(model);
    }

}
