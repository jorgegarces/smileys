public class Smileyface {
    private final String eyes;

    private Smileyface(SmileyFaceBuilder builder) {
        this.eyes = builder.eyes;
    }

    public static class SmileyFaceBuilder {

        private String eyes;

        public SmileyFaceBuilder eyes(String eyes){
            checkEyes(eyes);
            this.eyes = eyes;
            return this;
        }

        private void checkEyes(String eyes) {
            if (!eyes.equals(":") && !eyes.equals(";")) throw new InvalidEyesException();
        }

        public Smileyface build() {
            if(this.eyes == null) throw new MissingEyesException();
            return new Smileyface(this);
        }
    }
}
