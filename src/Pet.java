import java.util.*;

public class Pet {

    private String zName;
    private int zAge;
    private String zLocation;
    private String zType;

    public static void main(String[] args) {
       Pet zPet = new Pet("Shebo", 3, "Vallejo", "Dobermann" );
       zPet.setZName("Corbin");
       zPet.setZAge(15);
       zPet.setZlocation("Miami");
       zPet.setZType("Pitbull");
       System.out.println(zPet.getZName());
       System.out.println(zPet.getZAge());
       System.out.println(zPet.getZLocation());
       System.out.println(zPet.getZType());
    }


    public Pet() {

    }

    public Pet(String zuluName, int zuluAge, String zuluLocation, String zuluType) {
        this.zName = zuluName;
        this.zAge = zuluAge;
        this.zLocation = zuluLocation;
        this.zType = zuluType;
    }

    public void setZName(String newName) {
        this.zName = newName;
    }

    public void setZAge(int newAge) {
        this.zAge = newAge;
    }

    public void setZlocation(String newLocation) {
        this.zLocation = newLocation;
    }

    public void setZType(String newType) {
        this.zType = newType;
    }

    public String getZName() {
        return zName;
    }

    public int getZAge() {
        return zAge;
    }

    public String getZLocation() {
        return zLocation;
    }

    public String getZType() {
        return zType;
    }


}


