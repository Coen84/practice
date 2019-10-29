package p1;

    public class Dog {
        private String breed;
        private String nasme;

        public String getBreed() {
            return breed;
        }

        public Dog setBreed(String breed) {
            this.breed = breed;
            return this;
        }

        public String getNasme() {
            return nasme;
        }

        public Dog setNasme(String nasme) {
            this.nasme = nasme;
            return this;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "breed='" + breed + '\'' +
                    ", nasme='" + nasme + '\'' +
                    '}';
        }
    }

