import org.testng.annotations.Test;

public class TestPost {
    StepUser stepUser = new StepUser();
    @Test
    public void firstTest(){
        stepUser.createUser("Nicolas","Somebody", "UnityDeveloper", 999,
                "Minecraft/Terraria", "AJR - World's Smallest Violin");
    }
}
