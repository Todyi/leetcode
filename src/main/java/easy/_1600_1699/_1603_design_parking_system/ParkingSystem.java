package easy._1600_1699._1603_design_parking_system;

//Design a parking system for a parking lot. The parking lot has three kinds of
//parking spaces: big, medium, and small, with a fixed number of slots for each si
//ze.
//
// Implement the ParkingSystem class:
//
//
// ParkingSystem(int big, int medium, int small) Initializes object of the ParkingSystem class.
// The number of slots for each parking space are given as part of the constructor.
// bool addCar(int carType) Checks whether there is a parking space of carType for the car
// that wants to get into the parking lot. carType can be of three kinds: big, medium, or small,
// which are represented by 1, 2, and 3 respectively.
// A car can only park in a parking space of its carType. If there is no space available,
// return false, else park the car in that size space and return true.
//
//
//
// Example 1:
//
//
//Input
//["ParkingSystem", "addCar", "addCar", "addCar", "addCar"]
//[[1, 1, 0], [1], [2], [3], [1]]
//Output
//[null, true, true, false, false]
//
//Explanation
//ParkingSystem parkingSystem = new ParkingSystem(1, 1, 0);
//parkingSystem.addCar(1); // return true because there is 1 available slot for
//a big car
//parkingSystem.addCar(2); // return true because there is 1 available slot for
//a medium car
//parkingSystem.addCar(3); // return false because there is no available slot fo
//r a small car
//parkingSystem.addCar(1); // return false because there is no available slot fo
//r a big car. It is already occupied.
//
//
//
// Constraints:
//
//
// 0 <= big, medium, small <= 1000
// carType is 1, 2, or 3
// At most 1000 calls will be made to addCar
//
// Related Topics Design
// 👍 63 👎 29


//leetcode submit region begin(Prohibit modification and deletion)
class ParkingSystem {

  int[] parkingSlot = new int[3];

  public ParkingSystem(int big, int medium, int small) {
    parkingSlot[0] = big;
    parkingSlot[1] = medium;
    parkingSlot[2] = small;
  }

  public boolean addCar(int carType) {
    if (0 < parkingSlot[carType - 1]) {
      parkingSlot[carType - 1]--;
      return true;
    }
    return false;
  }
}

/**
 * Your ParkingSystem object will be instantiated and called as such: ParkingSystem obj = new
 * ParkingSystem(big, medium, small); boolean param_1 = obj.addCar(carType);
 */
//leetcode submit region end(Prohibit modification and deletion)

