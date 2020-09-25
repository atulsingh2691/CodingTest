package com.java.singtel;

import java.util.ArrayList;
import java.util.List;

import com.java.singtel.base.animal.Animal;
import com.java.singtel.base.animal.impl.Bird;
import com.java.singtel.base.animal.impl.Butterfly;
import com.java.singtel.base.animal.impl.Cat;
import com.java.singtel.base.animal.impl.Chicken;
import com.java.singtel.base.animal.impl.Dog;
import com.java.singtel.base.animal.impl.Duck;
import com.java.singtel.base.animal.impl.Parrot;
import com.java.singtel.base.animal.impl.Rooster;
import com.java.singtel.base.animal.impl.RoosterDelegation;
import com.java.singtel.base.fish.impl.Clownfish;
import com.java.singtel.base.fish.impl.Dolphin;
import com.java.singtel.base.fish.impl.Shark;

public class MainSolution {

	public static void main(String[] args) {
		System.out.println("----------------DUCK----------------");
		Animal myDuck =  new Duck();
		myDuck.walk();
		myDuck.fly();
		myDuck.sing();
		System.out.println("----------------CHICKEN----------------");
		Animal myChicken =  new Chicken();
		myChicken.walk();
		myChicken.fly();
		myChicken.sing();
		System.out.println("----------------ROOSTER----------------");
		Animal myRooster =  new Rooster();
		myRooster.walk();
		myRooster.fly();
		myRooster.sing();
		System.out.println("----------------ROOSTER DELEGATION ----------------");
		RoosterDelegation myRoosterDel =  new RoosterDelegation();
		myRoosterDel.walk();
		myRoosterDel.fly();
		myRoosterDel.sing();
		System.out.println("----------------PARROT LIVING WITH DOGS----------------");
		Parrot myParrotwithDogs =  new Parrot();
		myParrotwithDogs.livingWith(new Dog());
		myParrotwithDogs.walk();
		myParrotwithDogs.fly();
		myParrotwithDogs.sing();
		System.out.println("----------------PARROT LIVING WITH CATS----------------");
		Parrot myParrotwithCats =  new Parrot();
		myParrotwithCats.livingWith(new Cat());
		myParrotwithCats.walk();
		myParrotwithCats.fly();
		myParrotwithCats.sing();
		System.out.println("----------------PARROT LIVING WITH ROOSTERS----------------");
		Parrot myParrotWithRoosters =  new Parrot();
		myParrotWithRoosters.livingWith(new Rooster());
		myParrotWithRoosters.walk();
		myParrotWithRoosters.fly();
		myParrotWithRoosters.sing();
	    System.out.println("----------------PARROT LIVING WITH DUCKS----------------");
		Parrot myParrotWithDucks =  new Parrot();
		myParrotWithDucks.livingWith(new Duck());
		myParrotWithDucks.walk();
		myParrotWithDucks.fly();
		myParrotWithDucks.sing();
		 System.out.println("----------------SHARK----------------");
	   Shark mySFish = new Shark();
	   mySFish.fly();
	   mySFish.sing();
	   mySFish.walk();
	   mySFish.swim();
	   mySFish.colour();
	   mySFish.eat();
	   mySFish.makeJokes();
	   System.out.println("----------------CLOWNFISH----------------");
	   Clownfish myCFish = new Clownfish();
	   myCFish.fly();
	   myCFish.sing();
	   myCFish.walk();
	   myCFish.swim();
	   myCFish.colour();
	   myCFish.eat();
	   myCFish.makeJokes();
	   System.out.println("----------------DOLPHIN----------------");
	   Dolphin dolphin = new Dolphin();
	   dolphin.hasFishBehaviour(new Shark());
	   dolphin.fly();
	   dolphin.sing();
	   dolphin.swim();
	   dolphin.walk();
	   System.out.println("----------------BUTTERFLY----------------");
	   Butterfly myButterFly =  new Butterfly();
	   myButterFly.setCaterpiller(false);
	   myButterFly.fly();
	   myButterFly.sing();
	   myButterFly.walk();
	   System.out.println("----------------CATERPILLAR----------------");
	   Butterfly myCaterpillar =  new Butterfly();
	   myCaterpillar.setCaterpiller(true);
	   myCaterpillar.fly();
	   myCaterpillar.sing();
	   myCaterpillar.walk();
	   System.out.println("----------------Animal Count----------------");
	   Animal[] animals = new Animal[]{
			   new Bird(),
			   new Duck(),
			   new Chicken(),
			   new Rooster(),
			   new Parrot(),
			   new Shark(),
			   new Clownfish(),
			   new Dog(),
			   new Butterfly(),
			   new Cat()
			   };
	   int countFlying = 0 ;
	   int countWalk = 0 ;
	   int countSing = 0 ;
	   int countSwim = 0 ;
	   for (Animal animal : animals) {
		   System.out.println(animal.getClass().getName() + "---count start--------------------");
		   if(animal.fly())
			   countFlying++;
		    if(animal.walk())
			   countWalk++;
		    if(animal.sing())
			   countSing++;
		    if(animal.swim())
			   countSwim++;
		    System.out.println("------------------------count end---------------------");
	}
	   System.out.println("Number of Animals that can fly: " + countFlying);
	   System.out.println("Number of Animals that can walk: " + countWalk);
	   System.out.println("Number of Animals that can sing: " + countSing);
	   System.out.println("Number of Animals that can swim: " + countSwim);
	   System.out.println("---------------------------Test Language- ROOSTER--------------------"); 
	   
	   Rooster myRstr = new Rooster();
	   List<String> arrayList = new ArrayList<String>(){{
		    add("English");
	        add("Danish");
	        add("Dutch");
	        add("Finnish");
	        add("French");
	        add("German");
	        add("Greek");
	        add("Hebrew");
	        add("Hungarian");
	        add("Italian");
	        add("Japanese");
	        add("Portuguese");
	        add("Russian");
	        add("Swedish");
	        add("Turkish");
	        add("Urdu");
		}}; 
		
		for (String lang : arrayList) {
			myRstr.sing(lang);
		}
	}

}
