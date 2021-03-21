package seedu.fridgefriend.food.categories;

import seedu.fridgefriend.exception.InvalidDateException;
import seedu.fridgefriend.food.Food;
import seedu.fridgefriend.food.FoodCategory;
import seedu.fridgefriend.food.FoodStorageLocation;

public class Other extends Food {

    public Other(FoodCategory category, String foodName, String expiryString,
                 FoodStorageLocation storageLocation) throws InvalidDateException {
        super(category, foodName, expiryString, storageLocation);
    }
}
