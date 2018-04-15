//Emily Schwarz
//This holds basic information about the earth type companion

public class Earth {
    private String earthTypeStats ="Gaia's HP is 100, and her main attack is"
        + " Earthquake.";
    private int earthLevel;
    private static int earthLevelCounter = 5;
   
    public String getEarthTypeStats() {
      return earthTypeStats;
    }
    public void setEarthTypeStats(String earthTypeStats) {
      this.earthTypeStats = earthTypeStats;
  }
    
    public Earth() {
      earthLevel = ++earthLevelCounter;
    }
    
    public int getEarthLevel() {
      return earthLevel;
    }
}

