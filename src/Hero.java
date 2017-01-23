/**
 * Created by George on 1/21/2017.
 */
public class Hero {

    private String name;
    private int healthPoints;
    private int strengthPoints;
    private int intelligencePoints;
    private int staminaPoints;

    public Hero() {
    }

    public Hero(String name, int healthPoints, int strengthPoints, int intelligencePoints, int staminaPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.strengthPoints = strengthPoints;
        this.intelligencePoints = intelligencePoints;
        this.staminaPoints = staminaPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getStrengthPoints() {
        return strengthPoints;
    }

    public void setStrengthPoints(int strengthPoints) {
        this.strengthPoints = strengthPoints;
    }

    public int getIntelligencePoints() {
        return intelligencePoints;
    }

    public void setIntelligencePoints(int intelligencePoints) {
        this.intelligencePoints = intelligencePoints;
    }

    public int getStaminaPoints() {
        return staminaPoints;
    }

    public void setStaminaPoints(int staminaPoints) {
        this.staminaPoints = staminaPoints;
    }
}
