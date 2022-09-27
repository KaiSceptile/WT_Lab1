package ClassesAndObjects.Task12to16;

    public class ProgrammerBook extends Book{
        private String language;
        private int level;

        public ProgrammerBook(String title, String author, int price, int edition, int isbn, String language,int level){
            super(title,author,price,edition,isbn);
            this.language=language;
            this.level=level;
        }

        @Override
        public boolean equals(Object o){
            ProgrammerBook pBook = (ProgrammerBook)o;
            return super.equals(pBook) && (pBook.level == level) && (pBook.language == language);
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + super.hashCode();
            result = prime * result + level;
            result = prime * result + ((language == null) ? 0 :language.hashCode());
            return result;
        }

        @Override
        public String toString() {
            return "Book [language=" + language
                    + ", level=" + level +"]";
        }
    }

