public class BirdShelter {
    public void shelterSounds(Bird[] birdsOfTheShelter) {
        for (int i = 0; i < birdsOfTheShelter.length; i++) {
            birdsOfTheShelter[i].makeNoise();
        }
    }
}
