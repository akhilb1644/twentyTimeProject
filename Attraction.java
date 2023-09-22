class Attraction{
  /* 
  - In txt, the order for dimensions are type, interest, subinterest, state
  - Number of parks included will be a one percent sample.
  - Index zero first dimension will have all names
  - Index one first dimension will have all coordinates from Google Maps
  */
  private String attractionName;
  private double[] attractionCoords = new double[2];
  private String[] attractionInterests = new String[5];
  private byte interestsRealLength = 0;
  private String[] attractionSubInterests = new String[10];
  private byte subInterestsRealLength = 0;
  private String[] attractionStates = new String[4];
  private byte statesRealLength = 0;

  public Attraction(String name, double[] coords) {
    attractionName = name;
    attractionCoords = coords;
  }

  public void addInterest(String interest) {
    attractionInterests[interestsRealLength] = interest;
    interestsRealLength += 1;
  }

  public void addSubInterest(String subInterest) {
    attractionSubInterests[subInterestsRealLength] = subInterest;
    subInterestsRealLength += 1;
  }

  public void addState(String state) {
    attractionStates[attractionStatesRealLength] = state;
    statesRealLength += 1;
  }
}
