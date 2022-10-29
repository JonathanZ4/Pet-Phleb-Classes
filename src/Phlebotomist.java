import java.util.*;

public class Phlebotomist {
    private int experience;
    private String location;
    private int sticksPerShift;

    public static void main(String[] args) {
        Phlebotomist nPhlebotomist = new Phlebotomist(2, "Vegas", 3);
        nPhlebotomist.setLocation("NewOrleans");
        nPhlebotomist.setExperience(20);
        nPhlebotomist.setSticksPerShift(5);
        System.out.println(nPhlebotomist.getLocation());
        System.out.println(nPhlebotomist.getSticksPerShift());
        System.out.println(nPhlebotomist.getExperience());
    }

        public Phlebotomist() {

        }

        public Phlebotomist( int pExperience, String pLocation) {
            this.experience = pExperience;
            this.location = pLocation;
            this.sticksPerShift = 7;
        }

        public Phlebotomist( int pExperience, String pLocation,int pSticksPerShift){
            this.experience = pExperience;
            this.location = pLocation;
            this.sticksPerShift = pSticksPerShift;
        }

        public void setExperience (int yearsExperience){
            this.experience = yearsExperience;
        }
        public void setLocation (String newLocation){
            this.location = newLocation;
        }
        public void setSticksPerShift ( int morningSticksPerShift){
            this.sticksPerShift = morningSticksPerShift;
        }

        public int getExperience () {
            return experience;
        }
        public String getLocation () {
            return location;
        }
        public int getSticksPerShift () {
            return sticksPerShift;
        }


}
