//Emily Schwarz
//This holds basic information about the fire type companion

/**
 * @author ersch
 *
 */
public class Fire {
  private String fireTypeStats = "Ignatus' HP is 100, and his main attack is"
      + " Fire Blast.";
  private int fireLevel;
  private static int fireLevelCounter = 5;

  public String getFireTypeStats() {
    return fireTypeStats;
  }

  public void setFireTypeStats(String fireTypeStats) {
    this.fireTypeStats = fireTypeStats;
  }

  public static int fireLevel() {
    int fireLevel = ++fireLevelCounter;
    return fireLevel;
  }

  public int getFireLevel() {
    return fireLevel;
  }
}
