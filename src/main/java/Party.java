class Party {
  private int mNumOfGuests;
  private String mFood;
  private String mBeverages;
  private String mEntertainment;
  private int mFoodCost;
  private int mBeverageCost;
  private int mEntertainmentCost;

  public Party(int guests, String food, String beverages, String entertainment) {
    mNumOfGuests = guests;
    mFood = food;
    mBeverages = beverages;
    mEntertainment = entertainment;
  }

  public int calculateCost() {
    if (mFood.equals("full course")) {
      int mFoodCost = 75;
    } else if (mFood.equals("light meal")) {
      int mFoodCost = 15;
    } else {
      int mFoodCost = 5;
    }

    if (mBeverages.equals("full bar")) {
      int mBeverageCost = 50;
    } else if (mBeverages.equals("light refreshments")) {
      int mBeverageCost = 5;
    } else {
      int mBeverageCost = 2;
    }

    if (mEntertainment.equals("live band")) {
      int mEntertainmentCost = 2000;
    } else if (mEntertainment.equals("DJ")) {
      int mEntertainmentCost = 1000;
    } else {
      int mEntertainmentCost = 0;
    }

    int partyCost = ((mFoodCost + mBeverageCost) * mNumOfGuests + mEntertainmentCost);
    return 0;
  }

}
