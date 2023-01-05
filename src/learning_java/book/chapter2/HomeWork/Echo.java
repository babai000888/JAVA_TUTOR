package learning_java.book.chapter2.HomeWork;

/*
 * Изменить программу из примера 2.1 таким образом, что бы она рассчитала расстояние до крупного обекта по времени
 * за которое вернется эхо. Так если хлопнуть в ладоши, то время за которое вернется эхо, будет равно времени прохождению звука
 * в прямом и обратном направлении.
 */
class Echo {
	public static void main(String[] args) {
		double sound;
		double dist;

		sound = 7.2 / 2;     // Расчитываем время за которое мы услышим эхо, разделив его на 2, узнаем время до объекта без его возврата к нам
		dist = 1100 * sound; // Расчитываем расстояние до объекта

		System.out.println("Расстояние до скалы равно " + dist + " фута");
	}
}