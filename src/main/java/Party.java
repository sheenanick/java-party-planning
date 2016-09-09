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
    mFood = food.toLowerCase();
    mBeverages = beverages.toLowerCase();
    mEntertainment = entertainment.toLowerCase();
  }

  public int calculateCost() {
    if (mFood.equals("full course")) {
      mFoodCost = 75;
    } else if (mFood.equals("light meal")) {
      mFoodCost = 15;
    } else {
      mFoodCost = 5;
    }

    if (mBeverages.equals("full bar")) {
      mBeverageCost = 50;
    } else if (mBeverages.equals("light refreshments")) {
      mBeverageCost = 5;
    } else {
      mBeverageCost = 2;
    }

    if (mEntertainment.equals("live band")) {
      mEntertainmentCost = 2000;
    } else if (mEntertainment.equals("dj")) {
      mEntertainmentCost = 1000;
    } else {
      mEntertainmentCost = 5;
    }

    int partyCost = ((mFoodCost + mBeverageCost) * mNumOfGuests + mEntertainmentCost);
    return partyCost;
  }

}
