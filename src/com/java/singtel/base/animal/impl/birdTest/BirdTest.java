package com.java.singtel.base.animal.impl.birdTest;

import com.java.singtel.base.animal.Animal;
import com.java.singtel.base.animal.impl.Cat;
import com.java.singtel.base.animal.impl.Chicken;
import com.java.singtel.base.animal.impl.Dog;
import com.java.singtel.base.animal.impl.Duck;
import com.java.singtel.base.animal.impl.Parrot;
import com.java.singtel.base.animal.impl.Rooster;
import com.java.singtel.base.animal.impl.RoosterDelegation;

public class BirdTest {

	public static void main(String[] args) { 
		Animal myDuck =  new Duck();
		myDuck.walk();
		myDuck.fly();
		myDuck.sing();
		Animal myChicken =  new Chicken();
		myChicken.walk();
		myChicken.fly();
		myChicken.sing();
		Animal myRooster =  new Rooster();
		myRooster.walk();
		myRooster.fly();
		myRooster.sing();
		
		RoosterDelegation myRoosterDel =  new RoosterDelegation();
		myRoosterDel.walk();
		myRoosterDel.fly();
		myRoosterDel.sing();
		Parrot myParrotwithDogs =  new Parrot();
		myParrotwithDogs.livingWith(new Dog());
		myParrotwithDogs.walk();
		myParrotwithDogs.fly();
		myParrotwithDogs.sing();
		
		Parrot myParrotwithCats =  new Parrot();
		myParrotwithCats.livingWith(new Cat());
		myParrotwithCats.walk();
		myParrotwithCats.fly();
		myParrotwithCats.sing();
		
		Parrot myParrotWithRoosters =  new Parrot();
		myParrotWithRoosters.livingWith(new Rooster());
		myParrotWithRoosters.walk();
		myParrotWithRoosters.fly();
		myParrotWithRoosters.sing();

		Parrot myParrotWithDucks =  new Parrot();
		myParrotWithDucks.livingWith(new Duck());
		myParrotWithDucks.walk();
		myParrotWithDucks.fly();
		myParrotWithDucks.sing();
	}

}
