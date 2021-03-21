package seedu.fridgefriend.food.categories;

import seedu.fridgefriend.exception.InvalidDateException;
import seedu.fridgefriend.food.Food;
import seedu.fridgefriend.food.FoodCategory;
import seedu.fridgefriend.food.FoodStorageLocation;

public class Frozen extends Food {

    public Frozen(String foodName, FoodCategory category, String expiryString,
                  FoodStorageLocation storageLocation) throws InvalidDateException {
        super(foodName, category, expiryString, storageLocation);
    }
}