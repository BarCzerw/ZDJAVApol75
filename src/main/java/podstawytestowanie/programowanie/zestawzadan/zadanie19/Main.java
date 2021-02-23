package podstawytestowanie.programowanie.zestawzadan.zadanie19;

public class Main {

    public static void main(String[] args) {

        Author[] writters = new Author[3];
        writters[0] = new Author("Shakespeare", "British");
        writters[1] = new Author("Molier", "French");
        writters[2] = new Author("Machiavelli", "Italian");

        Poem[] poems = new Poem[6];

        poems[0] = new Poem(writters[0], 120);
        poems[1] = new Poem(writters[1], 24);
        poems[2] = new Poem(writters[2], 48);
        poems[3] = new Poem(writters[2], 62);
        poems[4] = new Poem(writters[1], 48);
        poems[5] = new Poem(writters[2], 12);

        System.out.println(findLongestPoemAuthor(poems));
        System.out.println(findAuthorOfMostTotalStrophesWritten(poems));

    }

    static Author findLongestPoemAuthor(Poem[] poems) {

        Poem longestPoem = poems[0];

        for (int i = 1; i < poems.length; i++) {
            if (poems[i].getStropheCount() > longestPoem.getStropheCount()) {
                longestPoem = poems[i];
            }
        }

        return longestPoem.getAuthor();
    }

    static Author findAuthorOfMostTotalStrophesWritten(Poem[] poems){

        Author[] authors = new Author[poems.length];
        int authorsCount = 0;

        for (Poem p :
                poems) {
            if(!contains(p.getAuthor(),authors)){
                authors[authorsCount++]=p.getAuthor();
            }
        }

        int[] totalStrophesWritten = new int[authorsCount];

        for (Poem p :
                poems) {
            for (int i = 0; i < authorsCount; i++) {
                if (p.getAuthor()==authors[i]){
                    totalStrophesWritten[i]+=p.getStropheCount();
                    break;
                }
            }
        }

        long mostStrophies=0;
        int authorIndex=-1;

        for (int i = 0; i < totalStrophesWritten.length; i++) {
            if (totalStrophesWritten[i]>mostStrophies){
                mostStrophies=totalStrophesWritten[i];
                authorIndex=i;
            }
        }

        return authors[authorIndex];
    }

    static boolean contains(Author author, Author[] authors){
        for (Author at :
                authors) {
            if (at==author){
                return true;
            }
        }
        return false;
    }


}
