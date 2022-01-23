package com.infinit.ron.assignment;

import com.infinit.ron.assignment.helper.AnimalCount;
import com.infinit.ron.assignment.helper.SingHelper;
import com.infinit.ron.assignment.helper.SingHelperImpl;
import com.infinit.ron.assignment.model.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.StringContains.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class AssignmentApplicationTests {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;

	@BeforeAll
	public static void setUp() {
		System.out.println("@BeforAll - Executes");
	}

	@BeforeEach
	public void init() {
		System.out.println("@BeforeEach - Executes");
		System.setOut(new PrintStream(outContent));
	}

	@AfterEach
	void restoreStreams() {
		System.setOut(originalOut);
	}

	@Test
	void walk() {

		new Bird().walk();
		assertThat(outContent.toString(), containsString("I am walking"));
		new Chicken().walk();
		assertThat(outContent.toString(), containsString("I am walking"));
		new Duck().walk();
		assertThat(outContent.toString(), containsString("I am walking"));
		new Rooster().walk();
		assertThat(outContent.toString(), containsString("I am walking"));
		new Butterfly().walk();
		assertThat(outContent.toString(), containsString("I am walking"));
	}

	@Test
	void fly() {
		new Duck().fly();
		assertThat(outContent.toString(), containsString("flying"));
		new Parrot().fly();
		assertThat(outContent.toString(), containsString("flying"));
		new Butterfly().fly();
		assertThat(outContent.toString(), containsString("flying"));

		new Butterfly().fly();
		assertThat(outContent.toString(), containsString("I cant Fly"));
		new Butterfly().transform();

		new Butterfly().fly();
		assertThat(outContent.toString(), containsString("flying"));
	}

	@Test
	void sing() {
		new Bird().sound();
		assertThat(outContent.toString(), containsString("I am singing"));
		new Duck().sound();
		assertThat(outContent.toString(), containsString("Quack, quack"));
		new Chicken().sound();
		assertThat(outContent.toString(), containsString("Cluck, cluck"));

		new Chicken(new SingHelperImpl(SoundEnum.CHICKEN)).sound();
		assertThat(outContent.toString(), containsString("Cluck, cluck"));
		new Rooster().sound();
		assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));

		new Dog(new SingHelperImpl(SoundEnum.DOG)).sing();;
		assertThat(outContent.toString(), containsString("Woof, woof"));
		new Cat(new SingHelperImpl(SoundEnum.CAT)).sing();
		assertThat(outContent.toString(), containsString("Meow"));

		new Parrot().sound();
		assertThat(outContent.toString(), containsString("I am singing"));
		new Parrot(new SingHelperImpl(SoundEnum.DOG)).sound();
		assertThat(outContent.toString(), containsString("Woof, woof"));
		new Parrot(new SingHelperImpl(SoundEnum.CAT)).sound();
		assertThat(outContent.toString(), containsString("Meow"));
		new Parrot(new SingHelperImpl(SoundEnum.ROOSTER)).sound();
		assertThat(outContent.toString(), containsString("Cock-a-doodle-doo"));

		new Butterfly().sing();
		assertThat(outContent.toString(), containsString("caterpillar"));
		new Butterfly().transform();
		new Butterfly().sing();
		assertThat(outContent.toString(), containsString(""));


	}

	@Test
	void swim() {
		new Duck().swim();
		assertThat(outContent.toString(), containsString("I am swimming"));
		new Fish().swim();
		assertThat(outContent.toString(), containsString("I am swimming"));
		new Dolphin().swim();
		assertThat(outContent.toString(), containsString("I am swimming"));
	}


	@Test
	void bodyColor() {
		assertEquals(new Fish().color(), "");
		assertEquals(new Shark().color(), "grey");
		assertEquals(new Clownfish().color(), "orange");

	}

	@Test
	void bodySize() {
		assertEquals(new Fish().size(), "");
		assertEquals(new Shark().size(), "large");
		assertEquals(new Clownfish().size(), "small");
	}

	@Test
	void extraFishTest() {
		new Shark().canEat();
		assertThat(outContent.toString(), containsString("I eat fish"));
		new Clownfish().makeJoke();
		assertThat(outContent.toString(), containsString("I make jokes"));
	}

	@Test
	void CountingAnimals() {

		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fish(),
				new Shark(),
				new Clownfish(),
				new Dolphin(),
				new Frog(),
				new Dog(),
				new Butterfly(),
				new Cat()
		};
		AnimalCount animalCount = new AnimalCount(animals);

		assertEquals(animalCount.getFlyingAnimal(), 6);
		assertEquals(animalCount.getWalkingAnimal(), 9);
		assertEquals(animalCount.getSpeakingAnimal(), 9);
		assertEquals(animalCount.getSwimingAnimal(), 6);


	}

}
