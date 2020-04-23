public class Smileyface {
    private final String eyes;

    private Smileyface(SmileyFaceBuilder builder) {
        this.eyes = builder.eyes;
    }

    public static class SmileyFaceBuilder {

        private String eyes;

        public SmileyFaceBuilder eyes(String eyes){
            this.eyes = eyes;
            return this;
        }

        public Smileyface build() {
            if(this.eyes == null) throw new MissingEyesException();
            return new Smileyface(this);
        }
    }
}
