//Emily Schwarz
//This holds basic information about the earth type companion

/**
 * @author ersch
 *
 */
public class Earth {
  private String earthTypeStats = "Gaia's HP is 100, and her main attack is"
      + " Earthquake.";
  private int earthLevel;
  private static int earthLevelCounter = 5;

  public String getEarthTypeStats() {
    return earthTypeStats;
  }

  public void setEarthTypeStats(String earthTypeStats) {
    this.earthTypeStats = earthTypeStats;
  }

  public static int earthLevel() {
    int earthLevel = ++earthLevelCounter;
    return earthLevel;
  }

  public int getEarthLevel() {
    return earthLevel;
  }
}
