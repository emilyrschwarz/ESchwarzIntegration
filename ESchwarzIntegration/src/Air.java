//Emily Schwarz
//This holds basic information about the air type companion

/**
 * @author ersch
 *
 */
public class Air {
  private String airTypeStats = "Azure's HP is 100, and his main attack is"
      + " Tornado.";
  private int airLevel;
  private static int airLevelCounter = 5;

  public String getAirTypeStats() {
    return airTypeStats;
  }

  public void setAirTypeStats(String airTypeStats) {
    this.airTypeStats = airTypeStats;
  }

  public static int airLevel() {
    int airLevel = ++airLevelCounter;
    return airLevel;
  }

  public int getAirLevel() {
    return airLevel;
  }

}
