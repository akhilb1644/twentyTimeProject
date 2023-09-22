class Attraction{
  /* 
  - In txt, the order for dimensions are type, interest, subinterest, state
  - Number of parks included will be a one percent sample.
  - Index zero first dimension will have all names
  - Index one first dimension will have all coordinates from Google Maps
  */
  private String attractionName;
  private double[] attractionCoords = new double[2];
  private byte coordsRealLength = 0;
  private String[] attractionInterests = new String[5];
  private byte interestsRealLength = 0;
  private String[] attractionSubInterests = new String[10];
  private byte subInterestsRealLength = 0;
  private String[] attractionStates = new String[4];
  private byte attractionStatesRealLength = 0;

  public Attraction(String name, double[] coords, String interest, String subInterest, String state) {
    
  }
}
