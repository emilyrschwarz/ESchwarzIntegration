//Emily Schwarz
//This holds basic information about the water type companion

public class Water {
  private String waterTypeStats = "Cascadia's HP is 100, and her main attack is"
      + " Waterfall.";
  private int waterLevel;
  private static int waterLevelCounter = 5;
  
  //when something is static, that means that you don't need to 
  //create an instance of the class to access it
 
  public String getWaterTypeStats() {
    return waterTypeStats;
  }
  public void setWaterTypeStats(String waterTypeStats) {
    this.waterTypeStats = waterTypeStats;
  }
  
  public Water() {
    waterLevel = ++waterLevelCounter;
  }
  
  public int getWaterLevel() {
    return waterLevel;
  }
}
